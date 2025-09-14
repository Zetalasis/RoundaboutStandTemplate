package com.example.examplestand;

import com.example.examplestand.entity.ESEntities;
import com.example.examplestand.item.ESItems;
import com.example.examplestand.platform.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

// This class is part of the common project meaning it is shared between all supported loaders. Code written here can only
// import and access the vanilla codebase, libraries used by vanilla, and optionally third party libraries that provide
// common compatible binaries. This means common code can not directly use loader specific concepts such as Forge events
// however it will be compatible with all supported mod loaders.
public class ExampleStand {
    // Helper for easier access to resource locations.
    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(Constants.MOD_ID, name);
    }

    // The loader specific projects are able to import and use any code from the common project. This allows you to
    // write the majority of your code here and load it from your loader specific projects. This example has some
    // code that gets invoked by the entry point of the loader specific projects.
    public static void init(boolean skipCommonRegistry) {
        if (!skipCommonRegistry)
        {
            ESItems.bootstrap();
            ESEntities.bootstrap();
        }
    }
}