package org.hands_on_digits.havahsadventure.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class AboveBlockPressurePlateBlock extends PressurePlateBlock {
	public AboveBlockPressurePlateBlock() {
		super(BlockSetType.STONE, BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f).noCollission().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false).forceSolidOn());
	}
}