package net.mcreator.havahsadventure.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

@EventBusSubscriber
public class AwardSpawnerHeadKillProcedureProcedure {

    @SubscribeEvent
    public static void onEntityDeath(LivingDeathEvent event) {
        LivingEntity victim = event.getEntity();

        // Check if server-side and if victim has the spawner host tag
        if (!victim.level().isClientSide() && victim.getPersistentData().getBoolean("IsSpawnerHeadHost")) {
            if (event.getSource().getEntity() instanceof ServerPlayer player) {
                execute(player);
            }
        }
    }

    public static void execute(ServerPlayer player) {
        if (player == null)
            return;

        AdvancementHolder adv = player.server.getAdvancements().get(ResourceLocation.parse("havahs_adventure:spawner_head_hunter"));
        if (adv != null) {
            AdvancementProgress ap = player.getAdvancements().getOrStartProgress(adv);
            if (!ap.isDone()) {
                for (String criteria : ap.getRemainingCriteria()) {
                    player.getAdvancements().award(adv, criteria);
                }
            }
        }
    }
}