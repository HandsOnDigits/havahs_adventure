package org.hands_on_digits.havahsadventure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import org.hands_on_digits.havahsadventure.init.HavahsAdventureModEntities;

public class GuardEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int _i1 = 0; _i1 < 5; _i1++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = HavahsAdventureModEntities.GUARD_ATTACK.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		}
	}
}