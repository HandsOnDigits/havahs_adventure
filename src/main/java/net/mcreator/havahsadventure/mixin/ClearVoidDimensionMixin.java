package net.mcreator.havahsadventure.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientLevel.ClientLevelData.class)
public class ClearVoidDimensionMixin {

    @Inject(method = "getHorizonHeight", at = @At("HEAD"), cancellable = true)
    private void modifyVoidHorizon(CallbackInfoReturnable<Double> cir) {
        Minecraft client = Minecraft.getInstance();
        
        // Ensure the client level exists before checking dimension
        if (client.level != null) {
            ResourceKey<?> dimensionKey = client.level.dimension();
            
            // Check if the current dimension is your custom dimension
            if (dimensionKey.equals(ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("havahs_adventure:above")))) {
                // Lower horizon height significantly (or set to Double.NEGATIVE_INFINITY to clear it completely)
                cir.setReturnValue(-1000.0);
            }
        }
    }
}