package net.mcreator.havahsadventure.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.havahsadventure.init.HavahsAdventureModBlocks;

import java.util.Optional;

public class GrayAboveTreeBlock extends SaplingBlock {
	public static final TreeGrower TREE_GROWER = new TreeGrower("gray_above_tree", Optional.of(getFeatureKey("havahs_adventure:two_by_two_gray_above_trees")), Optional.of(getFeatureKey("havahs_adventure:single_gray_above_trees")), Optional.empty());

	public GrayAboveTreeBlock() {
		super(TREE_GROWER, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().sound(SoundType.GRASS).instabreak().noCollission().pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(HavahsAdventureModBlocks.ABOVE_GRASS_BLOCK.get()) || groundState.is(HavahsAdventureModBlocks.ABOVE_DIRT.get());
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	private static ResourceKey<ConfiguredFeature<?, ?>> getFeatureKey(String feature) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse(feature));
	}
}