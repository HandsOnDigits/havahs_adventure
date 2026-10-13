package org.hands_on_digits.havahs_adventure.procedures;

import net.minecraft.world.entity.Entity;

import org.hands_on_digits.havahs_adventure.entity.PegasusEntity;

public class IsFlyingProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof PegasusEntity _datEntL0 && _datEntL0.getEntityData().get(PegasusEntity.DATA_flying)) {
			return true;
		}
		return false;
	}
}