package org.hands_on_digits.havahs_adventure.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import org.hands_on_digits.havahs_adventure.init.HavahsAdventureModWoodTypes;
import org.hands_on_digits.havahs_adventure.init.HavahsAdventureModBlocks;

public class StrippedGrayAboveLogHengingWallSignBlock extends WallHangingSignBlock {
	public StrippedGrayAboveLogHengingWallSignBlock() {
		super(HavahsAdventureModWoodTypes.STRIPPED_GRAY_ABOVE_LOG_HENGING_SIGN_WOOD_TYPE,
				BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f).noCollission().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn().dropsLike(HavahsAdventureModBlocks.STRIPPED_GRAY_ABOVE_LOG_HENGING_SIGN.get()));
	}
}