/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.hands_on_digits.havahs_adventure.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import org.hands_on_digits.havahs_adventure.client.renderer.PegasusRenderer;
import org.hands_on_digits.havahs_adventure.client.renderer.GuardRenderer;
import org.hands_on_digits.havahs_adventure.client.renderer.GuardAttackRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class HavahsAdventureModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HavahsAdventureModEntities.PEGASUS.get(), PegasusRenderer::new);
		event.registerEntityRenderer(HavahsAdventureModEntities.GUARD.get(), GuardRenderer::new);
		event.registerEntityRenderer(HavahsAdventureModEntities.GUARD_ATTACK.get(), GuardAttackRenderer::new);
	}
}