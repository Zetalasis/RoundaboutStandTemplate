package com.example.examplestand;

import com.example.examplestand.entity.ESEntities;
import com.example.examplestand.item.ESItems;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;

@Mod(Constants.MOD_ID)
public class ExampleStandForge {
    
    public ExampleStandForge() {
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::onRegister);
        // has to skip common-sided registry for the reason listed below.
        ExampleStand.init(true);
    }

    // this is BS, forge is BS.
    // forge REALLY wants you to use their deferred registries.
    // I don't wanna use them. So you have to manually subscribe.
    private void onRegister(RegisterEvent event) {
        if (event.getRegistryKey().equals(Registries.ITEM)) {
            ESItems.bootstrap();
        } else if (event.getRegistryKey().equals(Registries.ENTITY_TYPE)) {
            ESEntities.bootstrap();
        }
    }
}