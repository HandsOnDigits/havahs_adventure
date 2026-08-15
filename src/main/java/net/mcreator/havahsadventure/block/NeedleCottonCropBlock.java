package net.mcreator.havahsadventure.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.havahsadventure.procedures.NeedleCottonCropOnTickUpdateProcedure;
import net.mcreator.havahsadventure.procedures.NeedleCottonCropOnBlockRightclickedProcedure;
import net.mcreator.havahsadventure.procedures.NeedleCottonCropNeighbourBlockChangesProcedure;
import net.mcreator.havahsadventure.init.HavahsAdventureModItems;

public class NeedleCottonCropBlock extends Block {
	public static final IntegerProperty GROWTH = IntegerProperty.create("growth", 0, 3);

	public NeedleCottonCropBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).sound(SoundType.CROP).strength(0f, 10f).noCollission().randomTicks().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(GROWTH, 0));
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
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(GROWTH);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(GROWTH, 0);
	}

	@Override
	public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
		return new ItemStack(HavahsAdventureModItems.NEEDLE_COTTON_SEED.get());
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		NeedleCottonCropNeighbourBlockChangesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.randomTick(blockstate, world, pos, random);
		NeedleCottonCropOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

	@Override
public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
    super.useWithoutItem(blockstate, world, pos, entity, hit);
    int x = pos.getX();
    int y = pos.getY();
    int z = pos.getZ();
    double hitX = hit.getLocation().x;
    double hitY = hit.getLocation().y;
    double hitZ = hit.getLocation().z;
    Direction direction = hit.getDirection();
    
    // Fix: Changed 'state' to 'blockstate'
    NeedleCottonCropOnBlockRightclickedProcedure.execute(world, x, y, z, blockstate, entity);
    
    return InteractionResult.SUCCESS;
}
}