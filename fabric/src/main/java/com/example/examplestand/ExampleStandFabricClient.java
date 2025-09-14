package com.example.examplestand;

import com.example.examplestand.registry.FabricEntityClient;
import net.fabricmc.api.ClientModInitializer;

public class ExampleStandFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FabricEntityClient.bootstrapModels();
        FabricEntityClient.bootstrapRenderers();
    }
}