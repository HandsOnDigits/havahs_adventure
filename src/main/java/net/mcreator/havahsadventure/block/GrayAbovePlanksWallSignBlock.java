package net.mcreator.havahsadventure.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.havahsadventure.init.HavahsAdventureModWoodTypes;
import net.mcreator.havahsadventure.init.HavahsAdventureModBlocks;

public class GrayAbovePlanksWallSignBlock extends WallSignBlock {
	public GrayAbovePlanksWallSignBlock() {
		super(HavahsAdventureModWoodTypes.GRAY_ABOVE_PLANKS_SIGN_WOOD_TYPE,
				BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f).noCollission().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn().dropsLike(HavahsAdventureModBlocks.GRAY_ABOVE_PLANKS_SIGN.get()));
	}
}