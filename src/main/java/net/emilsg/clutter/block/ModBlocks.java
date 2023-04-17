package net.emilsg.clutter.block;

import net.emilsg.clutter.Clutter;
import net.emilsg.clutter.block.custom.*;
import net.emilsg.clutter.util.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block WHITE_LAMP = registerBlock("white_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_LAMP = registerBlock("light_gray_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GRAY_LAMP = registerBlock("gray_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLACK_LAMP = registerBlock("black_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BROWN_LAMP = registerBlock("brown_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block RED_LAMP = registerBlock("red_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block ORANGE_LAMP = registerBlock("orange_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block YELLOW_LAMP = registerBlock("yellow_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIME_LAMP = registerBlock("lime_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GREEN_LAMP = registerBlock("green_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block CYAN_LAMP = registerBlock("cyan_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_LAMP = registerBlock("light_blue_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLUE_LAMP = registerBlock("blue_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PURPLE_LAMP = registerBlock("purple_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_LAMP = registerBlock("magenta_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PINK_LAMP = registerBlock("pink_lamp", new LampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(LampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block WHITE_ARMCHAIR = registerBlock("white_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL)), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_ARMCHAIR = registerBlock("light_gray_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_WOOL)), ModItemGroup.CLUTTER);
    public static final Block GRAY_ARMCHAIR = registerBlock("gray_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.GRAY_WOOL)), ModItemGroup.CLUTTER);
    public static final Block BLACK_ARMCHAIR = registerBlock("black_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.BLACK_WOOL)), ModItemGroup.CLUTTER);
    public static final Block BROWN_ARMCHAIR = registerBlock("brown_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.BROWN_WOOL)), ModItemGroup.CLUTTER);
    public static final Block RED_ARMCHAIR = registerBlock("red_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.RED_WOOL)), ModItemGroup.CLUTTER);
    public static final Block ORANGE_ARMCHAIR = registerBlock("orange_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.ORANGE_WOOL)), ModItemGroup.CLUTTER);
    public static final Block YELLOW_ARMCHAIR = registerBlock("yellow_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.YELLOW_WOOL)), ModItemGroup.CLUTTER);
    public static final Block LIME_ARMCHAIR = registerBlock("lime_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.LIME_WOOL)), ModItemGroup.CLUTTER);
    public static final Block GREEN_ARMCHAIR = registerBlock("green_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.GREEN_WOOL)), ModItemGroup.CLUTTER);
    public static final Block CYAN_ARMCHAIR = registerBlock("cyan_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.CYAN_WOOL)), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_ARMCHAIR = registerBlock("light_blue_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_WOOL)), ModItemGroup.CLUTTER);
    public static final Block BLUE_ARMCHAIR = registerBlock("blue_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.BLUE_WOOL)), ModItemGroup.CLUTTER);
    public static final Block PURPLE_ARMCHAIR = registerBlock("purple_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.PURPLE_WOOL)), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_ARMCHAIR = registerBlock("magenta_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.MAGENTA_WOOL)), ModItemGroup.CLUTTER);
    public static final Block PINK_ARMCHAIR = registerBlock("pink_armchair", new ArmchairBlock(FabricBlockSettings.copy(Blocks.PINK_WOOL)), ModItemGroup.CLUTTER);
    public static final Block WHITE_BUNK_BED = registerBlock("white_bunk_bed", new BunkBedBlock(DyeColor.WHITE, FabricBlockSettings.copy(Blocks.WHITE_BED)), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_BUNK_BED = registerBlock("light_gray_bunk_bed", new BunkBedBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.copy(Blocks.LIGHT_GRAY_BED)), ModItemGroup.CLUTTER);
    public static final Block GRAY_BUNK_BED = registerBlock("gray_bunk_bed", new BunkBedBlock(DyeColor.GRAY, FabricBlockSettings.copy(Blocks.GRAY_BED)), ModItemGroup.CLUTTER);
    public static final Block BLACK_BUNK_BED = registerBlock("black_bunk_bed", new BunkBedBlock(DyeColor.BLACK, FabricBlockSettings.copy(Blocks.BLACK_BED)), ModItemGroup.CLUTTER);
    public static final Block BROWN_BUNK_BED = registerBlock("brown_bunk_bed", new BunkBedBlock(DyeColor.BROWN, FabricBlockSettings.copy(Blocks.BROWN_BED)), ModItemGroup.CLUTTER);
    public static final Block RED_BUNK_BED = registerBlock("red_bunk_bed", new BunkBedBlock(DyeColor.RED, FabricBlockSettings.copy(Blocks.RED_BED)), ModItemGroup.CLUTTER);
    public static final Block ORANGE_BUNK_BED = registerBlock("orange_bunk_bed", new BunkBedBlock(DyeColor.ORANGE, FabricBlockSettings.copy(Blocks.ORANGE_BED)), ModItemGroup.CLUTTER);
    public static final Block YELLOW_BUNK_BED = registerBlock("yellow_bunk_bed", new BunkBedBlock(DyeColor.YELLOW, FabricBlockSettings.copy(Blocks.YELLOW_BED)), ModItemGroup.CLUTTER);
    public static final Block LIME_BUNK_BED = registerBlock("lime_bunk_bed", new BunkBedBlock(DyeColor.LIME, FabricBlockSettings.copy(Blocks.LIME_BED)), ModItemGroup.CLUTTER);
    public static final Block GREEN_BUNK_BED = registerBlock("green_bunk_bed", new BunkBedBlock(DyeColor.GREEN, FabricBlockSettings.copy(Blocks.GREEN_BED)), ModItemGroup.CLUTTER);
    public static final Block CYAN_BUNK_BED = registerBlock("cyan_bunk_bed", new BunkBedBlock(DyeColor.CYAN, FabricBlockSettings.copy(Blocks.CYAN_BED)), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_BUNK_BED = registerBlock("light_blue_bunk_bed", new BunkBedBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.copy(Blocks.LIGHT_BLUE_BED)), ModItemGroup.CLUTTER);
    public static final Block BLUE_BUNK_BED = registerBlock("blue_bunk_bed", new BunkBedBlock(DyeColor.BLUE, FabricBlockSettings.copy(Blocks.BLUE_BED)), ModItemGroup.CLUTTER);
    public static final Block PURPLE_BUNK_BED = registerBlock("purple_bunk_bed", new BunkBedBlock(DyeColor.PURPLE, FabricBlockSettings.copy(Blocks.PURPLE_BED)), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_BUNK_BED = registerBlock("magenta_bunk_bed", new BunkBedBlock(DyeColor.MAGENTA, FabricBlockSettings.copy(Blocks.MAGENTA_BED)), ModItemGroup.CLUTTER);
    public static final Block PINK_BUNK_BED = registerBlock("pink_bunk_bed", new BunkBedBlock(DyeColor.PINK, FabricBlockSettings.copy(Blocks.PINK_BED)), ModItemGroup.CLUTTER);


    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3.0f).requiresTool().mapColor(MapColor.DEEPSLATE_GRAY), UniformIntProvider.create(4, 8)), ModItemGroup.CLUTTER);
    public static final Block SILVER_DOOR = registerBlock("silver_door", new DoorBlock(FabricBlockSettings.of(Material.METAL, MapColor.LIGHT_GRAY).requiresTool().strength(3.0f).sounds(BlockSoundGroup.METAL).nonOpaque(), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN), ModItemGroup.CLUTTER);
    public static final Block SILVER_ORE = registerBlock("silver_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(4, 8)), ModItemGroup.CLUTTER);
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new Block(FabricBlockSettings.copy(Blocks.RAW_GOLD_BLOCK).mapColor(MapColor.LIGHT_GRAY)), ModItemGroup.CLUTTER);
    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).mapColor(MapColor.LIGHT_GRAY)), ModItemGroup.CLUTTER);
    public static final Block SILVER_BUTTON = registerBlock("silver_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.STONE_BUTTON), 80, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON), ModItemGroup.CLUTTER);

    public static final Block SILVER_CHAIN = registerBlock("silver_chain", new ChainBlock(FabricBlockSettings.copy(Blocks.CHAIN)), ModItemGroup.CLUTTER);
    public static final Block SILVER_LANTERN = registerBlock("silver_lantern", new LanternBlock(FabricBlockSettings.copy(Blocks.LANTERN)), ModItemGroup.CLUTTER);
    public static final Block SILVER_SOUL_LANTERN = registerBlock("silver_soul_lantern", new LanternBlock(FabricBlockSettings.copy(Blocks.SOUL_LANTERN)), ModItemGroup.CLUTTER);
    public static final Block SILVER_TRAPDOOR = registerBlock("silver_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR), SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN), ModItemGroup.CLUTTER);

    public static final Block COPPER_BARS = registerBlock("copper_bars", new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL, MapColor.ORANGE).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.COPPER)), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_COPPER_BARS = registerBlock("exposed_copper_bars", new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.of(Material.METAL, MapColor.TERRACOTTA_LIGHT_GRAY).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.COPPER)), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_COPPER_BARS = registerBlock("weathered_copper_bars", new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.of(Material.METAL, MapColor.DARK_AQUA).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.COPPER)), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_COPPER_BARS = registerBlock("oxidized_copper_bars", new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.of(Material.METAL, MapColor.TEAL).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.COPPER)), ModItemGroup.CLUTTER);

    public static final Block COPPER_BUTTON = registerBlock("copper_button", new OxidizableButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.STONE_BUTTON), 10, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_COPPER_BUTTON = registerBlock("exposed_copper_button", new OxidizableButtonBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.STONE_BUTTON), 20, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_COPPER_BUTTON = registerBlock("weathered_copper_button", new OxidizableButtonBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.STONE_BUTTON), 30, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_COPPER_BUTTON = registerBlock("oxidized_copper_button", new OxidizableButtonBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.STONE_BUTTON), 40, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON), ModItemGroup.CLUTTER);

    public static final Block COPPER_CHAIN = registerBlock("copper_chain", new OxidizableChainBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.CHAIN)), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_COPPER_CHAIN = registerBlock("exposed_copper_chain", new OxidizableChainBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.CHAIN)), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_COPPER_CHAIN = registerBlock("weathered_copper_chain", new OxidizableChainBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.CHAIN)), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_COPPER_CHAIN = registerBlock("oxidized_copper_chain", new OxidizableChainBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.CHAIN)), ModItemGroup.CLUTTER);

    public static final Block COPPER_DOOR = registerBlock("copper_door", new OxidizableDoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL, MapColor.ORANGE).requiresTool().strength(5.0f).sounds(BlockSoundGroup.METAL).nonOpaque(), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_COPPER_DOOR = registerBlock("exposed_copper_door", new OxidizableDoorBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.of(Material.METAL, MapColor.TERRACOTTA_LIGHT_GRAY).requiresTool().strength(5.0f).sounds(BlockSoundGroup.METAL).nonOpaque(), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_COPPER_DOOR = registerBlock("weathered_copper_door", new OxidizableDoorBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.of(Material.METAL, MapColor.DARK_AQUA).requiresTool().strength(5.0f).sounds(BlockSoundGroup.METAL).nonOpaque(), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_COPPER_DOOR = registerBlock("oxidized_copper_door", new OxidizableDoorBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.of(Material.METAL, MapColor.TEAL).requiresTool().strength(5.0f).sounds(BlockSoundGroup.METAL).nonOpaque(), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN), ModItemGroup.CLUTTER);

    public static final Block COPPER_LANTERN = registerBlock("copper_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.LANTERN)), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_COPPER_LANTERN = registerBlock("exposed_copper_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.LANTERN)), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_COPPER_LANTERN = registerBlock("weathered_copper_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.LANTERN)), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_COPPER_LANTERN = registerBlock("oxidized_copper_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.LANTERN)), ModItemGroup.CLUTTER);
    public static final Block COPPER_SOUL_LANTERN = registerBlock("copper_soul_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.SOUL_LANTERN)), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_COPPER_SOUL_LANTERN = registerBlock("exposed_copper_soul_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.SOUL_LANTERN)), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_COPPER_SOUL_LANTERN = registerBlock("weathered_copper_soul_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.SOUL_LANTERN)), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("oxidized_copper_soul_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.SOUL_LANTERN)), ModItemGroup.CLUTTER);

    public static final Block COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate", new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE), SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_COPPER_PRESSURE_PLATE = registerBlock("exposed_copper_pressure_plate", new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.EXPOSED, PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE), SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_COPPER_PRESSURE_PLATE = registerBlock("weathered_copper_pressure_plate", new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.WEATHERED, PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE), SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock("oxidized_copper_pressure_plate", new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.OXIDIZED, PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE), SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block COPPER_TRAPDOOR = registerBlock("copper_trapdoor", new OxidizableTrapdoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR), SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_COPPER_TRAPDOOR = registerBlock("exposed_copper_trapdoor", new OxidizableTrapdoorBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR), SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_COPPER_TRAPDOOR = registerBlock("weathered_copper_trapdoor", new OxidizableTrapdoorBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR), SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_COPPER_TRAPDOOR = registerBlock("oxidized_copper_trapdoor", new OxidizableTrapdoorBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR), SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN), ModItemGroup.CLUTTER);

    public static final Block WAXED_COPPER_BARS = registerBlock("waxed_copper_bars", new PaneBlock(FabricBlockSettings.copy(ModBlocks.COPPER_BARS)), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_COPPER_BARS = registerBlock("waxed_exposed_copper_bars", new PaneBlock(FabricBlockSettings.copy(ModBlocks.EXPOSED_COPPER_BARS)), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_COPPER_BARS = registerBlock("waxed_weathered_copper_bars", new PaneBlock(FabricBlockSettings.copy(ModBlocks.WEATHERED_COPPER_BARS)), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_COPPER_BARS = registerBlock("waxed_oxidized_copper_bars", new PaneBlock(FabricBlockSettings.copy(ModBlocks.OXIDIZED_COPPER_BARS)), ModItemGroup.CLUTTER);

    public static final Block WAXED_COPPER_BUTTON = registerBlock("waxed_copper_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.STONE_BUTTON), 10, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_COPPER_BUTTON = registerBlock("waxed_exposed_copper_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.STONE_BUTTON), 20, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_COPPER_BUTTON = registerBlock("waxed_weathered_copper_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.STONE_BUTTON), 30, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_COPPER_BUTTON = registerBlock("waxed_oxidized_copper_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.STONE_BUTTON), 40, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON), ModItemGroup.CLUTTER);

    public static final Block WAXED_COPPER_CHAIN = registerBlock("waxed_copper_chain", new ChainBlock(FabricBlockSettings.copy(ModBlocks.COPPER_CHAIN)), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_COPPER_CHAIN = registerBlock("waxed_exposed_copper_chain", new ChainBlock(FabricBlockSettings.copy(ModBlocks.EXPOSED_COPPER_CHAIN)), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_COPPER_CHAIN = registerBlock("waxed_weathered_copper_chain", new ChainBlock(FabricBlockSettings.copy(ModBlocks.WEATHERED_COPPER_CHAIN)), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_COPPER_CHAIN = registerBlock("waxed_oxidized_copper_chain", new ChainBlock(FabricBlockSettings.copy(ModBlocks.OXIDIZED_COPPER_CHAIN)), ModItemGroup.CLUTTER);

    public static final Block WAXED_COPPER_DOOR = registerBlock("waxed_copper_door", new DoorBlock(FabricBlockSettings.copy(ModBlocks.COPPER_DOOR), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_COPPER_DOOR = registerBlock("waxed_exposed_copper_door", new DoorBlock(FabricBlockSettings.copy(ModBlocks.EXPOSED_COPPER_DOOR), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_COPPER_DOOR = registerBlock("waxed_weathered_copper_door", new DoorBlock(FabricBlockSettings.copy(ModBlocks.WEATHERED_COPPER_DOOR), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_COPPER_DOOR = registerBlock("waxed_oxidized_copper_door", new DoorBlock(FabricBlockSettings.copy(ModBlocks.OXIDIZED_COPPER_DOOR), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN), ModItemGroup.CLUTTER);

    public static final Block WAXED_COPPER_LANTERN = registerBlock("waxed_copper_lantern", new LanternBlock(FabricBlockSettings.copy(Blocks.LANTERN)), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_COPPER_LANTERN = registerBlock("waxed_exposed_copper_lantern", new LanternBlock(FabricBlockSettings.copy(Blocks.LANTERN)), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_COPPER_LANTERN = registerBlock("waxed_weathered_copper_lantern", new LanternBlock(FabricBlockSettings.copy(Blocks.LANTERN)), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_COPPER_LANTERN = registerBlock("waxed_oxidized_copper_lantern", new LanternBlock(FabricBlockSettings.copy(Blocks.LANTERN)), ModItemGroup.CLUTTER);
    public static final Block WAXED_COPPER_SOUL_LANTERN = registerBlock("waxed_copper_soul_lantern", new LanternBlock(FabricBlockSettings.copy(Blocks.SOUL_LANTERN)), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_COPPER_SOUL_LANTERN = registerBlock("waxed_exposed_copper_soul_lantern", new LanternBlock(FabricBlockSettings.copy(Blocks.SOUL_LANTERN)), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_COPPER_SOUL_LANTERN = registerBlock("waxed_weathered_copper_soul_lantern", new LanternBlock(FabricBlockSettings.copy(Blocks.SOUL_LANTERN)), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("waxed_oxidized_copper_soul_lantern", new LanternBlock(FabricBlockSettings.copy(Blocks.SOUL_LANTERN)), ModItemGroup.CLUTTER);

    public static final Block WAXED_COPPER_PRESSURE_PLATE = registerBlock("waxed_copper_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copy(ModBlocks.COPPER_PRESSURE_PLATE), SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_COPPER_PRESSURE_PLATE = registerBlock("waxed_exposed_copper_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copy(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE), SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_COPPER_PRESSURE_PLATE = registerBlock("waxed_weathered_copper_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copy(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE), SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock("waxed_oxidized_copper_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copy(ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE), SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block WAXED_COPPER_TRAPDOOR = registerBlock("waxed_copper_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR), SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_COPPER_TRAPDOOR = registerBlock("waxed_exposed_copper_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR), SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_COPPER_TRAPDOOR = registerBlock("waxed_weathered_copper_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR), SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_COPPER_TRAPDOOR = registerBlock("waxed_oxidized_copper_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR), SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN), ModItemGroup.CLUTTER);

    public static final Block GOLDEN_BUTTON = registerBlock("golden_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.STONE_BUTTON),20, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON), ModItemGroup.CLUTTER);
    public static final Block GOLDEN_CHAIN = registerBlock("golden_chain", new ChainBlock(FabricBlockSettings.copy(Blocks.CHAIN)), ModItemGroup.CLUTTER);
    public static final Block GOLDEN_DOOR = registerBlock("golden_door", new DoorBlock(FabricBlockSettings.copy(Blocks.IRON_DOOR), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN), ModItemGroup.CLUTTER);
    public static final Block GOLDEN_LANTERN = registerBlock("golden_lantern", new LanternBlock(FabricBlockSettings.copy(Blocks.LANTERN)), ModItemGroup.CLUTTER);
    public static final Block GOLDEN_SOUL_LANTERN = registerBlock("golden_soul_lantern", new LanternBlock(FabricBlockSettings.copy(Blocks.SOUL_LANTERN)), ModItemGroup.CLUTTER);
    public static final Block GOLDEN_TRAPDOOR = registerBlock("golden_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR), SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN), ModItemGroup.CLUTTER);

    public static final Block IRON_BUTTON = registerBlock("iron_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.STONE_BUTTON),60, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON), ModItemGroup.CLUTTER);

    public static final Block ANDESITE_CHIMNEY = registerBlock("andesite_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.ANDESITE_WALL)), ModItemGroup.CLUTTER);
    public static final Block BLACKSTONE_CHIMNEY = registerBlock("blackstone_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE_WALL)), ModItemGroup.CLUTTER);
    public static final Block BRICK_CHIMNEY = registerBlock("brick_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL)), ModItemGroup.CLUTTER);
    public static final Block COBBLESTONE_CHIMNEY = registerBlock("cobblestone_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE_WALL)), ModItemGroup.CLUTTER);
    public static final Block DEEPSLATE_BRICK_CHIMNEY = registerBlock("deepslate_brick_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICK_WALL)), ModItemGroup.CLUTTER);
    public static final Block DEEPSLATE_TILE_CHIMNEY = registerBlock("deepslate_tile_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_TILE_WALL)), ModItemGroup.CLUTTER);
    public static final Block DIORITE_CHIMNEY = registerBlock("diorite_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.DIORITE_WALL)), ModItemGroup.CLUTTER);
    public static final Block END_STONE_BRICK_CHIMNEY = registerBlock("end_stone_brick_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.END_STONE_BRICK_WALL)), ModItemGroup.CLUTTER);
    public static final Block GRANITE_CHIMNEY = registerBlock("granite_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.GRANITE_WALL)), ModItemGroup.CLUTTER);
    public static final Block MOSSY_STONE_BRICK_CHIMNEY = registerBlock("mossy_stone_brick_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.MOSSY_STONE_BRICK_WALL)), ModItemGroup.CLUTTER);
    public static final Block MUD_BRICK_CHIMNEY = registerBlock("mud_brick_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.MUD_BRICK_WALL)), ModItemGroup.CLUTTER);
    public static final Block NETHER_BRICK_CHIMNEY = registerBlock("nether_brick_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICK_WALL)), ModItemGroup.CLUTTER);
    public static final Block POLISHED_BLACKSTONE_BRICK_CHIMNEY = registerBlock("polished_blackstone_brick_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_WALL)), ModItemGroup.CLUTTER);
    public static final Block RED_NETHER_BRICK_CHIMNEY = registerBlock("red_nether_brick_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.RED_NETHER_BRICK_WALL)), ModItemGroup.CLUTTER);
    public static final Block STONE_BRICK_CHIMNEY = registerBlock("stone_brick_chimney", new ChimneyBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL)), ModItemGroup.CLUTTER);

    public static final Block OAK_WALL_BOOKSHELF = registerBlock("oak_wall_bookshelf", new WallBookshelfBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(WallBookshelfBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OAK_WINDOW_SILL = registerBlock("oak_window_sill", new WindowSillBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block SPRUCE_WALL_BOOKSHELF = registerBlock("spruce_wall_bookshelf", new WallBookshelfBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).luminance(WallBookshelfBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block SPRUCE_WINDOW_SILL = registerBlock("spruce_window_sill", new WindowSillBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block BIRCH_WALL_BOOKSHELF = registerBlock("birch_wall_bookshelf", new WallBookshelfBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).luminance(WallBookshelfBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block BIRCH_WINDOW_SILL = registerBlock("birch_window_sill", new WindowSillBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block JUNGLE_WALL_BOOKSHELF = registerBlock("jungle_wall_bookshelf", new WallBookshelfBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).luminance(WallBookshelfBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block JUNGLE_WINDOW_SILL = registerBlock("jungle_window_sill", new WindowSillBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block ACACIA_WALL_BOOKSHELF = registerBlock("acacia_wall_bookshelf", new WallBookshelfBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).luminance(WallBookshelfBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block ACACIA_WINDOW_SILL = registerBlock("acacia_window_sill", new WindowSillBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block DARK_OAK_WALL_BOOKSHELF = registerBlock("dark_oak_wall_bookshelf", new WallBookshelfBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).luminance(WallBookshelfBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block DARK_OAK_WINDOW_SILL = registerBlock("dark_oak_window_sill", new WindowSillBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block MANGROVE_WALL_BOOKSHELF = registerBlock("mangrove_wall_bookshelf", new WallBookshelfBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS).luminance(WallBookshelfBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block MANGROVE_WINDOW_SILL = registerBlock("mangrove_window_sill", new WindowSillBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block CRIMSON_WALL_BOOKSHELF = registerBlock("crimson_wall_bookshelf", new WallBookshelfBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS).luminance(WallBookshelfBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block CRIMSON_WINDOW_SILL = registerBlock("crimson_window_sill", new WindowSillBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block WARPED_WALL_BOOKSHELF = registerBlock("warped_wall_bookshelf", new WallBookshelfBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).luminance(WallBookshelfBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WARPED_WINDOW_SILL = registerBlock("warped_window_sill", new WindowSillBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)), ModItemGroup.CLUTTER);

    public static final Block APPLE_FOOD_BOX = registerBlock("apple_food_box", new FoodBoxBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.CLUTTER);
    public static final Block BEETROOT_FOOD_BOX = registerBlock("beetroot_food_box", new FoodBoxBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.CLUTTER);
    public static final Block CARROT_FOOD_BOX = registerBlock("carrot_food_box", new FoodBoxBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.CLUTTER);
    public static final Block POTATO_FOOD_BOX = registerBlock("potato_food_box", new FoodBoxBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.CLUTTER);
    public static final Block MELON_FOOD_BOX = registerBlock("melon_food_box", new FoodBoxBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.CLUTTER);
    public static final Block CHORUS_FRUIT_FOOD_BOX = registerBlock("chorus_fruit_food_box", new FoodBoxWithParticles(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.CLUTTER);
    public static final Block SWEET_BERRY_FOOD_BOX = registerBlock("sweet_berry_food_box", new FoodBoxBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.CLUTTER);
    public static final Block GLOW_BERRY_FOOD_BOX = registerBlock("glow_berry_food_box", new FoodBoxBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB).luminance(state -> 14)), ModItemGroup.CLUTTER);
    public static final Block BREAD_FOOD_BOX = registerBlock("bread_food_box", new FoodBoxBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.CLUTTER);
    public static final Block FOOD_BOX = registerBlock("food_box", new FoodBoxBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.CLUTTER);

    public static final Block BROWN_WALL_MUSHROOMS = registerBlock("brown_wall_mushrooms", new LadderBlock(FabricBlockSettings.copy(Blocks.VINE)), ModItemGroup.CLUTTER);
    public static final Block RED_WALL_MUSHROOMS = registerBlock("red_wall_mushrooms", new LadderBlock(FabricBlockSettings.copy(Blocks.VINE)), ModItemGroup.CLUTTER);
    public static final Block SCULK_MUSHROOM = registerBlock("sculk_mushroom", new ModMushroomPlantBlock(FabricBlockSettings.copy(Blocks.DANDELION).luminance(state -> 6)), ModItemGroup.CLUTTER);
    public static final Block SCULK_WALL_MUSHROOMS = registerBlock("sculk_wall_mushrooms", new LadderBlock(FabricBlockSettings.copy(Blocks.VINE).luminance(state -> 6)), ModItemGroup.CLUTTER);
    public static final Block CRIMSON_WALL_FUNGI = registerBlock("crimson_wall_fungi", new LadderBlock(FabricBlockSettings.copy(Blocks.VINE)), ModItemGroup.CLUTTER);
    public static final Block WARPED_WALL_FUNGI = registerBlock("warped_wall_fungi", new LadderBlock(FabricBlockSettings.copy(Blocks.VINE)), ModItemGroup.CLUTTER);

    public static final Block WHITE_KITCHEN_CURTAINS = registerBlock("white_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_KITCHEN_CURTAINS = registerBlock("light_gray_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block GRAY_KITCHEN_CURTAINS = registerBlock("gray_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.GRAY_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block BLACK_KITCHEN_CURTAINS = registerBlock("black_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.BLACK_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block BROWN_KITCHEN_CURTAINS = registerBlock("brown_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.BROWN_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block RED_KITCHEN_CURTAINS = registerBlock("red_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.RED_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block ORANGE_KITCHEN_CURTAINS = registerBlock("orange_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.ORANGE_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block YELLOW_KITCHEN_CURTAINS = registerBlock("yellow_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.YELLOW_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LIME_KITCHEN_CURTAINS = registerBlock("lime_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.LIME_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block GREEN_KITCHEN_CURTAINS = registerBlock("green_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.GREEN_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block CYAN_KITCHEN_CURTAINS = registerBlock("cyan_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.CYAN_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_KITCHEN_CURTAINS = registerBlock("light_blue_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block BLUE_KITCHEN_CURTAINS = registerBlock("blue_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.BLUE_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block PURPLE_KITCHEN_CURTAINS = registerBlock("purple_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.PURPLE_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_KITCHEN_CURTAINS = registerBlock("magenta_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.MAGENTA_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block PINK_KITCHEN_CURTAINS = registerBlock("pink_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.PINK_WOOL).noCollision()), ModItemGroup.CLUTTER);

    public static final Block LONG_WHITE_KITCHEN_CURTAINS = registerBlock("long_white_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_LIGHT_GRAY_KITCHEN_CURTAINS = registerBlock("long_light_gray_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_GRAY_KITCHEN_CURTAINS = registerBlock("long_gray_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.GRAY_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_BLACK_KITCHEN_CURTAINS = registerBlock("long_black_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.BLACK_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_BROWN_KITCHEN_CURTAINS = registerBlock("long_brown_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.BROWN_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_RED_KITCHEN_CURTAINS = registerBlock("long_red_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.RED_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_ORANGE_KITCHEN_CURTAINS = registerBlock("long_orange_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_YELLOW_KITCHEN_CURTAINS = registerBlock("long_yellow_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.YELLOW_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_LIME_KITCHEN_CURTAINS = registerBlock("long_lime_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.LIME_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_GREEN_KITCHEN_CURTAINS = registerBlock("long_green_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.GREEN_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_CYAN_KITCHEN_CURTAINS = registerBlock("long_cyan_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.CYAN_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_LIGHT_BLUE_KITCHEN_CURTAINS = registerBlock("long_light_blue_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_BLUE_KITCHEN_CURTAINS = registerBlock("long_blue_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.BLUE_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_PURPLE_KITCHEN_CURTAINS = registerBlock("long_purple_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.PURPLE_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_MAGENTA_KITCHEN_CURTAINS = registerBlock("long_magenta_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.MAGENTA_WOOL).noCollision()), ModItemGroup.CLUTTER);
    public static final Block LONG_PINK_KITCHEN_CURTAINS = registerBlock("long_pink_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.PINK_WOOL).noCollision()), ModItemGroup.CLUTTER);

    public static final Block PRIDE_KITCHEN_CURTAINS = registerBlock("pride_kitchen_curtains", new KitchenCurtainBlock(FabricBlockSettings.copy(Blocks.BLACK_WOOL).noCollision()), ModItemGroup.CLUTTER);

    public static final Block FLOOR_SEATING = registerBlock("floor_seating", new FloorSeatBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_WOOL)), ModItemGroup.CLUTTER);

    public static final Block BEER_MUG = registerBlockWithoutItem("beer_mug", new BeerMugBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).breakInstantly()));
    public static final Block WOODEN_MUG = registerBlockWithoutItem("wooden_mug", new MugBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).breakInstantly()));
    public static final Block HOPS_CROP = registerBlockWithoutItem("hops_crop", new HopsCropBlock(FabricBlockSettings.copy(Blocks.CARROTS)));
    public static final Block COTTON_CROP = registerBlockWithoutItem("cotton_crop", new CottonCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));

    public static final Block OAK_TABLE = registerBlock("oak_table", new TableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block SPRUCE_TABLE = registerBlock("spruce_table", new TableBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block BIRCH_TABLE = registerBlock("birch_table", new TableBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block JUNGLE_TABLE = registerBlock("jungle_table", new TableBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block ACACIA_TABLE = registerBlock("acacia_table", new TableBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block DARK_OAK_TABLE = registerBlock("dark_oak_table", new TableBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block MANGROVE_TABLE = registerBlock("mangrove_table", new TableBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block CRIMSON_TABLE = registerBlock("crimson_table", new TableBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block WARPED_TABLE = registerBlock("warped_table", new TableBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)), ModItemGroup.CLUTTER);

    public static final Block STRIPPED_OAK_TABLE = registerBlock("stripped_oak_table", new TableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_SPRUCE_TABLE = registerBlock("stripped_spruce_table", new TableBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_BIRCH_TABLE = registerBlock("stripped_birch_table", new TableBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_JUNGLE_TABLE = registerBlock("stripped_jungle_table", new TableBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_ACACIA_TABLE = registerBlock("stripped_acacia_table", new TableBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_DARK_OAK_TABLE = registerBlock("stripped_dark_oak_table", new TableBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_MANGROVE_TABLE = registerBlock("stripped_mangrove_table", new TableBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_CRIMSON_TABLE = registerBlock("stripped_crimson_table", new TableBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_WARPED_TABLE = registerBlock("stripped_warped_table", new TableBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)), ModItemGroup.CLUTTER);

    public static final Block OAK_CHAIR = registerBlock("oak_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block SPRUCE_CHAIR = registerBlock("spruce_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block BIRCH_CHAIR = registerBlock("birch_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block JUNGLE_CHAIR = registerBlock("jungle_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block ACACIA_CHAIR = registerBlock("acacia_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block DARK_OAK_CHAIR = registerBlock("dark_oak_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block MANGROVE_CHAIR = registerBlock("mangrove_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block CRIMSON_CHAIR = registerBlock("crimson_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block WARPED_CHAIR = registerBlock("warped_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)), ModItemGroup.CLUTTER);

    public static final Block STRIPPED_OAK_CHAIR = registerBlock("stripped_oak_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_SPRUCE_CHAIR = registerBlock("stripped_spruce_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_BIRCH_CHAIR = registerBlock("stripped_birch_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_JUNGLE_CHAIR = registerBlock("stripped_jungle_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_ACACIA_CHAIR = registerBlock("stripped_acacia_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_DARK_OAK_CHAIR = registerBlock("stripped_dark_oak_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_MANGROVE_CHAIR = registerBlock("stripped_mangrove_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_CRIMSON_CHAIR = registerBlock("stripped_crimson_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_WARPED_CHAIR = registerBlock("stripped_warped_chair", new WoodenChairBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)), ModItemGroup.CLUTTER);

    public static final Block OAK_WALL_CUPBOARD = registerBlock("oak_wall_cupboard", new WallCupboardBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block SPRUCE_WALL_CUPBOARD = registerBlock("spruce_wall_cupboard", new WallCupboardBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block BIRCH_WALL_CUPBOARD = registerBlock("birch_wall_cupboard", new WallCupboardBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block JUNGLE_WALL_CUPBOARD = registerBlock("jungle_wall_cupboard", new WallCupboardBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block ACACIA_WALL_CUPBOARD = registerBlock("acacia_wall_cupboard", new WallCupboardBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block DARK_OAK_WALL_CUPBOARD = registerBlock("dark_oak_wall_cupboard", new WallCupboardBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block MANGROVE_WALL_CUPBOARD = registerBlock("mangrove_wall_cupboard", new WallCupboardBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block CRIMSON_WALL_CUPBOARD = registerBlock("crimson_wall_cupboard", new WallCupboardBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block WARPED_WALL_CUPBOARD = registerBlock("warped_wall_cupboard", new WallCupboardBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);

    public static final Block OAK_CUPBOARD = registerBlock("oak_cupboard", new CupboardBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block SPRUCE_CUPBOARD = registerBlock("spruce_cupboard", new CupboardBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block BIRCH_CUPBOARD = registerBlock("birch_cupboard", new CupboardBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block JUNGLE_CUPBOARD = registerBlock("jungle_cupboard", new CupboardBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block ACACIA_CUPBOARD = registerBlock("acacia_cupboard", new CupboardBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block DARK_OAK_CUPBOARD = registerBlock("dark_oak_cupboard", new CupboardBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block MANGROVE_CUPBOARD = registerBlock("mangrove_cupboard", new CupboardBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block CRIMSON_CUPBOARD = registerBlock("crimson_cupboard", new CupboardBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);
    public static final Block WARPED_CUPBOARD = registerBlock("warped_cupboard", new CupboardBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).nonOpaque()), ModItemGroup.CLUTTER);


    public static final Block OAK_TRELLIS = registerBlock("oak_trellis", new TrellisBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TrellisBlock.createLightLevelFromLitBlockState())), ModItemGroup.CLUTTER);
    public static final Block SPRUCE_TRELLIS = registerBlock("spruce_trellis", new TrellisBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).luminance(TrellisBlock.createLightLevelFromLitBlockState())), ModItemGroup.CLUTTER);
    public static final Block BIRCH_TRELLIS = registerBlock("birch_trellis", new TrellisBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).luminance(TrellisBlock.createLightLevelFromLitBlockState())), ModItemGroup.CLUTTER);
    public static final Block JUNGLE_TRELLIS = registerBlock("jungle_trellis", new TrellisBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).luminance(TrellisBlock.createLightLevelFromLitBlockState())), ModItemGroup.CLUTTER);
    public static final Block ACACIA_TRELLIS = registerBlock("acacia_trellis", new TrellisBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).luminance(TrellisBlock.createLightLevelFromLitBlockState())), ModItemGroup.CLUTTER);
    public static final Block DARK_OAK_TRELLIS = registerBlock("dark_oak_trellis", new TrellisBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).luminance(TrellisBlock.createLightLevelFromLitBlockState())), ModItemGroup.CLUTTER);
    public static final Block MANGROVE_TRELLIS = registerBlock("mangrove_trellis", new TrellisBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS).luminance(TrellisBlock.createLightLevelFromLitBlockState())), ModItemGroup.CLUTTER);
    public static final Block CRIMSON_TRELLIS = registerBlock("crimson_trellis", new TrellisBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS).luminance(TrellisBlock.createLightLevelFromLitBlockState())), ModItemGroup.CLUTTER);
    public static final Block WARPED_TRELLIS = registerBlock("warped_trellis", new TrellisBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).luminance(TrellisBlock.createLightLevelFromLitBlockState())), ModItemGroup.CLUTTER);

    public static final Block OAK_BENCH = registerBlock("oak_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block SPRUCE_BENCH = registerBlock("spruce_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block BIRCH_BENCH = registerBlock("birch_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block JUNGLE_BENCH = registerBlock("jungle_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block ACACIA_BENCH = registerBlock("acacia_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block DARK_OAK_BENCH = registerBlock("dark_oak_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block MANGROVE_BENCH = registerBlock("mangrove_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block CRIMSON_BENCH = registerBlock("crimson_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block WARPED_BENCH = registerBlock("warped_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_OAK_BENCH = registerBlock("stripped_oak_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_SPRUCE_BENCH = registerBlock("stripped_spruce_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_BIRCH_BENCH = registerBlock("stripped_birch_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_JUNGLE_BENCH = registerBlock("stripped_jungle_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_ACACIA_BENCH = registerBlock("stripped_acacia_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_DARK_OAK_BENCH = registerBlock("stripped_dark_oak_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_MANGROVE_BENCH = registerBlock("stripped_mangrove_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_CRIMSON_BENCH = registerBlock("stripped_crimson_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)), ModItemGroup.CLUTTER);
    public static final Block STRIPPED_WARPED_BENCH = registerBlock("stripped_warped_bench", new WoodenBenchBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)), ModItemGroup.CLUTTER);

    public static final Block SHEEP_PLUSHIE = registerBlock("sheep_plushie", new SheepPlushieBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).breakInstantly()), ModItemGroup.CLUTTER);
    public static final Block COW_PLUSHIE = registerBlock("cow_plushie", new CowPlushieBlock(FabricBlockSettings.copy(Blocks.BROWN_WOOL).breakInstantly()), ModItemGroup.CLUTTER);
    public static final Block SQUID_PLUSHIE = registerBlock("squid_plushie", new SquidPlushieBlock(FabricBlockSettings.copy(Blocks.CYAN_WOOL).breakInstantly()), ModItemGroup.CLUTTER);
    public static final Block CHICKEN_PLUSHIE = registerBlock("chicken_plushie", new ChickenPlushieBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).breakInstantly()), ModItemGroup.CLUTTER);
    public static final Block FOX_PLUSHIE = registerBlock("fox_plushie", new FoxPlushieBlock(FabricBlockSettings.copy(Blocks.ORANGE_WOOL).breakInstantly()), ModItemGroup.CLUTTER);
    public static final Block SNOW_FOX_PLUSHIE = registerBlock("snow_fox_plushie", new FoxPlushieBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).breakInstantly()), ModItemGroup.CLUTTER);
    public static final Block OCELOT_PLUSHIE = registerBlock("ocelot_plushie", new OcelotPlushieBlock(FabricBlockSettings.copy(Blocks.YELLOW_WOOL).breakInstantly()), ModItemGroup.CLUTTER);
    public static final Block TOWEL = registerBlock("towel", new TowelBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).breakInstantly()), ModItemGroup.CLUTTER);
    public static final Block BOWL = registerBlock("bowl", new BowlBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).breakInstantly()), ModItemGroup.CLUTTER);

    public static final Block TALL_WHITE_LAMP = registerBlock("tall_white_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_LIGHT_GRAY_LAMP = registerBlock("tall_light_gray_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_GRAY_LAMP = registerBlock("tall_gray_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_BLACK_LAMP = registerBlock("tall_black_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_BROWN_LAMP = registerBlock("tall_brown_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_RED_LAMP = registerBlock("tall_red_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_ORANGE_LAMP = registerBlock("tall_orange_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_YELLOW_LAMP = registerBlock("tall_yellow_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_LIME_LAMP = registerBlock("tall_lime_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_GREEN_LAMP = registerBlock("tall_green_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_CYAN_LAMP = registerBlock("tall_cyan_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_LIGHT_BLUE_LAMP = registerBlock("tall_light_blue_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_BLUE_LAMP = registerBlock("tall_blue_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_PURPLE_LAMP = registerBlock("tall_purple_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_MAGENTA_LAMP = registerBlock("tall_magenta_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block TALL_PINK_LAMP = registerBlock("tall_pink_lamp", new TallLampBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).luminance(TallLampBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block TUBE_TV = registerBlock("tube_tv", new TubeTvBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(TubeTvBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);

    public static final Block GOLDEN_WALL_CANDLE = registerBlock("golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WHITE_GOLDEN_WALL_CANDLE = registerBlock("white_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_GOLDEN_WALL_CANDLE = registerBlock("light_gray_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block GRAY_GOLDEN_WALL_CANDLE = registerBlock("gray_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block BLACK_GOLDEN_WALL_CANDLE = registerBlock("black_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block BROWN_GOLDEN_WALL_CANDLE = registerBlock("brown_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block RED_GOLDEN_WALL_CANDLE = registerBlock("red_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block ORANGE_GOLDEN_WALL_CANDLE = registerBlock("orange_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block YELLOW_GOLDEN_WALL_CANDLE = registerBlock("yellow_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block LIME_GOLDEN_WALL_CANDLE = registerBlock("lime_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block GREEN_GOLDEN_WALL_CANDLE = registerBlock("green_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block CYAN_GOLDEN_WALL_CANDLE = registerBlock("cyan_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_GOLDEN_WALL_CANDLE = registerBlock("light_blue_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block BLUE_GOLDEN_WALL_CANDLE = registerBlock("blue_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block PURPLE_GOLDEN_WALL_CANDLE = registerBlock("purple_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_GOLDEN_WALL_CANDLE = registerBlock("magenta_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block PINK_GOLDEN_WALL_CANDLE = registerBlock("pink_golden_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);

    public static final Block IRON_WALL_CANDLE = registerBlock("iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WHITE_IRON_WALL_CANDLE = registerBlock("white_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_IRON_WALL_CANDLE = registerBlock("light_gray_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block GRAY_IRON_WALL_CANDLE = registerBlock("gray_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block BLACK_IRON_WALL_CANDLE = registerBlock("black_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block BROWN_IRON_WALL_CANDLE = registerBlock("brown_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block RED_IRON_WALL_CANDLE = registerBlock("red_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block ORANGE_IRON_WALL_CANDLE = registerBlock("orange_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block YELLOW_IRON_WALL_CANDLE = registerBlock("yellow_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block LIME_IRON_WALL_CANDLE = registerBlock("lime_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block GREEN_IRON_WALL_CANDLE = registerBlock("green_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block CYAN_IRON_WALL_CANDLE = registerBlock("cyan_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_IRON_WALL_CANDLE = registerBlock("light_blue_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block BLUE_IRON_WALL_CANDLE = registerBlock("blue_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block PURPLE_IRON_WALL_CANDLE = registerBlock("purple_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_IRON_WALL_CANDLE = registerBlock("magenta_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block PINK_IRON_WALL_CANDLE = registerBlock("pink_iron_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);

    public static final Block SILVER_WALL_CANDLE = registerBlock("silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WHITE_SILVER_WALL_CANDLE = registerBlock("white_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_SILVER_WALL_CANDLE = registerBlock("light_gray_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block GRAY_SILVER_WALL_CANDLE = registerBlock("gray_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block BLACK_SILVER_WALL_CANDLE = registerBlock("black_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block BROWN_SILVER_WALL_CANDLE = registerBlock("brown_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block RED_SILVER_WALL_CANDLE = registerBlock("red_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block ORANGE_SILVER_WALL_CANDLE = registerBlock("orange_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block YELLOW_SILVER_WALL_CANDLE = registerBlock("yellow_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block LIME_SILVER_WALL_CANDLE = registerBlock("lime_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block GREEN_SILVER_WALL_CANDLE = registerBlock("green_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block CYAN_SILVER_WALL_CANDLE = registerBlock("cyan_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_SILVER_WALL_CANDLE = registerBlock("light_blue_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block BLUE_SILVER_WALL_CANDLE = registerBlock("blue_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block PURPLE_SILVER_WALL_CANDLE = registerBlock("purple_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_SILVER_WALL_CANDLE = registerBlock("magenta_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block PINK_SILVER_WALL_CANDLE = registerBlock("pink_silver_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);

    public static final Block COPPER_WALL_CANDLE = registerBlock("copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WHITE_COPPER_WALL_CANDLE = registerBlock("white_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_COPPER_WALL_CANDLE = registerBlock("light_gray_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block GRAY_COPPER_WALL_CANDLE = registerBlock("gray_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block BLACK_COPPER_WALL_CANDLE = registerBlock("black_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block BROWN_COPPER_WALL_CANDLE = registerBlock("brown_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block RED_COPPER_WALL_CANDLE = registerBlock("red_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block ORANGE_COPPER_WALL_CANDLE = registerBlock("orange_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block YELLOW_COPPER_WALL_CANDLE = registerBlock("yellow_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block LIME_COPPER_WALL_CANDLE = registerBlock("lime_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block GREEN_COPPER_WALL_CANDLE = registerBlock("green_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block CYAN_COPPER_WALL_CANDLE = registerBlock("cyan_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_COPPER_WALL_CANDLE = registerBlock("light_blue_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block BLUE_COPPER_WALL_CANDLE = registerBlock("blue_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block PURPLE_COPPER_WALL_CANDLE = registerBlock("purple_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_COPPER_WALL_CANDLE = registerBlock("magenta_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block PINK_COPPER_WALL_CANDLE = registerBlock("pink_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);

    public static final Block EXPOSED_COPPER_WALL_CANDLE = registerBlock("exposed_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_WHITE_COPPER_WALL_CANDLE = registerBlock("exposed_white_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_LIGHT_GRAY_COPPER_WALL_CANDLE = registerBlock("exposed_light_gray_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_GRAY_COPPER_WALL_CANDLE = registerBlock("exposed_gray_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_BLACK_COPPER_WALL_CANDLE = registerBlock("exposed_black_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_BROWN_COPPER_WALL_CANDLE = registerBlock("exposed_brown_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_RED_COPPER_WALL_CANDLE = registerBlock("exposed_red_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_ORANGE_COPPER_WALL_CANDLE = registerBlock("exposed_orange_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_YELLOW_COPPER_WALL_CANDLE = registerBlock("exposed_yellow_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_LIME_COPPER_WALL_CANDLE = registerBlock("exposed_lime_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_GREEN_COPPER_WALL_CANDLE = registerBlock("exposed_green_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_CYAN_COPPER_WALL_CANDLE = registerBlock("exposed_cyan_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_LIGHT_BLUE_COPPER_WALL_CANDLE = registerBlock("exposed_light_blue_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_BLUE_COPPER_WALL_CANDLE = registerBlock("exposed_blue_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_PURPLE_COPPER_WALL_CANDLE = registerBlock("exposed_purple_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_MAGENTA_COPPER_WALL_CANDLE = registerBlock("exposed_magenta_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_PINK_COPPER_WALL_CANDLE = registerBlock("exposed_pink_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);

    public static final Block WEATHERED_COPPER_WALL_CANDLE = registerBlock("weathered_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_WHITE_COPPER_WALL_CANDLE = registerBlock("weathered_white_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_LIGHT_GRAY_COPPER_WALL_CANDLE = registerBlock("weathered_light_gray_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_GRAY_COPPER_WALL_CANDLE = registerBlock("weathered_gray_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_BLACK_COPPER_WALL_CANDLE = registerBlock("weathered_black_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_BROWN_COPPER_WALL_CANDLE = registerBlock("weathered_brown_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_RED_COPPER_WALL_CANDLE = registerBlock("weathered_red_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_ORANGE_COPPER_WALL_CANDLE = registerBlock("weathered_orange_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_YELLOW_COPPER_WALL_CANDLE = registerBlock("weathered_yellow_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_LIME_COPPER_WALL_CANDLE = registerBlock("weathered_lime_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_GREEN_COPPER_WALL_CANDLE = registerBlock("weathered_green_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_CYAN_COPPER_WALL_CANDLE = registerBlock("weathered_cyan_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_LIGHT_BLUE_COPPER_WALL_CANDLE = registerBlock("weathered_light_blue_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_BLUE_COPPER_WALL_CANDLE = registerBlock("weathered_blue_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_PURPLE_COPPER_WALL_CANDLE = registerBlock("weathered_purple_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_MAGENTA_COPPER_WALL_CANDLE = registerBlock("weathered_magenta_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_PINK_COPPER_WALL_CANDLE = registerBlock("weathered_pink_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);

    public static final Block OXIDIZED_COPPER_WALL_CANDLE = registerBlock("oxidized_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_WHITE_COPPER_WALL_CANDLE = registerBlock("oxidized_white_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_LIGHT_GRAY_COPPER_WALL_CANDLE = registerBlock("oxidized_light_gray_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_GRAY_COPPER_WALL_CANDLE = registerBlock("oxidized_gray_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_BLACK_COPPER_WALL_CANDLE = registerBlock("oxidized_black_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_BROWN_COPPER_WALL_CANDLE = registerBlock("oxidized_brown_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_RED_COPPER_WALL_CANDLE = registerBlock("oxidized_red_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_ORANGE_COPPER_WALL_CANDLE = registerBlock("oxidized_orange_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_YELLOW_COPPER_WALL_CANDLE = registerBlock("oxidized_yellow_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_LIME_COPPER_WALL_CANDLE = registerBlock("oxidized_lime_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_GREEN_COPPER_WALL_CANDLE = registerBlock("oxidized_green_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_CYAN_COPPER_WALL_CANDLE = registerBlock("oxidized_cyan_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_LIGHT_BLUE_COPPER_WALL_CANDLE = registerBlock("oxidized_light_blue_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_BLUE_COPPER_WALL_CANDLE = registerBlock("oxidized_blue_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_PURPLE_COPPER_WALL_CANDLE = registerBlock("oxidized_purple_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_MAGENTA_COPPER_WALL_CANDLE = registerBlock("oxidized_magenta_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_PINK_COPPER_WALL_CANDLE = registerBlock("oxidized_pink_copper_wall_candle", new OxidizableWallCandleBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);

    public static final Block WAXED_COPPER_WALL_CANDLE = registerBlock("waxed_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WHITE_COPPER_WALL_CANDLE = registerBlock("waxed_white_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_LIGHT_GRAY_COPPER_WALL_CANDLE = registerBlock("waxed_light_gray_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_GRAY_COPPER_WALL_CANDLE = registerBlock("waxed_gray_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_BLACK_COPPER_WALL_CANDLE = registerBlock("waxed_black_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_BROWN_COPPER_WALL_CANDLE = registerBlock("waxed_brown_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_RED_COPPER_WALL_CANDLE = registerBlock("waxed_red_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_ORANGE_COPPER_WALL_CANDLE = registerBlock("waxed_orange_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_YELLOW_COPPER_WALL_CANDLE = registerBlock("waxed_yellow_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_LIME_COPPER_WALL_CANDLE = registerBlock("waxed_lime_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_GREEN_COPPER_WALL_CANDLE = registerBlock("waxed_green_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_CYAN_COPPER_WALL_CANDLE = registerBlock("waxed_cyan_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_LIGHT_BLUE_COPPER_WALL_CANDLE = registerBlock("waxed_light_blue_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_BLUE_COPPER_WALL_CANDLE = registerBlock("waxed_blue_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_PURPLE_COPPER_WALL_CANDLE = registerBlock("waxed_purple_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_MAGENTA_COPPER_WALL_CANDLE = registerBlock("waxed_magenta_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_PINK_COPPER_WALL_CANDLE = registerBlock("waxed_pink_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);

    public static final Block WAXED_EXPOSED_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_WHITE_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_white_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_LIGHT_GRAY_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_light_gray_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_GRAY_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_gray_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_BLACK_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_black_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_BROWN_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_brown_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_RED_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_red_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_ORANGE_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_orange_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_YELLOW_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_yellow_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_LIME_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_lime_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_GREEN_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_green_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_CYAN_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_cyan_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_LIGHT_BLUE_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_light_blue_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_BLUE_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_blue_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_PURPLE_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_purple_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_MAGENTA_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_magenta_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_PINK_COPPER_WALL_CANDLE = registerBlock("waxed_exposed_pink_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);

    public static final Block WAXED_WEATHERED_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_WHITE_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_white_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_LIGHT_GRAY_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_light_gray_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_GRAY_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_gray_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_BLACK_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_black_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_BROWN_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_brown_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_RED_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_red_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_ORANGE_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_orange_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_YELLOW_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_yellow_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_LIME_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_lime_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_GREEN_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_green_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_CYAN_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_cyan_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_LIGHT_BLUE_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_light_blue_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_BLUE_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_blue_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_PURPLE_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_purple_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_MAGENTA_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_magenta_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_PINK_COPPER_WALL_CANDLE = registerBlock("waxed_weathered_pink_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);

    public static final Block WAXED_OXIDIZED_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_WHITE_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_white_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_LIGHT_GRAY_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_light_gray_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_GRAY_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_gray_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_BLACK_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_black_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_BROWN_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_brown_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_RED_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_red_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_ORANGE_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_orange_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_YELLOW_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_yellow_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_LIME_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_lime_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_GREEN_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_green_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_CYAN_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_cyan_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_LIGHT_BLUE_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_light_blue_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_BLUE_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_blue_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_PURPLE_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_purple_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_MAGENTA_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_magenta_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_PINK_COPPER_WALL_CANDLE = registerBlock("waxed_oxidized_pink_copper_wall_candle", new WallCandleBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(WallCandleBlock.createLightLevelFromLitBlockState(8))), ModItemGroup.CLUTTER);

    public static final Block COPPER_CHANDELIER = registerBlock("copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WHITE_COPPER_CHANDELIER = registerBlock("white_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_COPPER_CHANDELIER = registerBlock("light_gray_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GRAY_COPPER_CHANDELIER = registerBlock("gray_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLACK_COPPER_CHANDELIER = registerBlock("black_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BROWN_COPPER_CHANDELIER = registerBlock("brown_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block RED_COPPER_CHANDELIER = registerBlock("red_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block ORANGE_COPPER_CHANDELIER = registerBlock("orange_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block YELLOW_COPPER_CHANDELIER = registerBlock("yellow_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIME_COPPER_CHANDELIER = registerBlock("lime_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GREEN_COPPER_CHANDELIER = registerBlock("green_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block CYAN_COPPER_CHANDELIER = registerBlock("cyan_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_COPPER_CHANDELIER = registerBlock("light_blue_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLUE_COPPER_CHANDELIER = registerBlock("blue_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PURPLE_COPPER_CHANDELIER = registerBlock("purple_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_COPPER_CHANDELIER = registerBlock("magenta_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PINK_COPPER_CHANDELIER = registerBlock("pink_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block EXPOSED_COPPER_CHANDELIER = registerBlock("exposed_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_WHITE_COPPER_CHANDELIER = registerBlock("exposed_white_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_LIGHT_GRAY_COPPER_CHANDELIER = registerBlock("exposed_light_gray_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_GRAY_COPPER_CHANDELIER = registerBlock("exposed_gray_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_BLACK_COPPER_CHANDELIER = registerBlock("exposed_black_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_BROWN_COPPER_CHANDELIER = registerBlock("exposed_brown_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_RED_COPPER_CHANDELIER = registerBlock("exposed_red_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_ORANGE_COPPER_CHANDELIER = registerBlock("exposed_orange_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_YELLOW_COPPER_CHANDELIER = registerBlock("exposed_yellow_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_LIME_COPPER_CHANDELIER = registerBlock("exposed_lime_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_GREEN_COPPER_CHANDELIER = registerBlock("exposed_green_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_CYAN_COPPER_CHANDELIER = registerBlock("exposed_cyan_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_LIGHT_BLUE_COPPER_CHANDELIER = registerBlock("exposed_light_blue_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_BLUE_COPPER_CHANDELIER = registerBlock("exposed_blue_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_PURPLE_COPPER_CHANDELIER = registerBlock("exposed_purple_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_MAGENTA_COPPER_CHANDELIER = registerBlock("exposed_magenta_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_PINK_COPPER_CHANDELIER = registerBlock("exposed_pink_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block WEATHERED_COPPER_CHANDELIER = registerBlock("weathered_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_WHITE_COPPER_CHANDELIER = registerBlock("weathered_white_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_LIGHT_GRAY_COPPER_CHANDELIER = registerBlock("weathered_light_gray_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_GRAY_COPPER_CHANDELIER = registerBlock("weathered_gray_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_BLACK_COPPER_CHANDELIER = registerBlock("weathered_black_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_BROWN_COPPER_CHANDELIER = registerBlock("weathered_brown_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_RED_COPPER_CHANDELIER = registerBlock("weathered_red_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_ORANGE_COPPER_CHANDELIER = registerBlock("weathered_orange_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_YELLOW_COPPER_CHANDELIER = registerBlock("weathered_yellow_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_LIME_COPPER_CHANDELIER = registerBlock("weathered_lime_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_GREEN_COPPER_CHANDELIER = registerBlock("weathered_green_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_CYAN_COPPER_CHANDELIER = registerBlock("weathered_cyan_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_LIGHT_BLUE_COPPER_CHANDELIER = registerBlock("weathered_light_blue_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_BLUE_COPPER_CHANDELIER = registerBlock("weathered_blue_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_PURPLE_COPPER_CHANDELIER = registerBlock("weathered_purple_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_MAGENTA_COPPER_CHANDELIER = registerBlock("weathered_magenta_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_PINK_COPPER_CHANDELIER = registerBlock("weathered_pink_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block OXIDIZED_COPPER_CHANDELIER = registerBlock("oxidized_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_WHITE_COPPER_CHANDELIER = registerBlock("oxidized_white_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_LIGHT_GRAY_COPPER_CHANDELIER = registerBlock("oxidized_light_gray_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_GRAY_COPPER_CHANDELIER = registerBlock("oxidized_gray_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_BLACK_COPPER_CHANDELIER = registerBlock("oxidized_black_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_BROWN_COPPER_CHANDELIER = registerBlock("oxidized_brown_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_RED_COPPER_CHANDELIER = registerBlock("oxidized_red_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_ORANGE_COPPER_CHANDELIER = registerBlock("oxidized_orange_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_YELLOW_COPPER_CHANDELIER = registerBlock("oxidized_yellow_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_LIME_COPPER_CHANDELIER = registerBlock("oxidized_lime_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_GREEN_COPPER_CHANDELIER = registerBlock("oxidized_green_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_CYAN_COPPER_CHANDELIER = registerBlock("oxidized_cyan_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_LIGHT_BLUE_COPPER_CHANDELIER = registerBlock("oxidized_light_blue_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_BLUE_COPPER_CHANDELIER = registerBlock("oxidized_blue_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_PURPLE_COPPER_CHANDELIER = registerBlock("oxidized_purple_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_MAGENTA_COPPER_CHANDELIER = registerBlock("oxidized_magenta_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_PINK_COPPER_CHANDELIER = registerBlock("oxidized_pink_copper_chandelier", new OxidizableChandelierBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block WAXED_COPPER_CHANDELIER = registerBlock("waxed_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WHITE_COPPER_CHANDELIER = registerBlock("waxed_white_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_LIGHT_GRAY_COPPER_CHANDELIER = registerBlock("waxed_light_gray_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_GRAY_COPPER_CHANDELIER = registerBlock("waxed_gray_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_BLACK_COPPER_CHANDELIER = registerBlock("waxed_black_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_BROWN_COPPER_CHANDELIER = registerBlock("waxed_brown_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_RED_COPPER_CHANDELIER = registerBlock("waxed_red_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_ORANGE_COPPER_CHANDELIER = registerBlock("waxed_orange_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_YELLOW_COPPER_CHANDELIER = registerBlock("waxed_yellow_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_LIME_COPPER_CHANDELIER = registerBlock("waxed_lime_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_GREEN_COPPER_CHANDELIER = registerBlock("waxed_green_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_CYAN_COPPER_CHANDELIER = registerBlock("waxed_cyan_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_LIGHT_BLUE_COPPER_CHANDELIER = registerBlock("waxed_light_blue_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_BLUE_COPPER_CHANDELIER = registerBlock("waxed_blue_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_PURPLE_COPPER_CHANDELIER = registerBlock("waxed_purple_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_MAGENTA_COPPER_CHANDELIER = registerBlock("waxed_magenta_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_PINK_COPPER_CHANDELIER = registerBlock("waxed_pink_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block WAXED_EXPOSED_COPPER_CHANDELIER = registerBlock("waxed_exposed_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_WHITE_COPPER_CHANDELIER = registerBlock("waxed_exposed_white_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_LIGHT_GRAY_COPPER_CHANDELIER = registerBlock("waxed_exposed_light_gray_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_GRAY_COPPER_CHANDELIER = registerBlock("waxed_exposed_gray_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_BLACK_COPPER_CHANDELIER = registerBlock("waxed_exposed_black_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_BROWN_COPPER_CHANDELIER = registerBlock("waxed_exposed_brown_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_RED_COPPER_CHANDELIER = registerBlock("waxed_exposed_red_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_ORANGE_COPPER_CHANDELIER = registerBlock("waxed_exposed_orange_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_YELLOW_COPPER_CHANDELIER = registerBlock("waxed_exposed_yellow_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_LIME_COPPER_CHANDELIER = registerBlock("waxed_exposed_lime_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_GREEN_COPPER_CHANDELIER = registerBlock("waxed_exposed_green_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_CYAN_COPPER_CHANDELIER = registerBlock("waxed_exposed_cyan_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_LIGHT_BLUE_COPPER_CHANDELIER = registerBlock("waxed_exposed_light_blue_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_BLUE_COPPER_CHANDELIER = registerBlock("waxed_exposed_blue_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_PURPLE_COPPER_CHANDELIER = registerBlock("waxed_exposed_purple_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_MAGENTA_COPPER_CHANDELIER = registerBlock("waxed_exposed_magenta_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_PINK_COPPER_CHANDELIER = registerBlock("waxed_exposed_pink_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block WAXED_WEATHERED_COPPER_CHANDELIER = registerBlock("waxed_weathered_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_WHITE_COPPER_CHANDELIER = registerBlock("waxed_weathered_white_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_LIGHT_GRAY_COPPER_CHANDELIER = registerBlock("waxed_weathered_light_gray_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_GRAY_COPPER_CHANDELIER = registerBlock("waxed_weathered_gray_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_BLACK_COPPER_CHANDELIER = registerBlock("waxed_weathered_black_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_BROWN_COPPER_CHANDELIER = registerBlock("waxed_weathered_brown_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_RED_COPPER_CHANDELIER = registerBlock("waxed_weathered_red_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_ORANGE_COPPER_CHANDELIER = registerBlock("waxed_weathered_orange_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_YELLOW_COPPER_CHANDELIER = registerBlock("waxed_weathered_yellow_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_LIME_COPPER_CHANDELIER = registerBlock("waxed_weathered_lime_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_GREEN_COPPER_CHANDELIER = registerBlock("waxed_weathered_green_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_CYAN_COPPER_CHANDELIER = registerBlock("waxed_weathered_cyan_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_LIGHT_BLUE_COPPER_CHANDELIER = registerBlock("waxed_weathered_light_blue_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_BLUE_COPPER_CHANDELIER = registerBlock("waxed_weathered_blue_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_PURPLE_COPPER_CHANDELIER = registerBlock("waxed_weathered_purple_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_MAGENTA_COPPER_CHANDELIER = registerBlock("waxed_weathered_magenta_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_PINK_COPPER_CHANDELIER = registerBlock("waxed_weathered_pink_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block WAXED_OXIDIZED_COPPER_CHANDELIER = registerBlock("waxed_oxidized_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_WHITE_COPPER_CHANDELIER = registerBlock("waxed_oxidized_white_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_LIGHT_GRAY_COPPER_CHANDELIER = registerBlock("waxed_oxidized_light_gray_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_GRAY_COPPER_CHANDELIER = registerBlock("waxed_oxidized_gray_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_BLACK_COPPER_CHANDELIER = registerBlock("waxed_oxidized_black_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_BROWN_COPPER_CHANDELIER = registerBlock("waxed_oxidized_brown_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_RED_COPPER_CHANDELIER = registerBlock("waxed_oxidized_red_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_ORANGE_COPPER_CHANDELIER = registerBlock("waxed_oxidized_orange_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_YELLOW_COPPER_CHANDELIER = registerBlock("waxed_oxidized_yellow_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_LIME_COPPER_CHANDELIER = registerBlock("waxed_oxidized_lime_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_GREEN_COPPER_CHANDELIER = registerBlock("waxed_oxidized_green_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_CYAN_COPPER_CHANDELIER = registerBlock("waxed_oxidized_cyan_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_LIGHT_BLUE_COPPER_CHANDELIER = registerBlock("waxed_oxidized_light_blue_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_BLUE_COPPER_CHANDELIER = registerBlock("waxed_oxidized_blue_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_PURPLE_COPPER_CHANDELIER = registerBlock("waxed_oxidized_purple_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_MAGENTA_COPPER_CHANDELIER = registerBlock("waxed_oxidized_magenta_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_PINK_COPPER_CHANDELIER = registerBlock("waxed_oxidized_pink_copper_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block IRON_CHANDELIER = registerBlock("iron_chandelier", new ChandelierBlock( FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WHITE_IRON_CHANDELIER = registerBlock("white_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_IRON_CHANDELIER = registerBlock("light_gray_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GRAY_IRON_CHANDELIER = registerBlock("gray_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLACK_IRON_CHANDELIER = registerBlock("black_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BROWN_IRON_CHANDELIER = registerBlock("brown_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block RED_IRON_CHANDELIER = registerBlock("red_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block ORANGE_IRON_CHANDELIER = registerBlock("orange_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block YELLOW_IRON_CHANDELIER = registerBlock("yellow_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIME_IRON_CHANDELIER = registerBlock("lime_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GREEN_IRON_CHANDELIER = registerBlock("green_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block CYAN_IRON_CHANDELIER = registerBlock("cyan_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_IRON_CHANDELIER = registerBlock("light_blue_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLUE_IRON_CHANDELIER = registerBlock("blue_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PURPLE_IRON_CHANDELIER = registerBlock("purple_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_IRON_CHANDELIER = registerBlock("magenta_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PINK_IRON_CHANDELIER = registerBlock("pink_iron_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block GOLDEN_CHANDELIER = registerBlock("golden_chandelier", new ChandelierBlock( FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WHITE_GOLDEN_CHANDELIER = registerBlock("white_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_GOLDEN_CHANDELIER = registerBlock("light_gray_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GRAY_GOLDEN_CHANDELIER = registerBlock("gray_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLACK_GOLDEN_CHANDELIER = registerBlock("black_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BROWN_GOLDEN_CHANDELIER = registerBlock("brown_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block RED_GOLDEN_CHANDELIER = registerBlock("red_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block ORANGE_GOLDEN_CHANDELIER = registerBlock("orange_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block YELLOW_GOLDEN_CHANDELIER = registerBlock("yellow_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIME_GOLDEN_CHANDELIER = registerBlock("lime_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GREEN_GOLDEN_CHANDELIER = registerBlock("green_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block CYAN_GOLDEN_CHANDELIER = registerBlock("cyan_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_GOLDEN_CHANDELIER = registerBlock("light_blue_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLUE_GOLDEN_CHANDELIER = registerBlock("blue_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PURPLE_GOLDEN_CHANDELIER = registerBlock("purple_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_GOLDEN_CHANDELIER = registerBlock("magenta_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PINK_GOLDEN_CHANDELIER = registerBlock("pink_golden_chandelier", new ChandelierBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block SILVER_CHANDELIER = registerBlock("silver_chandelier", new ChandelierBlock( FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WHITE_SILVER_CHANDELIER = registerBlock("white_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_SILVER_CHANDELIER = registerBlock("light_gray_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GRAY_SILVER_CHANDELIER = registerBlock("gray_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLACK_SILVER_CHANDELIER = registerBlock("black_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BROWN_SILVER_CHANDELIER = registerBlock("brown_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block RED_SILVER_CHANDELIER = registerBlock("red_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block ORANGE_SILVER_CHANDELIER = registerBlock("orange_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block YELLOW_SILVER_CHANDELIER = registerBlock("yellow_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIME_SILVER_CHANDELIER = registerBlock("lime_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GREEN_SILVER_CHANDELIER = registerBlock("green_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block CYAN_SILVER_CHANDELIER = registerBlock("cyan_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_SILVER_CHANDELIER = registerBlock("light_blue_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLUE_SILVER_CHANDELIER = registerBlock("blue_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PURPLE_SILVER_CHANDELIER = registerBlock("purple_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_SILVER_CHANDELIER = registerBlock("magenta_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PINK_SILVER_CHANDELIER = registerBlock("pink_silver_chandelier", new ChandelierBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(ChandelierBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block COPPER_CANDELABRA = registerBlock("copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WHITE_COPPER_CANDELABRA = registerBlock("white_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_COPPER_CANDELABRA = registerBlock("light_gray_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GRAY_COPPER_CANDELABRA = registerBlock("gray_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLACK_COPPER_CANDELABRA = registerBlock("black_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BROWN_COPPER_CANDELABRA = registerBlock("brown_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block RED_COPPER_CANDELABRA = registerBlock("red_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block ORANGE_COPPER_CANDELABRA = registerBlock("orange_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block YELLOW_COPPER_CANDELABRA = registerBlock("yellow_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIME_COPPER_CANDELABRA = registerBlock("lime_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GREEN_COPPER_CANDELABRA = registerBlock("green_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block CYAN_COPPER_CANDELABRA = registerBlock("cyan_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_COPPER_CANDELABRA = registerBlock("light_blue_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLUE_COPPER_CANDELABRA = registerBlock("blue_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PURPLE_COPPER_CANDELABRA = registerBlock("purple_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_COPPER_CANDELABRA = registerBlock("magenta_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PINK_COPPER_CANDELABRA = registerBlock("pink_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block EXPOSED_COPPER_CANDELABRA = registerBlock("exposed_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_WHITE_COPPER_CANDELABRA = registerBlock("exposed_white_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_LIGHT_GRAY_COPPER_CANDELABRA = registerBlock("exposed_light_gray_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_GRAY_COPPER_CANDELABRA = registerBlock("exposed_gray_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_BLACK_COPPER_CANDELABRA = registerBlock("exposed_black_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_BROWN_COPPER_CANDELABRA = registerBlock("exposed_brown_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_RED_COPPER_CANDELABRA = registerBlock("exposed_red_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_ORANGE_COPPER_CANDELABRA = registerBlock("exposed_orange_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_YELLOW_COPPER_CANDELABRA = registerBlock("exposed_yellow_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_LIME_COPPER_CANDELABRA = registerBlock("exposed_lime_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_GREEN_COPPER_CANDELABRA = registerBlock("exposed_green_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_CYAN_COPPER_CANDELABRA = registerBlock("exposed_cyan_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_LIGHT_BLUE_COPPER_CANDELABRA = registerBlock("exposed_light_blue_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_BLUE_COPPER_CANDELABRA = registerBlock("exposed_blue_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_PURPLE_COPPER_CANDELABRA = registerBlock("exposed_purple_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_MAGENTA_COPPER_CANDELABRA = registerBlock("exposed_magenta_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block EXPOSED_PINK_COPPER_CANDELABRA = registerBlock("exposed_pink_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copy(Blocks.EXPOSED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block WEATHERED_COPPER_CANDELABRA = registerBlock("weathered_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_WHITE_COPPER_CANDELABRA = registerBlock("weathered_white_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_LIGHT_GRAY_COPPER_CANDELABRA = registerBlock("weathered_light_gray_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_GRAY_COPPER_CANDELABRA = registerBlock("weathered_gray_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_BLACK_COPPER_CANDELABRA = registerBlock("weathered_black_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_BROWN_COPPER_CANDELABRA = registerBlock("weathered_brown_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_RED_COPPER_CANDELABRA = registerBlock("weathered_red_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_ORANGE_COPPER_CANDELABRA = registerBlock("weathered_orange_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_YELLOW_COPPER_CANDELABRA = registerBlock("weathered_yellow_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_LIME_COPPER_CANDELABRA = registerBlock("weathered_lime_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_GREEN_COPPER_CANDELABRA = registerBlock("weathered_green_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_CYAN_COPPER_CANDELABRA = registerBlock("weathered_cyan_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_LIGHT_BLUE_COPPER_CANDELABRA = registerBlock("weathered_light_blue_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_BLUE_COPPER_CANDELABRA = registerBlock("weathered_blue_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_PURPLE_COPPER_CANDELABRA = registerBlock("weathered_purple_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_MAGENTA_COPPER_CANDELABRA = registerBlock("weathered_magenta_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WEATHERED_PINK_COPPER_CANDELABRA = registerBlock("weathered_pink_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block OXIDIZED_COPPER_CANDELABRA = registerBlock("oxidized_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_WHITE_COPPER_CANDELABRA = registerBlock("oxidized_white_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_LIGHT_GRAY_COPPER_CANDELABRA = registerBlock("oxidized_light_gray_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_GRAY_COPPER_CANDELABRA = registerBlock("oxidized_gray_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_BLACK_COPPER_CANDELABRA = registerBlock("oxidized_black_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_BROWN_COPPER_CANDELABRA = registerBlock("oxidized_brown_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_RED_COPPER_CANDELABRA = registerBlock("oxidized_red_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_ORANGE_COPPER_CANDELABRA = registerBlock("oxidized_orange_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_YELLOW_COPPER_CANDELABRA = registerBlock("oxidized_yellow_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_LIME_COPPER_CANDELABRA = registerBlock("oxidized_lime_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_GREEN_COPPER_CANDELABRA = registerBlock("oxidized_green_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_CYAN_COPPER_CANDELABRA = registerBlock("oxidized_cyan_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_LIGHT_BLUE_COPPER_CANDELABRA = registerBlock("oxidized_light_blue_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_BLUE_COPPER_CANDELABRA = registerBlock("oxidized_blue_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_PURPLE_COPPER_CANDELABRA = registerBlock("oxidized_purple_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_MAGENTA_COPPER_CANDELABRA = registerBlock("oxidized_magenta_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block OXIDIZED_PINK_COPPER_CANDELABRA = registerBlock("oxidized_pink_copper_candelabra", new OxidizableCandelabraBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copy(Blocks.WEATHERED_COPPER).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block WAXED_COPPER_CANDELABRA = registerBlock("waxed_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WHITE_COPPER_CANDELABRA = registerBlock("waxed_white_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_LIGHT_GRAY_COPPER_CANDELABRA = registerBlock("waxed_light_gray_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_GRAY_COPPER_CANDELABRA = registerBlock("waxed_gray_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_BLACK_COPPER_CANDELABRA = registerBlock("waxed_black_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_BROWN_COPPER_CANDELABRA = registerBlock("waxed_brown_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_RED_COPPER_CANDELABRA = registerBlock("waxed_red_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_ORANGE_COPPER_CANDELABRA = registerBlock("waxed_orange_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_YELLOW_COPPER_CANDELABRA = registerBlock("waxed_yellow_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_LIME_COPPER_CANDELABRA = registerBlock("waxed_lime_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_GREEN_COPPER_CANDELABRA = registerBlock("waxed_green_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_CYAN_COPPER_CANDELABRA = registerBlock("waxed_cyan_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_LIGHT_BLUE_COPPER_CANDELABRA = registerBlock("waxed_light_blue_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_BLUE_COPPER_CANDELABRA = registerBlock("waxed_blue_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_PURPLE_COPPER_CANDELABRA = registerBlock("waxed_purple_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_MAGENTA_COPPER_CANDELABRA = registerBlock("waxed_magenta_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_PINK_COPPER_CANDELABRA = registerBlock("waxed_pink_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block WAXED_EXPOSED_COPPER_CANDELABRA = registerBlock("waxed_exposed_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_WHITE_COPPER_CANDELABRA = registerBlock("waxed_exposed_white_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_LIGHT_GRAY_COPPER_CANDELABRA = registerBlock("waxed_exposed_light_gray_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_GRAY_COPPER_CANDELABRA = registerBlock("waxed_exposed_gray_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_BLACK_COPPER_CANDELABRA = registerBlock("waxed_exposed_black_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_BROWN_COPPER_CANDELABRA = registerBlock("waxed_exposed_brown_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_RED_COPPER_CANDELABRA = registerBlock("waxed_exposed_red_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_ORANGE_COPPER_CANDELABRA = registerBlock("waxed_exposed_orange_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_YELLOW_COPPER_CANDELABRA = registerBlock("waxed_exposed_yellow_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_LIME_COPPER_CANDELABRA = registerBlock("waxed_exposed_lime_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_GREEN_COPPER_CANDELABRA = registerBlock("waxed_exposed_green_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_CYAN_COPPER_CANDELABRA = registerBlock("waxed_exposed_cyan_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_LIGHT_BLUE_COPPER_CANDELABRA = registerBlock("waxed_exposed_light_blue_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_BLUE_COPPER_CANDELABRA = registerBlock("waxed_exposed_blue_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_PURPLE_COPPER_CANDELABRA = registerBlock("waxed_exposed_purple_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_MAGENTA_COPPER_CANDELABRA = registerBlock("waxed_exposed_magenta_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_EXPOSED_PINK_COPPER_CANDELABRA = registerBlock("waxed_exposed_pink_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block WAXED_WEATHERED_COPPER_CANDELABRA = registerBlock("waxed_weathered_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_WHITE_COPPER_CANDELABRA = registerBlock("waxed_weathered_white_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_LIGHT_GRAY_COPPER_CANDELABRA = registerBlock("waxed_weathered_light_gray_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_GRAY_COPPER_CANDELABRA = registerBlock("waxed_weathered_gray_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_BLACK_COPPER_CANDELABRA = registerBlock("waxed_weathered_black_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_BROWN_COPPER_CANDELABRA = registerBlock("waxed_weathered_brown_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_RED_COPPER_CANDELABRA = registerBlock("waxed_weathered_red_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_ORANGE_COPPER_CANDELABRA = registerBlock("waxed_weathered_orange_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_YELLOW_COPPER_CANDELABRA = registerBlock("waxed_weathered_yellow_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_LIME_COPPER_CANDELABRA = registerBlock("waxed_weathered_lime_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_GREEN_COPPER_CANDELABRA = registerBlock("waxed_weathered_green_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_CYAN_COPPER_CANDELABRA = registerBlock("waxed_weathered_cyan_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_LIGHT_BLUE_COPPER_CANDELABRA = registerBlock("waxed_weathered_light_blue_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_BLUE_COPPER_CANDELABRA = registerBlock("waxed_weathered_blue_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_PURPLE_COPPER_CANDELABRA = registerBlock("waxed_weathered_purple_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_MAGENTA_COPPER_CANDELABRA = registerBlock("waxed_weathered_magenta_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_WEATHERED_PINK_COPPER_CANDELABRA = registerBlock("waxed_weathered_pink_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block WAXED_OXIDIZED_COPPER_CANDELABRA = registerBlock("waxed_oxidized_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_WHITE_COPPER_CANDELABRA = registerBlock("waxed_oxidized_white_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_LIGHT_GRAY_COPPER_CANDELABRA = registerBlock("waxed_oxidized_light_gray_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_GRAY_COPPER_CANDELABRA = registerBlock("waxed_oxidized_gray_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_BLACK_COPPER_CANDELABRA = registerBlock("waxed_oxidized_black_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_BROWN_COPPER_CANDELABRA = registerBlock("waxed_oxidized_brown_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_RED_COPPER_CANDELABRA = registerBlock("waxed_oxidized_red_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_ORANGE_COPPER_CANDELABRA = registerBlock("waxed_oxidized_orange_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_YELLOW_COPPER_CANDELABRA = registerBlock("waxed_oxidized_yellow_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_LIME_COPPER_CANDELABRA = registerBlock("waxed_oxidized_lime_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_GREEN_COPPER_CANDELABRA = registerBlock("waxed_oxidized_green_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_CYAN_COPPER_CANDELABRA = registerBlock("waxed_oxidized_cyan_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_LIGHT_BLUE_COPPER_CANDELABRA = registerBlock("waxed_oxidized_light_blue_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_BLUE_COPPER_CANDELABRA = registerBlock("waxed_oxidized_blue_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_PURPLE_COPPER_CANDELABRA = registerBlock("waxed_oxidized_purple_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_MAGENTA_COPPER_CANDELABRA = registerBlock("waxed_oxidized_magenta_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WAXED_OXIDIZED_PINK_COPPER_CANDELABRA = registerBlock("waxed_oxidized_pink_copper_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block GOLDEN_CANDELABRA = registerBlock("golden_candelabra", new CandelabraBlock( FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WHITE_GOLDEN_CANDELABRA = registerBlock("white_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_GOLDEN_CANDELABRA = registerBlock("light_gray_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GRAY_GOLDEN_CANDELABRA = registerBlock("gray_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLACK_GOLDEN_CANDELABRA = registerBlock("black_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BROWN_GOLDEN_CANDELABRA = registerBlock("brown_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block RED_GOLDEN_CANDELABRA = registerBlock("red_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block ORANGE_GOLDEN_CANDELABRA = registerBlock("orange_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block YELLOW_GOLDEN_CANDELABRA = registerBlock("yellow_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIME_GOLDEN_CANDELABRA = registerBlock("lime_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GREEN_GOLDEN_CANDELABRA = registerBlock("green_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block CYAN_GOLDEN_CANDELABRA = registerBlock("cyan_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_GOLDEN_CANDELABRA = registerBlock("light_blue_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLUE_GOLDEN_CANDELABRA = registerBlock("blue_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PURPLE_GOLDEN_CANDELABRA = registerBlock("purple_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_GOLDEN_CANDELABRA = registerBlock("magenta_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PINK_GOLDEN_CANDELABRA = registerBlock("pink_golden_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block SILVER_CANDELABRA = registerBlock("silver_candelabra", new CandelabraBlock( FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WHITE_SILVER_CANDELABRA = registerBlock("white_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_SILVER_CANDELABRA = registerBlock("light_gray_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GRAY_SILVER_CANDELABRA = registerBlock("gray_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLACK_SILVER_CANDELABRA = registerBlock("black_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BROWN_SILVER_CANDELABRA = registerBlock("brown_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block RED_SILVER_CANDELABRA = registerBlock("red_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block ORANGE_SILVER_CANDELABRA = registerBlock("orange_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block YELLOW_SILVER_CANDELABRA = registerBlock("yellow_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIME_SILVER_CANDELABRA = registerBlock("lime_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GREEN_SILVER_CANDELABRA = registerBlock("green_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block CYAN_SILVER_CANDELABRA = registerBlock("cyan_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_SILVER_CANDELABRA = registerBlock("light_blue_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLUE_SILVER_CANDELABRA = registerBlock("blue_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PURPLE_SILVER_CANDELABRA = registerBlock("purple_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_SILVER_CANDELABRA = registerBlock("magenta_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PINK_SILVER_CANDELABRA = registerBlock("pink_silver_candelabra", new CandelabraBlock(FabricBlockSettings.copy(ModBlocks.SILVER_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block IRON_CANDELABRA = registerBlock("iron_candelabra", new CandelabraBlock( FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block WHITE_IRON_CANDELABRA = registerBlock("white_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_GRAY_IRON_CANDELABRA = registerBlock("light_gray_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GRAY_IRON_CANDELABRA = registerBlock("gray_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLACK_IRON_CANDELABRA = registerBlock("black_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BROWN_IRON_CANDELABRA = registerBlock("brown_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block RED_IRON_CANDELABRA = registerBlock("red_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block ORANGE_IRON_CANDELABRA = registerBlock("orange_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block YELLOW_IRON_CANDELABRA = registerBlock("yellow_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIME_IRON_CANDELABRA = registerBlock("lime_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block GREEN_IRON_CANDELABRA = registerBlock("green_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block CYAN_IRON_CANDELABRA = registerBlock("cyan_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block LIGHT_BLUE_IRON_CANDELABRA = registerBlock("light_blue_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block BLUE_IRON_CANDELABRA = registerBlock("blue_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PURPLE_IRON_CANDELABRA = registerBlock("purple_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block MAGENTA_IRON_CANDELABRA = registerBlock("magenta_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);
    public static final Block PINK_IRON_CANDELABRA = registerBlock("pink_iron_candelabra", new CandelabraBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).luminance(CandelabraBlock.createLightLevelFromLitBlockState(12))), ModItemGroup.CLUTTER);

    public static final Block BONFIRE = registerBlock("bonfire", new BonfireBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).nonOpaque().luminance(BonfireBlock.createLightLevelFromLitBlockState(15))), ModItemGroup.CLUTTER);

    //public static final Block SINK = registerBlock("sink", new SinkBlock(FabricBlockSettings.copy(Blocks.WATER_CAULDRON).nonOpaque()), ModItemGroup.CLUTTER);
    //public static final Block PLATE = registerBlock("plate", new TablePlateBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).breakInstantly()), ModItemGroup.CLUTTER);
    //public static final Block SHOWER = registerBlock("shower", new ShowerBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).ticksRandomly()), ModItemGroup.CLUTTER);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Clutter.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Clutter.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Clutter.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void copperBlockPairs() {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_BARS, EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_BARS, WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_BARS, OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_BARS, WAXED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_BARS, WAXED_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_BARS, WAXED_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_BARS, WAXED_OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_BUTTON, EXPOSED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_BUTTON, WEATHERED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_BUTTON, OXIDIZED_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_BUTTON, WAXED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_BUTTON, WAXED_EXPOSED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_BUTTON, WAXED_WEATHERED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_BUTTON, WAXED_OXIDIZED_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_CANDELABRA, WAXED_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_CANDELABRA, WAXED_EXPOSED_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_CANDELABRA, WAXED_WEATHERED_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_CANDELABRA, WAXED_OXIDIZED_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(WHITE_COPPER_CANDELABRA, EXPOSED_WHITE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_WHITE_COPPER_CANDELABRA, WEATHERED_WHITE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_WHITE_COPPER_CANDELABRA, OXIDIZED_WHITE_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(WHITE_COPPER_CANDELABRA, WAXED_WHITE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_WHITE_COPPER_CANDELABRA, WAXED_EXPOSED_WHITE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_WHITE_COPPER_CANDELABRA, WAXED_WEATHERED_WHITE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_WHITE_COPPER_CANDELABRA, WAXED_OXIDIZED_WHITE_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(LIGHT_GRAY_COPPER_CANDELABRA, EXPOSED_LIGHT_GRAY_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_LIGHT_GRAY_COPPER_CANDELABRA, WEATHERED_LIGHT_GRAY_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_LIGHT_GRAY_COPPER_CANDELABRA, OXIDIZED_LIGHT_GRAY_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(LIGHT_GRAY_COPPER_CANDELABRA, WAXED_LIGHT_GRAY_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_LIGHT_GRAY_COPPER_CANDELABRA, WAXED_EXPOSED_LIGHT_GRAY_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_LIGHT_GRAY_COPPER_CANDELABRA, WAXED_WEATHERED_LIGHT_GRAY_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_LIGHT_GRAY_COPPER_CANDELABRA, WAXED_OXIDIZED_LIGHT_GRAY_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(GRAY_COPPER_CANDELABRA, EXPOSED_GRAY_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_GRAY_COPPER_CANDELABRA, WEATHERED_GRAY_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_GRAY_COPPER_CANDELABRA, OXIDIZED_GRAY_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(GRAY_COPPER_CANDELABRA, WAXED_GRAY_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_GRAY_COPPER_CANDELABRA, WAXED_EXPOSED_GRAY_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_GRAY_COPPER_CANDELABRA, WAXED_WEATHERED_GRAY_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_GRAY_COPPER_CANDELABRA, WAXED_OXIDIZED_GRAY_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(BLACK_COPPER_CANDELABRA, EXPOSED_BLACK_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_BLACK_COPPER_CANDELABRA, WEATHERED_BLACK_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_BLACK_COPPER_CANDELABRA, OXIDIZED_BLACK_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(BLACK_COPPER_CANDELABRA, WAXED_BLACK_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_BLACK_COPPER_CANDELABRA, WAXED_EXPOSED_BLACK_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_BLACK_COPPER_CANDELABRA, WAXED_WEATHERED_BLACK_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_BLACK_COPPER_CANDELABRA, WAXED_OXIDIZED_BLACK_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(BROWN_COPPER_CANDELABRA, EXPOSED_BROWN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_BROWN_COPPER_CANDELABRA, WEATHERED_BROWN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_BROWN_COPPER_CANDELABRA, OXIDIZED_BROWN_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(BROWN_COPPER_CANDELABRA, WAXED_BROWN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_BROWN_COPPER_CANDELABRA, WAXED_EXPOSED_BROWN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_BROWN_COPPER_CANDELABRA, WAXED_WEATHERED_BROWN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_BROWN_COPPER_CANDELABRA, WAXED_OXIDIZED_BROWN_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(RED_COPPER_CANDELABRA, EXPOSED_RED_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_RED_COPPER_CANDELABRA, WEATHERED_RED_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_RED_COPPER_CANDELABRA, OXIDIZED_RED_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(RED_COPPER_CANDELABRA, WAXED_RED_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_RED_COPPER_CANDELABRA, WAXED_EXPOSED_RED_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_RED_COPPER_CANDELABRA, WAXED_WEATHERED_RED_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_RED_COPPER_CANDELABRA, WAXED_OXIDIZED_RED_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ORANGE_COPPER_CANDELABRA, EXPOSED_ORANGE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_ORANGE_COPPER_CANDELABRA, WEATHERED_ORANGE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_ORANGE_COPPER_CANDELABRA, OXIDIZED_ORANGE_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ORANGE_COPPER_CANDELABRA, WAXED_ORANGE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_ORANGE_COPPER_CANDELABRA, WAXED_EXPOSED_ORANGE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_ORANGE_COPPER_CANDELABRA, WAXED_WEATHERED_ORANGE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_ORANGE_COPPER_CANDELABRA, WAXED_OXIDIZED_ORANGE_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(YELLOW_COPPER_CANDELABRA, EXPOSED_YELLOW_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_YELLOW_COPPER_CANDELABRA, WEATHERED_YELLOW_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_YELLOW_COPPER_CANDELABRA, OXIDIZED_YELLOW_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(YELLOW_COPPER_CANDELABRA, WAXED_YELLOW_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_YELLOW_COPPER_CANDELABRA, WAXED_EXPOSED_YELLOW_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_YELLOW_COPPER_CANDELABRA, WAXED_WEATHERED_YELLOW_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_YELLOW_COPPER_CANDELABRA, WAXED_OXIDIZED_YELLOW_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(LIME_COPPER_CANDELABRA, EXPOSED_LIME_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_LIME_COPPER_CANDELABRA, WEATHERED_LIME_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_LIME_COPPER_CANDELABRA, OXIDIZED_LIME_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(LIME_COPPER_CANDELABRA, WAXED_LIME_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_LIME_COPPER_CANDELABRA, WAXED_EXPOSED_LIME_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_LIME_COPPER_CANDELABRA, WAXED_WEATHERED_LIME_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_LIME_COPPER_CANDELABRA, WAXED_OXIDIZED_LIME_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(GREEN_COPPER_CANDELABRA, EXPOSED_GREEN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_GREEN_COPPER_CANDELABRA, WEATHERED_GREEN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_GREEN_COPPER_CANDELABRA, OXIDIZED_GREEN_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(GREEN_COPPER_CANDELABRA, WAXED_GREEN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_GREEN_COPPER_CANDELABRA, WAXED_EXPOSED_GREEN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_GREEN_COPPER_CANDELABRA, WAXED_WEATHERED_GREEN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_GREEN_COPPER_CANDELABRA, WAXED_OXIDIZED_GREEN_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(CYAN_COPPER_CANDELABRA, EXPOSED_CYAN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_CYAN_COPPER_CANDELABRA, WEATHERED_CYAN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_CYAN_COPPER_CANDELABRA, OXIDIZED_CYAN_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(CYAN_COPPER_CANDELABRA, WAXED_CYAN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_CYAN_COPPER_CANDELABRA, WAXED_EXPOSED_CYAN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_CYAN_COPPER_CANDELABRA, WAXED_WEATHERED_CYAN_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_CYAN_COPPER_CANDELABRA, WAXED_OXIDIZED_CYAN_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(BLUE_COPPER_CANDELABRA, EXPOSED_BLUE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_BLUE_COPPER_CANDELABRA, WEATHERED_BLUE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_BLUE_COPPER_CANDELABRA, OXIDIZED_BLUE_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(BLUE_COPPER_CANDELABRA, WAXED_BLUE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_BLUE_COPPER_CANDELABRA, WAXED_EXPOSED_BLUE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_BLUE_COPPER_CANDELABRA, WAXED_WEATHERED_BLUE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_BLUE_COPPER_CANDELABRA, WAXED_OXIDIZED_BLUE_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(LIGHT_BLUE_COPPER_CANDELABRA, EXPOSED_LIGHT_BLUE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_LIGHT_BLUE_COPPER_CANDELABRA, WEATHERED_LIGHT_BLUE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_LIGHT_BLUE_COPPER_CANDELABRA, OXIDIZED_LIGHT_BLUE_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(LIGHT_BLUE_COPPER_CANDELABRA, WAXED_LIGHT_BLUE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_LIGHT_BLUE_COPPER_CANDELABRA, WAXED_EXPOSED_LIGHT_BLUE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_LIGHT_BLUE_COPPER_CANDELABRA, WAXED_WEATHERED_LIGHT_BLUE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_LIGHT_BLUE_COPPER_CANDELABRA, WAXED_OXIDIZED_LIGHT_BLUE_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(MAGENTA_COPPER_CANDELABRA, EXPOSED_MAGENTA_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_MAGENTA_COPPER_CANDELABRA, WEATHERED_MAGENTA_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_MAGENTA_COPPER_CANDELABRA, OXIDIZED_MAGENTA_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(MAGENTA_COPPER_CANDELABRA, WAXED_MAGENTA_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_MAGENTA_COPPER_CANDELABRA, WAXED_EXPOSED_MAGENTA_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_MAGENTA_COPPER_CANDELABRA, WAXED_WEATHERED_MAGENTA_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_MAGENTA_COPPER_CANDELABRA, WAXED_OXIDIZED_MAGENTA_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(PURPLE_COPPER_CANDELABRA, EXPOSED_PURPLE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_PURPLE_COPPER_CANDELABRA, WEATHERED_PURPLE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_PURPLE_COPPER_CANDELABRA, OXIDIZED_PURPLE_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(PURPLE_COPPER_CANDELABRA, WAXED_PURPLE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_PURPLE_COPPER_CANDELABRA, WAXED_EXPOSED_PURPLE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_PURPLE_COPPER_CANDELABRA, WAXED_WEATHERED_PURPLE_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_PURPLE_COPPER_CANDELABRA, WAXED_OXIDIZED_PURPLE_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(PINK_COPPER_CANDELABRA, EXPOSED_PINK_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_PINK_COPPER_CANDELABRA, WEATHERED_PINK_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_PINK_COPPER_CANDELABRA, OXIDIZED_PINK_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(PINK_COPPER_CANDELABRA, WAXED_PINK_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_PINK_COPPER_CANDELABRA, WAXED_EXPOSED_PINK_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_PINK_COPPER_CANDELABRA, WAXED_WEATHERED_PINK_COPPER_CANDELABRA);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_PINK_COPPER_CANDELABRA, WAXED_OXIDIZED_PINK_COPPER_CANDELABRA);

        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_CHANDELIER, WAXED_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_CHANDELIER, WAXED_EXPOSED_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_CHANDELIER, WAXED_WEATHERED_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_CHANDELIER, WAXED_OXIDIZED_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(WHITE_COPPER_CHANDELIER, EXPOSED_WHITE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_WHITE_COPPER_CHANDELIER, WEATHERED_WHITE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_WHITE_COPPER_CHANDELIER, OXIDIZED_WHITE_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(WHITE_COPPER_CHANDELIER, WAXED_WHITE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_WHITE_COPPER_CHANDELIER, WAXED_EXPOSED_WHITE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_WHITE_COPPER_CHANDELIER, WAXED_WEATHERED_WHITE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_WHITE_COPPER_CHANDELIER, WAXED_OXIDIZED_WHITE_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(LIGHT_GRAY_COPPER_CHANDELIER, EXPOSED_LIGHT_GRAY_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_LIGHT_GRAY_COPPER_CHANDELIER, WEATHERED_LIGHT_GRAY_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_LIGHT_GRAY_COPPER_CHANDELIER, OXIDIZED_LIGHT_GRAY_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(LIGHT_GRAY_COPPER_CHANDELIER, WAXED_LIGHT_GRAY_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_LIGHT_GRAY_COPPER_CHANDELIER, WAXED_EXPOSED_LIGHT_GRAY_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_LIGHT_GRAY_COPPER_CHANDELIER, WAXED_WEATHERED_LIGHT_GRAY_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_LIGHT_GRAY_COPPER_CHANDELIER, WAXED_OXIDIZED_LIGHT_GRAY_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(GRAY_COPPER_CHANDELIER, EXPOSED_GRAY_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_GRAY_COPPER_CHANDELIER, WEATHERED_GRAY_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_GRAY_COPPER_CHANDELIER, OXIDIZED_GRAY_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(GRAY_COPPER_CHANDELIER, WAXED_GRAY_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_GRAY_COPPER_CHANDELIER, WAXED_EXPOSED_GRAY_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_GRAY_COPPER_CHANDELIER, WAXED_WEATHERED_GRAY_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_GRAY_COPPER_CHANDELIER, WAXED_OXIDIZED_GRAY_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(BLACK_COPPER_CHANDELIER, EXPOSED_BLACK_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_BLACK_COPPER_CHANDELIER, WEATHERED_BLACK_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_BLACK_COPPER_CHANDELIER, OXIDIZED_BLACK_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(BLACK_COPPER_CHANDELIER, WAXED_BLACK_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_BLACK_COPPER_CHANDELIER, WAXED_EXPOSED_BLACK_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_BLACK_COPPER_CHANDELIER, WAXED_WEATHERED_BLACK_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_BLACK_COPPER_CHANDELIER, WAXED_OXIDIZED_BLACK_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(BROWN_COPPER_CHANDELIER, EXPOSED_BROWN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_BROWN_COPPER_CHANDELIER, WEATHERED_BROWN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_BROWN_COPPER_CHANDELIER, OXIDIZED_BROWN_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(BROWN_COPPER_CHANDELIER, WAXED_BROWN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_BROWN_COPPER_CHANDELIER, WAXED_EXPOSED_BROWN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_BROWN_COPPER_CHANDELIER, WAXED_WEATHERED_BROWN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_BROWN_COPPER_CHANDELIER, WAXED_OXIDIZED_BROWN_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(RED_COPPER_CHANDELIER, EXPOSED_RED_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_RED_COPPER_CHANDELIER, WEATHERED_RED_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_RED_COPPER_CHANDELIER, OXIDIZED_RED_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(RED_COPPER_CHANDELIER, WAXED_RED_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_RED_COPPER_CHANDELIER, WAXED_EXPOSED_RED_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_RED_COPPER_CHANDELIER, WAXED_WEATHERED_RED_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_RED_COPPER_CHANDELIER, WAXED_OXIDIZED_RED_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ORANGE_COPPER_CHANDELIER, EXPOSED_ORANGE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_ORANGE_COPPER_CHANDELIER, WEATHERED_ORANGE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_ORANGE_COPPER_CHANDELIER, OXIDIZED_ORANGE_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ORANGE_COPPER_CHANDELIER, WAXED_ORANGE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_ORANGE_COPPER_CHANDELIER, WAXED_EXPOSED_ORANGE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_ORANGE_COPPER_CHANDELIER, WAXED_WEATHERED_ORANGE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_ORANGE_COPPER_CHANDELIER, WAXED_OXIDIZED_ORANGE_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(YELLOW_COPPER_CHANDELIER, EXPOSED_YELLOW_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_YELLOW_COPPER_CHANDELIER, WEATHERED_YELLOW_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_YELLOW_COPPER_CHANDELIER, OXIDIZED_YELLOW_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(YELLOW_COPPER_CHANDELIER, WAXED_YELLOW_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_YELLOW_COPPER_CHANDELIER, WAXED_EXPOSED_YELLOW_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_YELLOW_COPPER_CHANDELIER, WAXED_WEATHERED_YELLOW_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_YELLOW_COPPER_CHANDELIER, WAXED_OXIDIZED_YELLOW_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(LIME_COPPER_CHANDELIER, EXPOSED_LIME_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_LIME_COPPER_CHANDELIER, WEATHERED_LIME_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_LIME_COPPER_CHANDELIER, OXIDIZED_LIME_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(LIME_COPPER_CHANDELIER, WAXED_LIME_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_LIME_COPPER_CHANDELIER, WAXED_EXPOSED_LIME_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_LIME_COPPER_CHANDELIER, WAXED_WEATHERED_LIME_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_LIME_COPPER_CHANDELIER, WAXED_OXIDIZED_LIME_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(GREEN_COPPER_CHANDELIER, EXPOSED_GREEN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_GREEN_COPPER_CHANDELIER, WEATHERED_GREEN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_GREEN_COPPER_CHANDELIER, OXIDIZED_GREEN_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(GREEN_COPPER_CHANDELIER, WAXED_GREEN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_GREEN_COPPER_CHANDELIER, WAXED_EXPOSED_GREEN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_GREEN_COPPER_CHANDELIER, WAXED_WEATHERED_GREEN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_GREEN_COPPER_CHANDELIER, WAXED_OXIDIZED_GREEN_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(CYAN_COPPER_CHANDELIER, EXPOSED_CYAN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_CYAN_COPPER_CHANDELIER, WEATHERED_CYAN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_CYAN_COPPER_CHANDELIER, OXIDIZED_CYAN_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(CYAN_COPPER_CHANDELIER, WAXED_CYAN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_CYAN_COPPER_CHANDELIER, WAXED_EXPOSED_CYAN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_CYAN_COPPER_CHANDELIER, WAXED_WEATHERED_CYAN_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_CYAN_COPPER_CHANDELIER, WAXED_OXIDIZED_CYAN_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(BLUE_COPPER_CHANDELIER, EXPOSED_BLUE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_BLUE_COPPER_CHANDELIER, WEATHERED_BLUE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_BLUE_COPPER_CHANDELIER, OXIDIZED_BLUE_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(BLUE_COPPER_CHANDELIER, WAXED_BLUE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_BLUE_COPPER_CHANDELIER, WAXED_EXPOSED_BLUE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_BLUE_COPPER_CHANDELIER, WAXED_WEATHERED_BLUE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_BLUE_COPPER_CHANDELIER, WAXED_OXIDIZED_BLUE_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(LIGHT_BLUE_COPPER_CHANDELIER, EXPOSED_LIGHT_BLUE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_LIGHT_BLUE_COPPER_CHANDELIER, WEATHERED_LIGHT_BLUE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_LIGHT_BLUE_COPPER_CHANDELIER, OXIDIZED_LIGHT_BLUE_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(LIGHT_BLUE_COPPER_CHANDELIER, WAXED_LIGHT_BLUE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_LIGHT_BLUE_COPPER_CHANDELIER, WAXED_EXPOSED_LIGHT_BLUE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_LIGHT_BLUE_COPPER_CHANDELIER, WAXED_WEATHERED_LIGHT_BLUE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_LIGHT_BLUE_COPPER_CHANDELIER, WAXED_OXIDIZED_LIGHT_BLUE_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(MAGENTA_COPPER_CHANDELIER, EXPOSED_MAGENTA_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_MAGENTA_COPPER_CHANDELIER, WEATHERED_MAGENTA_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_MAGENTA_COPPER_CHANDELIER, OXIDIZED_MAGENTA_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(MAGENTA_COPPER_CHANDELIER, WAXED_MAGENTA_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_MAGENTA_COPPER_CHANDELIER, WAXED_EXPOSED_MAGENTA_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_MAGENTA_COPPER_CHANDELIER, WAXED_WEATHERED_MAGENTA_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_MAGENTA_COPPER_CHANDELIER, WAXED_OXIDIZED_MAGENTA_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(PURPLE_COPPER_CHANDELIER, EXPOSED_PURPLE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_PURPLE_COPPER_CHANDELIER, WEATHERED_PURPLE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_PURPLE_COPPER_CHANDELIER, OXIDIZED_PURPLE_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(PURPLE_COPPER_CHANDELIER, WAXED_PURPLE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_PURPLE_COPPER_CHANDELIER, WAXED_EXPOSED_PURPLE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_PURPLE_COPPER_CHANDELIER, WAXED_WEATHERED_PURPLE_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_PURPLE_COPPER_CHANDELIER, WAXED_OXIDIZED_PURPLE_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(PINK_COPPER_CHANDELIER, EXPOSED_PINK_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_PINK_COPPER_CHANDELIER, WEATHERED_PINK_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_PINK_COPPER_CHANDELIER, OXIDIZED_PINK_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerWaxableBlockPair(PINK_COPPER_CHANDELIER, WAXED_PINK_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_PINK_COPPER_CHANDELIER, WAXED_EXPOSED_PINK_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_PINK_COPPER_CHANDELIER, WAXED_WEATHERED_PINK_COPPER_CHANDELIER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_PINK_COPPER_CHANDELIER, WAXED_OXIDIZED_PINK_COPPER_CHANDELIER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_CHAIN, EXPOSED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_CHAIN, WEATHERED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_CHAIN, OXIDIZED_COPPER_CHAIN);

        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_CHAIN, WAXED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_CHAIN, WAXED_EXPOSED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_CHAIN, WAXED_WEATHERED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_CHAIN, WAXED_OXIDIZED_COPPER_CHAIN);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_DOOR, EXPOSED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_DOOR, WEATHERED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_DOOR, OXIDIZED_COPPER_DOOR);

        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_DOOR, WAXED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_DOOR, WAXED_EXPOSED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_DOOR, WAXED_WEATHERED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_DOOR, WAXED_OXIDIZED_COPPER_DOOR);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_LANTERN, EXPOSED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_LANTERN, WEATHERED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_LANTERN, OXIDIZED_COPPER_LANTERN);

        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_LANTERN, WAXED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_LANTERN, WAXED_EXPOSED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_LANTERN, WAXED_WEATHERED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_LANTERN, WAXED_OXIDIZED_COPPER_LANTERN);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_SOUL_LANTERN, EXPOSED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_SOUL_LANTERN, WEATHERED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_SOUL_LANTERN, OXIDIZED_COPPER_SOUL_LANTERN);

        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_SOUL_LANTERN, WAXED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_SOUL_LANTERN, WAXED_EXPOSED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_SOUL_LANTERN, WAXED_WEATHERED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_SOUL_LANTERN, WAXED_OXIDIZED_COPPER_SOUL_LANTERN);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_PRESSURE_PLATE, EXPOSED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_PRESSURE_PLATE, WEATHERED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_PRESSURE_PLATE, OXIDIZED_COPPER_PRESSURE_PLATE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_PRESSURE_PLATE, WAXED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_PRESSURE_PLATE, WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_PRESSURE_PLATE, WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_PRESSURE_PLATE, WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_TRAPDOOR, EXPOSED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_TRAPDOOR, WEATHERED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_TRAPDOOR, OXIDIZED_COPPER_TRAPDOOR);

        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_TRAPDOOR, WAXED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_TRAPDOOR, WAXED_EXPOSED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_TRAPDOOR, WAXED_WEATHERED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_TRAPDOOR, WAXED_OXIDIZED_COPPER_TRAPDOOR);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_WALL_CANDLE, EXPOSED_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_WALL_CANDLE, WEATHERED_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_WALL_CANDLE, OXIDIZED_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_WALL_CANDLE, WAXED_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_WALL_CANDLE, WAXED_EXPOSED_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_WALL_CANDLE, WAXED_WEATHERED_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_WALL_CANDLE, WAXED_OXIDIZED_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(WHITE_COPPER_WALL_CANDLE, EXPOSED_WHITE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_WHITE_COPPER_WALL_CANDLE, WEATHERED_WHITE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_WHITE_COPPER_WALL_CANDLE, OXIDIZED_WHITE_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(WHITE_COPPER_WALL_CANDLE, WAXED_WHITE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_WHITE_COPPER_WALL_CANDLE, WAXED_EXPOSED_WHITE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_WHITE_COPPER_WALL_CANDLE, WAXED_WEATHERED_WHITE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_WHITE_COPPER_WALL_CANDLE, WAXED_OXIDIZED_WHITE_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(LIGHT_GRAY_COPPER_WALL_CANDLE, EXPOSED_LIGHT_GRAY_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_LIGHT_GRAY_COPPER_WALL_CANDLE, WEATHERED_LIGHT_GRAY_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_LIGHT_GRAY_COPPER_WALL_CANDLE, OXIDIZED_LIGHT_GRAY_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(LIGHT_GRAY_COPPER_WALL_CANDLE, WAXED_LIGHT_GRAY_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_LIGHT_GRAY_COPPER_WALL_CANDLE, WAXED_EXPOSED_LIGHT_GRAY_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_LIGHT_GRAY_COPPER_WALL_CANDLE, WAXED_WEATHERED_LIGHT_GRAY_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_LIGHT_GRAY_COPPER_WALL_CANDLE, WAXED_OXIDIZED_LIGHT_GRAY_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(GRAY_COPPER_WALL_CANDLE, EXPOSED_GRAY_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_GRAY_COPPER_WALL_CANDLE, WEATHERED_GRAY_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_GRAY_COPPER_WALL_CANDLE, OXIDIZED_GRAY_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(GRAY_COPPER_WALL_CANDLE, WAXED_GRAY_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_GRAY_COPPER_WALL_CANDLE, WAXED_EXPOSED_GRAY_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_GRAY_COPPER_WALL_CANDLE, WAXED_WEATHERED_GRAY_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_GRAY_COPPER_WALL_CANDLE, WAXED_OXIDIZED_GRAY_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(BLACK_COPPER_WALL_CANDLE, EXPOSED_BLACK_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_BLACK_COPPER_WALL_CANDLE, WEATHERED_BLACK_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_BLACK_COPPER_WALL_CANDLE, OXIDIZED_BLACK_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(BLACK_COPPER_WALL_CANDLE, WAXED_BLACK_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_BLACK_COPPER_WALL_CANDLE, WAXED_EXPOSED_BLACK_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_BLACK_COPPER_WALL_CANDLE, WAXED_WEATHERED_BLACK_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_BLACK_COPPER_WALL_CANDLE, WAXED_OXIDIZED_BLACK_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(BROWN_COPPER_WALL_CANDLE, EXPOSED_BROWN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_BROWN_COPPER_WALL_CANDLE, WEATHERED_BROWN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_BROWN_COPPER_WALL_CANDLE, OXIDIZED_BROWN_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(BROWN_COPPER_WALL_CANDLE, WAXED_BROWN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_BROWN_COPPER_WALL_CANDLE, WAXED_EXPOSED_BROWN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_BROWN_COPPER_WALL_CANDLE, WAXED_WEATHERED_BROWN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_BROWN_COPPER_WALL_CANDLE, WAXED_OXIDIZED_BROWN_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(RED_COPPER_WALL_CANDLE, EXPOSED_RED_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_RED_COPPER_WALL_CANDLE, WEATHERED_RED_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_RED_COPPER_WALL_CANDLE, OXIDIZED_RED_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(RED_COPPER_WALL_CANDLE, WAXED_RED_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_RED_COPPER_WALL_CANDLE, WAXED_EXPOSED_RED_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_RED_COPPER_WALL_CANDLE, WAXED_WEATHERED_RED_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_RED_COPPER_WALL_CANDLE, WAXED_OXIDIZED_RED_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ORANGE_COPPER_WALL_CANDLE, EXPOSED_ORANGE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_ORANGE_COPPER_WALL_CANDLE, WEATHERED_ORANGE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_ORANGE_COPPER_WALL_CANDLE, OXIDIZED_ORANGE_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ORANGE_COPPER_WALL_CANDLE, WAXED_ORANGE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_ORANGE_COPPER_WALL_CANDLE, WAXED_EXPOSED_ORANGE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_ORANGE_COPPER_WALL_CANDLE, WAXED_WEATHERED_ORANGE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_ORANGE_COPPER_WALL_CANDLE, WAXED_OXIDIZED_ORANGE_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(YELLOW_COPPER_WALL_CANDLE, EXPOSED_YELLOW_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_YELLOW_COPPER_WALL_CANDLE, WEATHERED_YELLOW_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_YELLOW_COPPER_WALL_CANDLE, OXIDIZED_YELLOW_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(YELLOW_COPPER_WALL_CANDLE, WAXED_YELLOW_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_YELLOW_COPPER_WALL_CANDLE, WAXED_EXPOSED_YELLOW_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_YELLOW_COPPER_WALL_CANDLE, WAXED_WEATHERED_YELLOW_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_YELLOW_COPPER_WALL_CANDLE, WAXED_OXIDIZED_YELLOW_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(LIME_COPPER_WALL_CANDLE, EXPOSED_LIME_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_LIME_COPPER_WALL_CANDLE, WEATHERED_LIME_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_LIME_COPPER_WALL_CANDLE, OXIDIZED_LIME_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(LIME_COPPER_WALL_CANDLE, WAXED_LIME_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_LIME_COPPER_WALL_CANDLE, WAXED_EXPOSED_LIME_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_LIME_COPPER_WALL_CANDLE, WAXED_WEATHERED_LIME_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_LIME_COPPER_WALL_CANDLE, WAXED_OXIDIZED_LIME_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(GREEN_COPPER_WALL_CANDLE, EXPOSED_GREEN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_GREEN_COPPER_WALL_CANDLE, WEATHERED_GREEN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_GREEN_COPPER_WALL_CANDLE, OXIDIZED_GREEN_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(GREEN_COPPER_WALL_CANDLE, WAXED_GREEN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_GREEN_COPPER_WALL_CANDLE, WAXED_EXPOSED_GREEN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_GREEN_COPPER_WALL_CANDLE, WAXED_WEATHERED_GREEN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_GREEN_COPPER_WALL_CANDLE, WAXED_OXIDIZED_GREEN_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(CYAN_COPPER_WALL_CANDLE, EXPOSED_CYAN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_CYAN_COPPER_WALL_CANDLE, WEATHERED_CYAN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_CYAN_COPPER_WALL_CANDLE, OXIDIZED_CYAN_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(CYAN_COPPER_WALL_CANDLE, WAXED_CYAN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_CYAN_COPPER_WALL_CANDLE, WAXED_EXPOSED_CYAN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_CYAN_COPPER_WALL_CANDLE, WAXED_WEATHERED_CYAN_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_CYAN_COPPER_WALL_CANDLE, WAXED_OXIDIZED_CYAN_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(BLUE_COPPER_WALL_CANDLE, EXPOSED_BLUE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_BLUE_COPPER_WALL_CANDLE, WEATHERED_BLUE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_BLUE_COPPER_WALL_CANDLE, OXIDIZED_BLUE_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(BLUE_COPPER_WALL_CANDLE, WAXED_BLUE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_BLUE_COPPER_WALL_CANDLE, WAXED_EXPOSED_BLUE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_BLUE_COPPER_WALL_CANDLE, WAXED_WEATHERED_BLUE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_BLUE_COPPER_WALL_CANDLE, WAXED_OXIDIZED_BLUE_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(LIGHT_BLUE_COPPER_WALL_CANDLE, EXPOSED_LIGHT_BLUE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_LIGHT_BLUE_COPPER_WALL_CANDLE, WEATHERED_LIGHT_BLUE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_LIGHT_BLUE_COPPER_WALL_CANDLE, OXIDIZED_LIGHT_BLUE_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(LIGHT_BLUE_COPPER_WALL_CANDLE, WAXED_LIGHT_BLUE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_LIGHT_BLUE_COPPER_WALL_CANDLE, WAXED_EXPOSED_LIGHT_BLUE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_LIGHT_BLUE_COPPER_WALL_CANDLE, WAXED_WEATHERED_LIGHT_BLUE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_LIGHT_BLUE_COPPER_WALL_CANDLE, WAXED_OXIDIZED_LIGHT_BLUE_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(MAGENTA_COPPER_WALL_CANDLE, EXPOSED_MAGENTA_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_MAGENTA_COPPER_WALL_CANDLE, WEATHERED_MAGENTA_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_MAGENTA_COPPER_WALL_CANDLE, OXIDIZED_MAGENTA_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(MAGENTA_COPPER_WALL_CANDLE, WAXED_MAGENTA_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_MAGENTA_COPPER_WALL_CANDLE, WAXED_EXPOSED_MAGENTA_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_MAGENTA_COPPER_WALL_CANDLE, WAXED_WEATHERED_MAGENTA_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_MAGENTA_COPPER_WALL_CANDLE, WAXED_OXIDIZED_MAGENTA_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(PURPLE_COPPER_WALL_CANDLE, EXPOSED_PURPLE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_PURPLE_COPPER_WALL_CANDLE, WEATHERED_PURPLE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_PURPLE_COPPER_WALL_CANDLE, OXIDIZED_PURPLE_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(PURPLE_COPPER_WALL_CANDLE, WAXED_PURPLE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_PURPLE_COPPER_WALL_CANDLE, WAXED_EXPOSED_PURPLE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_PURPLE_COPPER_WALL_CANDLE, WAXED_WEATHERED_PURPLE_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_PURPLE_COPPER_WALL_CANDLE, WAXED_OXIDIZED_PURPLE_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(PINK_COPPER_WALL_CANDLE, EXPOSED_PINK_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_PINK_COPPER_WALL_CANDLE, WEATHERED_PINK_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_PINK_COPPER_WALL_CANDLE, OXIDIZED_PINK_COPPER_WALL_CANDLE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(PINK_COPPER_WALL_CANDLE, WAXED_PINK_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_PINK_COPPER_WALL_CANDLE, WAXED_EXPOSED_PINK_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_PINK_COPPER_WALL_CANDLE, WAXED_WEATHERED_PINK_COPPER_WALL_CANDLE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_PINK_COPPER_WALL_CANDLE, WAXED_OXIDIZED_PINK_COPPER_WALL_CANDLE);
    }

    public static void registerModBlocks() {
        Clutter.LOGGER.info("Registering ModBlocks for " + Clutter.MOD_ID);
    }
}