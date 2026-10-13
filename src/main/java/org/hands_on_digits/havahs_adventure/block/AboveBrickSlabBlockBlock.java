package org.hands_on_digits.havahs_adventure.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class AboveBrickSlabBlockBlock extends SlabBlock {
	public AboveBrickSlabBlockBlock() {
		super(BlockBehaviour.Properties.of().strength(3f, 100f).requiresCorrectToolForDrops());
	}
}