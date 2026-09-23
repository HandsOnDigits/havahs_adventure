package org.hands_on_digits.havahsadventure.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import org.hands_on_digits.havahsadventure.init.HavahsAdventureModBlocks;

public class PottedGrayAboveSaplingBlock extends FlowerPotBlock {
	public PottedGrayAboveSaplingBlock() {
		super(() -> (FlowerPotBlock) Blocks.FLOWER_POT, () -> HavahsAdventureModBlocks.GRAY_ABOVE_TREE.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false));
		((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ResourceLocation.parse("havahs_adventure:gray_above_tree"), () -> this);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
		return new ItemStack(HavahsAdventureModBlocks.GRAY_ABOVE_TREE.get());
	}
}