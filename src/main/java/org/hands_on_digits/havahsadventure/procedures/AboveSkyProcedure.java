package org.hands_on_digits.havahsadventure.procedures;

import net.neoforged.neoforge.client.event.RenderLevelStageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import org.hands_on_digits.havahsadventure.client.RenderUtils;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class AboveSkyProcedure {
	@SubscribeEvent
	public static void onSkyRendered(RenderLevelStageEvent event) {
		Minecraft mc = Minecraft.getInstance();
		if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_SKY)
			execute(event, mc.player, event);
	}

	public static void execute(Entity entity, RenderLevelStageEvent skyRenderEvent) {
		execute(null, entity, skyRenderEvent);
	}

	private static void execute(@Nullable Event event, Entity entity, RenderLevelStageEvent skyRenderEvent) {
		if (entity == null || skyRenderEvent == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("havahs_adventure:above"))) {
			RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("havahs_adventure:textures/above_sky.png"), 0xffffff, Math.min((float) 0.5, 1));
			RenderUtils.renderCustomSun(skyRenderEvent, ResourceLocation.parse("havahs_adventure:textures/above_sun.png"));
		}
	}
}