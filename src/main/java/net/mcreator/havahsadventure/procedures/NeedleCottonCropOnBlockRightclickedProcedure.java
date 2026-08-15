package net.mcreator.havahsadventure.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class NeedleCottonCropOnBlockRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;

		Property<?> growthProperty = getPropertyByName(blockstate, "growth");

		if (growthProperty instanceof IntegerProperty _getip) {
			int currentGrowth = blockstate.getValue(_getip);

			// Checks if crop growth stage is below max (3)
			if (currentGrowth < 3) {
				ItemStack mainHand = entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY;

				if (mainHand.getItem() == Items.BONE_MEAL) {
					BlockPos pos = BlockPos.containing(x, y, z);

					// Advance growth stage by 1
					world.setBlock(pos, blockstate.setValue(_getip, currentGrowth + 1), 3);

					// Consume Bone Meal unless player is in Creative mode
					if (!(entity instanceof Player _player && _player.getAbilities().instabuild)) {
						mainHand.shrink(1);
					}

					// Spawn Bone Meal particles and sound
					if (world instanceof Level _level) {
						_level.levelEvent(2005, pos, 0);
					}
				}
			}
		}
	}

	private static Property<?> getPropertyByName(BlockState state, String name) {
		for (Property<?> property : state.getProperties()) {
			if (property.getName().equals(name)) {
				return property;
			}
		}
		return null;
	}
}