/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.havahsadventure.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.havahsadventure.block.*;
import net.mcreator.havahsadventure.HavahsAdventureMod;

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
	public static final DeferredBlock<Block> GRAY_ABOVE_TRAPDOOR;
	public static final DeferredBlock<Block> STRIPPED_GRAY_ABOVE_LOG;
	public static final DeferredBlock<Block> STRIPPED_GRAY_ABOVE_WOOD;
	public static final DeferredBlock<Block> GRAY_ABOVE_WOOD;
	public static final DeferredBlock<Block> GRAY_ABOVE_PLANKS_DOOR;
	public static final DeferredBlock<Block> GRAY_ABOVE_PLANKS_STAIRS;
	public static final DeferredBlock<Block> GRAY_ABOVE_PLANKS_SLABS;
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
		GRAY_ABOVE_TRAPDOOR = REGISTRY.register("gray_above_trapdoor", GrayAboveTrapdoorBlock::new);
		STRIPPED_GRAY_ABOVE_LOG = REGISTRY.register("stripped_gray_above_log", StrippedGrayAboveLogBlock::new);
		STRIPPED_GRAY_ABOVE_WOOD = REGISTRY.register("stripped_gray_above_wood", StrippedGrayAboveWoodBlock::new);
		GRAY_ABOVE_WOOD = REGISTRY.register("gray_above_wood", GrayAboveWoodBlock::new);
		GRAY_ABOVE_PLANKS_DOOR = REGISTRY.register("gray_above_planks_door", GrayAbovePlanksDoorBlock::new);
		GRAY_ABOVE_PLANKS_STAIRS = REGISTRY.register("gray_above_planks_stairs", GrayAbovePlanksStairsBlock::new);
		GRAY_ABOVE_PLANKS_SLABS = REGISTRY.register("gray_above_planks_slabs", GrayAbovePlanksSlabsBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}