/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.hands_on_digits.havahsadventure.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.renderer.Sheets;

import org.hands_on_digits.havahsadventure.HavahsAdventureMod;
import org.hands_on_digits.havahsadventure.block.*;

@EventBusSubscriber
public class HavahsAdventureModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(HavahsAdventureMod.MODID);
	public static final DeferredBlock<Block> ABOVE_BLOCK;
	public static final DeferredBlock<Block> ABOVE_BRICK_BLOCK;
	public static final DeferredBlock<Block> LIGHT_CRYSTAL_BLOCK;
	public static final DeferredBlock<Block> ABOVE_BRICK_STAIR_BLOCK;
	public static final DeferredBlock<Block> ABOVE_BRICK_SLAB_BLOCK;
	public static final DeferredBlock<Block> ABOVE_PORTAL;
	public static final DeferredBlock<Block> SOFT_ABOVE_BLOCK;
	public static final DeferredBlock<Block> ABOVE_SAND;
	public static final DeferredBlock<Block> ABOVE_GRASS_BLOCK;
	public static final DeferredBlock<Block> ABOVE_DIRT;
	public static final DeferredBlock<Block> SKYROOT;
	public static final DeferredBlock<Block> LIGHT_SPIRAL;
	public static final DeferredBlock<Block> POTTED_LIGHT_SPIRAL;
	public static final DeferredBlock<Block> NEEDLE_GRASS;
	public static final DeferredBlock<Block> NEEDLE_COTTON_CROP;
	public static final DeferredBlock<Block> GRAY_ABOVE_LOG;
	public static final DeferredBlock<Block> GRAY_ABOVE_PLANKS;
	public static final DeferredBlock<Block> GRAY_ABOVE_WOOD_TRAPDOOR;
	public static final DeferredBlock<Block> STRIPPED_GRAY_ABOVE_LOG;
	public static final DeferredBlock<Block> STRIPPED_GRAY_ABOVE_WOOD;
	public static final DeferredBlock<Block> GRAY_ABOVE_WOOD;
	public static final DeferredBlock<Block> GRAY_ABOVE_PLANKS_DOOR;
	public static final DeferredBlock<Block> GRAY_ABOVE_PLANKS_STAIRS;
	public static final DeferredBlock<Block> GRAY_ABOVE_PLANKS_SLABS;
	public static final DeferredBlock<Block> GRAY_ABOVE_PLANKS_FENCE;
	public static final DeferredBlock<Block> GRAY_ABOVE_PLANKS_FENCE_GATE;
	public static final DeferredBlock<Block> GRAY_ABOVE_PLANKS_PRESSURE_PLATE;
	public static final DeferredBlock<Block> ABOVE_BRICK_BLOCK_WALL;
	public static final DeferredBlock<Block> GRAY_ABOVE_WOOD_BUTTON;
	public static final DeferredBlock<Block> ABOVE_BLOCK_BUTTON;
	public static final DeferredBlock<Block> STRIPPED_GRAY_ABOVE_LOG_HENGING_SIGN;
	public static final DeferredBlock<Block> STRIPPED_GRAY_ABOVE_LOG_HENGING_WALL_SIGN;
	public static final DeferredBlock<Block> GRAY_ABOVE_PLANKS_SIGN;
	public static final DeferredBlock<Block> GRAY_ABOVE_PLANKS_WALL_SIGN;
	public static final DeferredBlock<Block> GRAY_ABOVE_LEAVES;
	public static final DeferredBlock<Block> GRAY_ABOVE_TREE;
	public static final DeferredBlock<Block> POTTED_GRAY_ABOVE_SAPLING;
	public static final DeferredBlock<Block> ABOVE_BLOCK_PRESSURE_PLATE;
	static {
		ABOVE_BLOCK = REGISTRY.register("above_block", AboveBlockBlock::new);
		ABOVE_BRICK_BLOCK = REGISTRY.register("above_brick_block", AboveBrickBlockBlock::new);
		LIGHT_CRYSTAL_BLOCK = REGISTRY.register("light_crystal_block", LightCrystalBlockBlock::new);
		ABOVE_BRICK_STAIR_BLOCK = REGISTRY.register("above_brick_stair_block", AboveBrickStairBlockBlock::new);
		ABOVE_BRICK_SLAB_BLOCK = REGISTRY.register("above_brick_slab_block", AboveBrickSlabBlockBlock::new);
		ABOVE_PORTAL = REGISTRY.register("above_portal", AbovePortalBlock::new);
		SOFT_ABOVE_BLOCK = REGISTRY.register("soft_above_block", SoftAboveBlockBlock::new);
		ABOVE_SAND = REGISTRY.register("above_sand", AboveSandBlock::new);
		ABOVE_GRASS_BLOCK = REGISTRY.register("above_grass_block", AboveGrassBlockBlock::new);
		ABOVE_DIRT = REGISTRY.register("above_dirt", AboveDirtBlock::new);
		SKYROOT = REGISTRY.register("skyroot", SkyrootBlock::new);
		LIGHT_SPIRAL = REGISTRY.register("light_spiral", LightSpiralBlock::new);
		POTTED_LIGHT_SPIRAL = REGISTRY.register("potted_light_spiral", PottedLightSpiralBlock::new);
		NEEDLE_GRASS = REGISTRY.register("needle_grass", NeedleGrassBlock::new);
		NEEDLE_COTTON_CROP = REGISTRY.register("needle_cotton_crop", NeedleCottonCropBlock::new);
		GRAY_ABOVE_LOG = REGISTRY.register("gray_above_log", GrayAboveLogBlock::new);
		GRAY_ABOVE_PLANKS = REGISTRY.register("gray_above_planks", GrayAbovePlanksBlock::new);
		GRAY_ABOVE_WOOD_TRAPDOOR = REGISTRY.register("gray_above_wood_trapdoor", GrayAboveTrapdoorBlock::new);
		STRIPPED_GRAY_ABOVE_LOG = REGISTRY.register("stripped_gray_above_log", StrippedGrayAboveLogBlock::new);
		STRIPPED_GRAY_ABOVE_WOOD = REGISTRY.register("stripped_gray_above_wood", StrippedGrayAboveWoodBlock::new);
		GRAY_ABOVE_WOOD = REGISTRY.register("gray_above_wood", GrayAboveWoodBlock::new);
		GRAY_ABOVE_PLANKS_DOOR = REGISTRY.register("gray_above_planks_door", GrayAbovePlanksDoorBlock::new);
		GRAY_ABOVE_PLANKS_STAIRS = REGISTRY.register("gray_above_planks_stairs", GrayAbovePlanksStairsBlock::new);
		GRAY_ABOVE_PLANKS_SLABS = REGISTRY.register("gray_above_planks_slabs", GrayAbovePlanksSlabsBlock::new);
		GRAY_ABOVE_PLANKS_FENCE = REGISTRY.register("gray_above_planks_fence", GrayAbovePlanksFenceBlock::new);
		GRAY_ABOVE_PLANKS_FENCE_GATE = REGISTRY.register("gray_above_planks_fence_gate", GrayAbovePlanksFenceGateBlock::new);
		GRAY_ABOVE_PLANKS_PRESSURE_PLATE = REGISTRY.register("gray_above_planks_pressure_plate", GrayAbovePlanksPressurePlateBlock::new);
		ABOVE_BRICK_BLOCK_WALL = REGISTRY.register("above_brick_block_wall", AboveBrickBlockWallBlock::new);
		GRAY_ABOVE_WOOD_BUTTON = REGISTRY.register("gray_above_wood_button", GrayAboveWoodButtonBlock::new);
		ABOVE_BLOCK_BUTTON = REGISTRY.register("above_block_button", AboveBlockButtonBlock::new);
		STRIPPED_GRAY_ABOVE_LOG_HENGING_SIGN = REGISTRY.register("stripped_gray_above_log_henging_sign", StrippedGrayAboveLogHengingSignBlock::new);
		STRIPPED_GRAY_ABOVE_LOG_HENGING_WALL_SIGN = REGISTRY.register("stripped_gray_above_log_henging_wall_sign", StrippedGrayAboveLogHengingWallSignBlock::new);
		GRAY_ABOVE_PLANKS_SIGN = REGISTRY.register("gray_above_planks_sign", GrayAbovePlanksSignBlock::new);
		GRAY_ABOVE_PLANKS_WALL_SIGN = REGISTRY.register("gray_above_planks_wall_sign", GrayAbovePlanksWallSignBlock::new);
		GRAY_ABOVE_LEAVES = REGISTRY.register("gray_above_leaves", GrayAboveLeavesBlock::new);
		GRAY_ABOVE_TREE = REGISTRY.register("gray_above_tree", GrayAboveTreeBlock::new);
		POTTED_GRAY_ABOVE_SAPLING = REGISTRY.register("potted_gray_above_sapling", PottedGrayAboveSaplingBlock::new);
		ABOVE_BLOCK_PRESSURE_PLATE = REGISTRY.register("above_block_pressure_plate", AboveBlockPressurePlateBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@EventBusSubscriber(Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			Sheets.addWoodType(HavahsAdventureModWoodTypes.STRIPPED_GRAY_ABOVE_LOG_HENGING_SIGN_WOOD_TYPE);
			Sheets.addWoodType(HavahsAdventureModWoodTypes.GRAY_ABOVE_PLANKS_SIGN_WOOD_TYPE);
		}
	}

	@SubscribeEvent
	public static void registerSigns(BlockEntityTypeAddBlocksEvent event) {
		event.modify(BlockEntityType.HANGING_SIGN, STRIPPED_GRAY_ABOVE_LOG_HENGING_SIGN.get(), STRIPPED_GRAY_ABOVE_LOG_HENGING_WALL_SIGN.get());
		event.modify(BlockEntityType.SIGN, GRAY_ABOVE_PLANKS_SIGN.get(), GRAY_ABOVE_PLANKS_WALL_SIGN.get());
	}
}