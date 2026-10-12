/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package org.hands_on_digits.havahsadventure.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import org.hands_on_digits.havahsadventure.potion.LightweightMobEffect;
import org.hands_on_digits.havahsadventure.HavahsAdventureMod;

public class HavahsAdventureModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, HavahsAdventureMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> LIGHTWEIGHT = REGISTRY.register("lightweight", LightweightMobEffect::new);
}