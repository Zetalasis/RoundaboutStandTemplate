package com.example.examplestand.client.stand.models;

import com.example.examplestand.stand.entities.BasicStandEntity;
import net.hydra.jojomod.client.models.stand.StandModel;
import net.hydra.jojomod.event.powers.StandPowers;
import net.hydra.jojomod.stand.powers.PowersSoftAndWet;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class BasicStandModel <T extends BasicStandEntity> extends StandModel<T> {
    public BasicStandModel(ModelPart root) { this.stand = root.getChild("stand"); }

    public static LayerDefinition getTexturedModelData() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition stand = partdefinition.addOrReplaceChild("stand", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition stand2 = stand.addOrReplaceChild("stand2", CubeListBuilder.create().texOffs(-12, 0).addBox(-6.0F, -0.025F, -5.0F, 11.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition bone = stand2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(-2, 12).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }


    StandPowers Power = new PowersSoftAndWet(null);

    @Override
    public void setupAnim(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
        super.setupAnim(pEntity, pLimbSwing, pLimbSwingAmount, pAgeInTicks, pNetHeadYaw, pHeadPitch);
        defaultModifiers(pEntity);
    }

    @Override
    public ModelPart root() {
        return stand;
    }
}