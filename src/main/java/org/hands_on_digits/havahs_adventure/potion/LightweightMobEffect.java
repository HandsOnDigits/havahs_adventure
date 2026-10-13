package org.hands_on_digits.havahs_adventure.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LightweightMobEffect extends MobEffect {
	public LightweightMobEffect() {
		super(MobEffectCategory.NEUTRAL, -256);
	}
}