package net.emilsg.clutter.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class ToiletBlock extends SeatBlock{
    protected static final VoxelShape NORTH_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(5, 0, 5, 11, 6, 14),
            Block.createCuboidShape(4, 6, 3, 12, 8.5, 14),
            Block.createCuboidShape(4, 8, 12, 12, 14, 14),
            Block.createCuboidShape(5, 14, 12, 11, 16, 14)
    );
    protected static final VoxelShape EAST_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(2, 0, 5, 11, 6, 11),
            Block.createCuboidShape(2, 6, 4, 13, 8.5, 12),
            Block.createCuboidShape(2, 8, 4, 4, 14, 12),
            Block.createCuboidShape(2, 14, 5, 4, 16, 11)
    );
    protected static final VoxelShape SOUTH_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(5, 0, 2, 11, 6, 11),
            Block.createCuboidShape(4, 6, 2, 12, 8.5, 13),
            Block.createCuboidShape(4, 8, 2, 12, 14, 4),
            Block.createCuboidShape(5, 14, 2, 11, 16, 4)
    );
    protected static final VoxelShape WEST_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(5, 0, 5, 14, 6, 11),
            Block.createCuboidShape(3, 6, 4, 14, 8.5, 12),
            Block.createCuboidShape(12, 8, 4, 14, 14, 12),
            Block.createCuboidShape(12, 14, 5, 14, 16, 11)
    );

    public static final BooleanProperty OPEN = BooleanProperty.of("open");
    public static final BooleanProperty POWERED = Properties.POWERED;

    public ToiletBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)(this.stateManager.getDefaultState()).with(WATERLOGGED, false).with(OPEN, false).with(POWERED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(OPEN, POWERED);
        super.appendProperties(builder);
    }

    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        boolean bl = world.isReceivingRedstonePower(pos);
        if (!this.getDefaultState().isOf(sourceBlock) && bl != (Boolean)state.get(POWERED)) {
            if (bl != (Boolean)state.get(OPEN)) {
                world.playSound(null, pos, SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundCategory.BLOCKS, 1.0f, 0.8f);
                world.emitGameEvent((Entity)null, bl ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
            }

            world.setBlockState(pos, (BlockState)((BlockState)state.with(POWERED, bl)).with(OPEN, bl), 2);
        }

    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(world.isClient && player.getStackInHand(hand).isEmpty() && player.isSneaking()) return ActionResult.SUCCESS;

        if(!world.isClient && player.getStackInHand(hand).isEmpty() && player.isSneaking()) {
            world.setBlockState(pos, state.with(OPEN, !world.getBlockState(pos).get(OPEN)), Block.NOTIFY_ALL);
            world.playSound(null, pos, SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundCategory.BLOCKS, 1.0f, 0.8f);
            return ActionResult.SUCCESS;
        }

        return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction i = state.get(FACING);
        return switch (i) {
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case EAST -> EAST_SHAPE;
            case WEST -> WEST_SHAPE;
            default -> VoxelShapes.empty(); // return an empty shape if no matching direction is found
        };
    }

}