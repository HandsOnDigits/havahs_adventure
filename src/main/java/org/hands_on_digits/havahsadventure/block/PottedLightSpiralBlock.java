package org.hands_on_digits.havahsadventure.block;

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

public class PottedLightSpiralBlock extends FlowerPotBlock {
	public PottedLightSpiralBlock() {
		super(() -> (FlowerPotBlock) Blocks.FLOWER_POT, () -> HavahsAdventureModBlocks.LIGHT_SPIRAL.get(),
				BlockBehaviour.Properties.of().strength(0f, 10f).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false));
		((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ResourceLocation.parse("havahs_adventure:light_spiral"), () -> this);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
		return new ItemStack(HavahsAdventureModBlocks.LIGHT_SPIRAL.get());
	}
}