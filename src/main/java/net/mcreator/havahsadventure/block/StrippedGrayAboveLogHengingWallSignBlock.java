package net.mcreator.havahsadventure.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.havahsadventure.init.HavahsAdventureModWoodTypes;
import net.mcreator.havahsadventure.init.HavahsAdventureModBlocks;

public class StrippedGrayAboveLogHengingWallSignBlock extends WallHangingSignBlock {
	public StrippedGrayAboveLogHengingWallSignBlock() {
		super(HavahsAdventureModWoodTypes.STRIPPED_GRAY_ABOVE_LOG_HENGING_SIGN_WOOD_TYPE,
				BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f).noCollission().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn().dropsLike(HavahsAdventureModBlocks.STRIPPED_GRAY_ABOVE_LOG_HENGING_SIGN.get()));
	}
}