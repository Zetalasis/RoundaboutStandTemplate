package com.example.examplestand.registry;

import com.example.examplestand.Constants;
import com.example.examplestand.client.stand.models.BasicStandModel;
import com.example.examplestand.client.stand.renderers.BasicStandRenderer;
import com.example.examplestand.client.stand.renderers.ESRenderers;
import com.example.examplestand.entity.ESEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientForgeEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ESEntities.BASIC_STAND, BasicStandRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ESRenderers.BASIC_STAND_LAYER, BasicStandModel::getTexturedModelData);
    }
}