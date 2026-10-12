package org.hands_on_digits.havahsadventure.procedures;

import net.minecraft.world.entity.Entity;

import org.hands_on_digits.havahsadventure.entity.GuardEntity;

public class GuardDisplayConditionEyeState1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof GuardEntity _datEntI ? _datEntI.getEntityData().get(GuardEntity.DATA_eye_state) : 0) == 1) {
			return true;
		}
		return false;
	}
}