package org.hands_on_digits.havahsadventure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import org.hands_on_digits.havahsadventure.init.HavahsAdventureModMobEffects;

public class PegasusMeatPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(HavahsAdventureModMobEffects.LIGHTWEIGHT, 240, 1, false, false));
	}
}