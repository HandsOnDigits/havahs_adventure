package org.hands_on_digits.havahs_adventure.procedures;

import net.minecraft.world.entity.Entity;

import org.hands_on_digits.havahs_adventure.entity.PegasusEntity;

public class PegasusPlaybackConditionLandingProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof PegasusEntity _datEntS ? _datEntS.getEntityData().get(PegasusEntity.DATA_play_animation) : "").equals("landing")) {
			return true;
		}
		return false;
	}
}