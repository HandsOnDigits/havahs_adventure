package net.mcreator.havahsadventure.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.havahsadventure.init.HavahsAdventureModWoodTypes;

public class GrayAbovePlanksSignBlock extends StandingSignBlock {
	public GrayAbovePlanksSignBlock() {
		super(HavahsAdventureModWoodTypes.GRAY_ABOVE_PLANKS_SIGN_WOOD_TYPE, BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f).noCollission().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn());
	}
}