package org.hands_on_digits.havahsadventure.procedures;

import net.neoforged.neoforge.client.event.ViewportEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.util.Mth;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class AboveFogProcedure {
	@SubscribeEvent
	public static void onSkyRendered(ViewportEvent.RenderFog event) {
		if (event.getMode() == FogRenderer.FogMode.FOG_TERRAIN) {
			Minecraft mc = Minecraft.getInstance();
			execute(event, event);
		}
	}

	public static void execute(ViewportEvent.RenderFog fogRenderEvent) {
		execute(null, fogRenderEvent);
	}

	private static void execute(@Nullable Event event, ViewportEvent.RenderFog fogRenderEvent) {
		if (fogRenderEvent == null)
			return;
		fogColor = 0xffffff;
		fogRenderEvent.setNearPlaneDistance(400);
		fogRenderEvent.setFarPlaneDistance(600);
		if (!fogRenderEvent.isCanceled()) {
			fogRenderEvent.setCanceled(true);
		}
	}

	private static int fogColor = -1;

	@SubscribeEvent
	public static void setFogColor(ViewportEvent.ComputeFogColor event) {
		if (fogColor != -1) {
			event.setRed(Mth.clamp(Mth.lerp(0.5F, Mth.clamp(event.getRed(), 0.0F, 1.0F), (fogColor >> 16 & 255) / 255.0F), 0.0F, 1.0F));
			event.setGreen(Mth.clamp(Mth.lerp(0.5F, Mth.clamp(event.getGreen(), 0.0F, 1.0F), (fogColor >> 8 & 255) / 255.0F), 0.0F, 1.0F));
			event.setBlue(Mth.clamp(Mth.lerp(0.5F, Mth.clamp(event.getBlue(), 0.0F, 1.0F), (fogColor & 255) / 255.0F), 0.0F, 1.0F));
			fogColor = -1;
		}
	}
}