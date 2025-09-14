package com.example.examplestand.registry;

import com.example.examplestand.client.stand.models.BasicStandModel;
import com.example.examplestand.client.stand.renderers.BasicStandRenderer;
import com.example.examplestand.client.stand.renderers.ESRenderers;
import com.example.examplestand.entity.ESEntities;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class FabricEntityClient {
    public static void bootstrapModels()
    {
        EntityModelLayerRegistry.registerModelLayer(ESRenderers.BASIC_STAND_LAYER, BasicStandModel::getTexturedModelData);
    }

    public static void bootstrapRenderers()
    {
        EntityRendererRegistry.register(ESEntities.BASIC_STAND, BasicStandRenderer::new);
    }
}
