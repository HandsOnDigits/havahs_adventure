package org.hands_on_digits.havahsadventure.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SpreadingSnowyDirtBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;

public class AboveGrassBlockBlock extends SpreadingSnowyDirtBlock {
	// Fix constructor reference for the codec
	public static final MapCodec<AboveGrassBlockBlock> CODEC = simpleCodec(AboveGrassBlockBlock::new);

	@Override
	public MapCodec<AboveGrassBlockBlock> codec() {
		return CODEC;
	}

	public AboveGrassBlockBlock(Properties properties) {
		super(properties);
	}

	public AboveGrassBlockBlock() {
		this(BlockBehaviour.Properties.of()
				.sound(SoundType.WET_GRASS)
				.strength(1f, 10f)
				.randomTicks()
				.noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		if (!canBeGrass(state, level, pos)) {
			level.setBlockAndUpdate(pos, org.hands_on_digits.havahsadventure.init.HavahsAdventureModBlocks.ABOVE_DIRT.get().defaultBlockState());
		} else {
			if (level.getMaxLocalRawBrightness(pos.above()) >= 9) {
				for (int i = 0; i < 4; ++i) {
					BlockPos targetPos = pos.offset(
							random.nextInt(3) - 1,
							random.nextInt(5) - 3,
							random.nextInt(3) - 1
					);

					if (level.getBlockState(targetPos).is(org.hands_on_digits.havahsadventure.init.HavahsAdventureModBlocks.ABOVE_DIRT.get()) && canPropagate(state, level, targetPos)) {
						level.setBlockAndUpdate(targetPos, this.defaultBlockState().setValue(SNOWY, level.getBlockState(targetPos.above()).is(Blocks.SNOW)));
					}
				}
			}
		}
	}

	private static boolean canBeGrass(BlockState state, net.minecraft.world.level.LevelReader level, BlockPos pos) {
		BlockPos abovePos = pos.above();
		BlockState aboveState = level.getBlockState(abovePos);
		if (aboveState.is(Blocks.SNOW) && aboveState.getValue(net.minecraft.world.level.block.SnowLayerBlock.LAYERS) == 1) {
			return true;
		} else if (aboveState.getLightBlock(level, abovePos) >= 2) {
			return false;
		} else {
			int i = net.minecraft.world.level.lighting.LightEngine.getLightBlockInto(level, state, pos, aboveState, abovePos, net.minecraft.core.Direction.UP, aboveState.getLightBlock(level, abovePos));
			return i < level.getMaxLightLevel();
		}
	}

	private static boolean canPropagate(BlockState state, net.minecraft.world.level.LevelReader level, BlockPos pos) {
		BlockPos abovePos = pos.above();
		return canBeGrass(state, level, pos) && !level.getBlockState(abovePos).is(Blocks.WATER);
	}
}