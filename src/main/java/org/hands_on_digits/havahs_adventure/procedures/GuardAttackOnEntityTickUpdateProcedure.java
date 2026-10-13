package org.hands_on_digits.havahs_adventure.procedures;

import net.minecraft.world.entity.Entity;

public class GuardAttackOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.tickCount > 160) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}