package org.hands_on_digits.havahsadventure.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import org.hands_on_digits.havahsadventure.init.HavahsAdventureModWoodTypes;

public class GrayAbovePlanksSignBlock extends StandingSignBlock {
	public GrayAbovePlanksSignBlock() {
		super(HavahsAdventureModWoodTypes.GRAY_ABOVE_PLANKS_SIGN_WOOD_TYPE, BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f).noCollission().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn());
	}
}