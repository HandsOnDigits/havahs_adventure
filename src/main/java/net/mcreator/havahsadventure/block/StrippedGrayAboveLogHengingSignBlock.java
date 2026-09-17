package net.mcreator.havahsadventure.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.CeilingHangingSignBlock;

import net.mcreator.havahsadventure.init.HavahsAdventureModWoodTypes;

public class StrippedGrayAboveLogHengingSignBlock extends CeilingHangingSignBlock {
	public StrippedGrayAboveLogHengingSignBlock() {
		super(HavahsAdventureModWoodTypes.STRIPPED_GRAY_ABOVE_LOG_HENGING_SIGN_WOOD_TYPE, BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f).noCollission().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn());
	}
}