package net.mcreator.havahsadventure.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;

public class GrayAboveLeavesBlock extends LeavesBlock {
	public GrayAboveLeavesBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.AZALEA_LEAVES).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false).ignitedByLava().isSuffocating((bs, br, bp) -> false)
				.isViewBlocking((bs, br, bp) -> false));
	}
}