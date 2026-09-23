package org.hands_on_digits.havahsadventure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.core.BlockPos;

import org.hands_on_digits.havahsadventure.init.HavahsAdventureModBlocks;
import org.hands_on_digits.havahsadventure.entity.PegasusEntity;

public class PegasusNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		BlockPos posBelow = BlockPos.containing(x, y - 1, z);

		// Local variable for rareness (0.05 = 5% chance, 0.20 = 20% chance, 0.50 = 50% chance)
		double rareness = 0.02;

		// 1. Only allow spawning on custom grass
		boolean isCustomGrass = world.getBlockState(posBelow).getBlock() == HavahsAdventureModBlocks.ABOVE_GRASS_BLOCK.get();

		// 2. Prevent overpopulation in eternal daylight (32-block radius)
		boolean notTooCrowded = world.getEntitiesOfClass(
				PegasusEntity.class,
				new AABB(x - 32, y - 16, z - 32, x + 32, y + 16, z + 32)
		).size() < 4;

		// 3. Roll a random chance against the rareness value
		boolean passedRarityCheck = Math.random() < rareness;

		return isCustomGrass && notTooCrowded && passedRarityCheck;
	}
}