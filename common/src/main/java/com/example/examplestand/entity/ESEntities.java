package com.example.examplestand.entity;

import com.example.examplestand.Constants;
import com.example.examplestand.ExampleStand;
import com.example.examplestand.stand.entities.BasicStandEntity;
import net.hydra.jojomod.entity.ModEntities;
import net.minecraft.world.entity.EntityType;
import org.joml.Vector2f;

public class ESEntities {
    public static EntityType<BasicStandEntity> BASIC_STAND =
            ModEntities.registerStandEntity(ExampleStand.location("basic_stand"), BasicStandEntity::new, new Vector2f(0.75f, 2.05f));

    // please mr jvm... can I have some code executed?
    public static void bootstrap()
    {
        Constants.LOG.info("Creating entites");
    }
}
