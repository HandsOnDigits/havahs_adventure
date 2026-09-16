/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.havahsadventure.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.havahsadventure.item.*;
import net.mcreator.havahsadventure.HavahsAdventureMod;

public class HavahsAdventureModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(HavahsAdventureMod.MODID);
	public static final DeferredItem<Item> ABOVE_BLOCK;
	public static final DeferredItem<Item> FINEL_KEY;
	public static final DeferredItem<Item> ABOVE_BRICK_BLOCK;
	public static final DeferredItem<Item> LIGHT_CRYSTAL_BLOCK;
	public static final DeferredItem<Item> LIGHT_CRYSTAL;
	public static final DeferredItem<Item> ABOVE_BRICK_STAIR_BLOCK;
	public static final DeferredItem<Item> ABOVE_BRICK_SLAB_BLOCK;
	public static final DeferredItem<Item> ABOVE;
	public static final DeferredItem<Item> PEGASUS_SPAWN_EGG;
	public static final DeferredItem<Item> RAW_PEGASUS_MEAT;
	public static final DeferredItem<Item> COOKED_PEGASUS_MEAT;
	public static final DeferredItem<Item> SOFT_ABOVE_BLOCK;
	public static final DeferredItem<Item> GUARD_SPAWN_EGG;
	public static final DeferredItem<Item> GUARD_ATTACK_SPAWN_EGG;
	public static final DeferredItem<Item> EYE_BANNER_PATTERN;
	public static final DeferredItem<Item> ABOVE_SAND;
	public static final DeferredItem<Item> ABOVE_GRASS_BLOCK;
	public static final DeferredItem<Item> ABOVE_DIRT;
	public static final DeferredItem<Item> SKYROOT;
	public static final DeferredItem<Item> SKYROOT_FRUIT;
	public static final DeferredItem<Item> LIGHT_SPIRAL;
	public static final DeferredItem<Item> POTTED_LIGHT_SPIRAL;
	public static final DeferredItem<Item> NEEDLE_GRASS;
	public static final DeferredItem<Item> NEEDLE_COTTON_SEED;
	public static final DeferredItem<Item> NEEDLE_COTTON_FIBERS;
	public static final DeferredItem<Item> NEEDLE_COTTON_FABRIC;
	public static final DeferredItem<Item> GRAY_ABOVE_LOG;
	public static final DeferredItem<Item> GRAY_ABOVE_PLANKS;
	public static final DeferredItem<Item> GRAY_ABOVE_WOOD_TRAPDOOR;
	public static final DeferredItem<Item> STRIPPED_GRAY_ABOVE_LOG;
	public static final DeferredItem<Item> STRIPPED_GRAY_ABOVE_WOOD;
	public static final DeferredItem<Item> GRAY_ABOVE_WOOD;
	public static final DeferredItem<Item> GRAY_ABOVE_PLANKS_DOOR;
	public static final DeferredItem<Item> GRAY_ABOVE_PLANKS_STAIRS;
	public static final DeferredItem<Item> GRAY_ABOVE_PLANKS_SLABS;
	public static final DeferredItem<Item> GRAY_ABOVE_PLANKS_FENCE;
	public static final DeferredItem<Item> GRAY_ABOVE_PLANKS_FENCE_GATE;
	public static final DeferredItem<Item> GRAY_ABOVE_PLANKS_PRESSURE_PLATE;
	public static final DeferredItem<Item> ABOVE_BRICK_BLOCK_WALL;
	static {
		ABOVE_BLOCK = block(HavahsAdventureModBlocks.ABOVE_BLOCK, new Item.Properties().fireResistant());
		FINEL_KEY = REGISTRY.register("finel_key", FinelKeyItem::new);
		ABOVE_BRICK_BLOCK = block(HavahsAdventureModBlocks.ABOVE_BRICK_BLOCK);
		LIGHT_CRYSTAL_BLOCK = block(HavahsAdventureModBlocks.LIGHT_CRYSTAL_BLOCK, new Item.Properties().fireResistant());
		LIGHT_CRYSTAL = REGISTRY.register("light_crystal", LightCrystalItem::new);
		ABOVE_BRICK_STAIR_BLOCK = block(HavahsAdventureModBlocks.ABOVE_BRICK_STAIR_BLOCK);
		ABOVE_BRICK_SLAB_BLOCK = block(HavahsAdventureModBlocks.ABOVE_BRICK_SLAB_BLOCK);
		ABOVE = REGISTRY.register("above", AboveItem::new);
		PEGASUS_SPAWN_EGG = REGISTRY.register("pegasus_spawn_egg", () -> new DeferredSpawnEggItem(HavahsAdventureModEntities.PEGASUS, -1, -6710887, new Item.Properties()));
		RAW_PEGASUS_MEAT = REGISTRY.register("raw_pegasus_meat", RawPegasusMeatItem::new);
		COOKED_PEGASUS_MEAT = REGISTRY.register("cooked_pegasus_meat", CookedPegasusMeatItem::new);
		SOFT_ABOVE_BLOCK = block(HavahsAdventureModBlocks.SOFT_ABOVE_BLOCK, new Item.Properties().fireResistant());
		GUARD_SPAWN_EGG = REGISTRY.register("guard_spawn_egg", () -> new DeferredSpawnEggItem(HavahsAdventureModEntities.GUARD, -256, -13434829, new Item.Properties()));
		GUARD_ATTACK_SPAWN_EGG = REGISTRY.register("guard_attack_spawn_egg", () -> new DeferredSpawnEggItem(HavahsAdventureModEntities.GUARD_ATTACK, -13434829, -65536, new Item.Properties()));
		EYE_BANNER_PATTERN = REGISTRY.register("eye_banner_pattern", EyeBannerPatternItem::new);
		ABOVE_SAND = block(HavahsAdventureModBlocks.ABOVE_SAND, new Item.Properties().fireResistant());
		ABOVE_GRASS_BLOCK = block(HavahsAdventureModBlocks.ABOVE_GRASS_BLOCK);
		ABOVE_DIRT = block(HavahsAdventureModBlocks.ABOVE_DIRT);
		SKYROOT = block(HavahsAdventureModBlocks.SKYROOT);
		SKYROOT_FRUIT = REGISTRY.register("skyroot_fruit", SkyrootFruitItem::new);
		LIGHT_SPIRAL = block(HavahsAdventureModBlocks.LIGHT_SPIRAL, new Item.Properties().fireResistant());
		POTTED_LIGHT_SPIRAL = block(HavahsAdventureModBlocks.POTTED_LIGHT_SPIRAL);
		NEEDLE_GRASS = block(HavahsAdventureModBlocks.NEEDLE_GRASS);
		NEEDLE_COTTON_SEED = REGISTRY.register("needle_cotton_seed", NeedleCottonSeedItem::new);
		NEEDLE_COTTON_FIBERS = REGISTRY.register("needle_cotton_fibers", NeedleCottonFibersItem::new);
		NEEDLE_COTTON_FABRIC = REGISTRY.register("needle_cotton_fabric", NeedleCottonFabricItem::new);
		GRAY_ABOVE_LOG = block(HavahsAdventureModBlocks.GRAY_ABOVE_LOG);
		GRAY_ABOVE_PLANKS = block(HavahsAdventureModBlocks.GRAY_ABOVE_PLANKS);
		GRAY_ABOVE_WOOD_TRAPDOOR = block(HavahsAdventureModBlocks.GRAY_ABOVE_WOOD_TRAPDOOR);
		STRIPPED_GRAY_ABOVE_LOG = block(HavahsAdventureModBlocks.STRIPPED_GRAY_ABOVE_LOG);
		STRIPPED_GRAY_ABOVE_WOOD = block(HavahsAdventureModBlocks.STRIPPED_GRAY_ABOVE_WOOD);
		GRAY_ABOVE_WOOD = block(HavahsAdventureModBlocks.GRAY_ABOVE_WOOD);
		GRAY_ABOVE_PLANKS_DOOR = doubleBlock(HavahsAdventureModBlocks.GRAY_ABOVE_PLANKS_DOOR);
		GRAY_ABOVE_PLANKS_STAIRS = block(HavahsAdventureModBlocks.GRAY_ABOVE_PLANKS_STAIRS);
		GRAY_ABOVE_PLANKS_SLABS = block(HavahsAdventureModBlocks.GRAY_ABOVE_PLANKS_SLABS);
		GRAY_ABOVE_PLANKS_FENCE = block(HavahsAdventureModBlocks.GRAY_ABOVE_PLANKS_FENCE);
		GRAY_ABOVE_PLANKS_FENCE_GATE = block(HavahsAdventureModBlocks.GRAY_ABOVE_PLANKS_FENCE_GATE);
		GRAY_ABOVE_PLANKS_PRESSURE_PLATE = block(HavahsAdventureModBlocks.GRAY_ABOVE_PLANKS_PRESSURE_PLATE);
		ABOVE_BRICK_BLOCK_WALL = block(HavahsAdventureModBlocks.ABOVE_BRICK_BLOCK_WALL);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), properties));
	}
}