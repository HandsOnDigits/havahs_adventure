package org.hands_on_digits.havahs_adventure.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.CeilingHangingSignBlock;

import org.hands_on_digits.havahs_adventure.init.HavahsAdventureModWoodTypes;

public class StrippedGrayAboveLogHengingSignBlock extends CeilingHangingSignBlock {
	public StrippedGrayAboveLogHengingSignBlock() {
		super(HavahsAdventureModWoodTypes.STRIPPED_GRAY_ABOVE_LOG_HENGING_SIGN_WOOD_TYPE, BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f).noCollission().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn());
	}
}