package com.example.examplestand.client.stand.renderers;

import com.example.examplestand.ExampleStand;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

// the ES is short for Example Stand by the way
public class ESRenderers {
    public static ModelLayerLocation BASIC_STAND_LAYER = location("textures/stand/basic_stand/base.png");

    public static ModelLayerLocation location(String name)
    {
        return new ModelLayerLocation(ExampleStand.location(name), "main");
    }
}