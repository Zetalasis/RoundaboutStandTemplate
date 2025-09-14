package com.example.examplestand.client.stand.renderers;

import com.example.examplestand.client.stand.models.BasicStandModel;
import com.example.examplestand.stand.entities.BasicStandEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.hydra.jojomod.client.models.stand.renderers.StandRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class BasicStandRenderer extends StandRenderer<BasicStandEntity> {
    public BasicStandRenderer(EntityRendererProvider.Context context) {
        super(context, new BasicStandModel<>(context.bakeLayer(ESRenderers.BASIC_STAND_LAYER)), 0f);
    }

    @Override
    public ResourceLocation getTextureLocation(BasicStandEntity entity) {
        // this is used for skins
        return ESRenderers.BASIC_STAND_LAYER.getModel();
    }

    @Override
    public void render(BasicStandEntity mobEntity, float f, float g, PoseStack matrixStack, MultiBufferSource vertexConsumerProvider, int i) {
        float factor = 0.5F + (mobEntity.getSizePercent()/2);
        if (mobEntity.isBaby()) {
            matrixStack.scale(0.5f*factor, 0.5f*factor, 0.5f*factor);
        } else {
            matrixStack.scale(0.87f * factor, 0.87f * factor, 0.87f * factor);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    protected RenderType getRenderType(BasicStandEntity entity, boolean showBody, boolean translucent, boolean showOutline) {
        return super.getRenderType(entity, showBody, true, showOutline);
    }
}