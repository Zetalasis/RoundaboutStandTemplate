package com.example.examplestand.item;

import com.example.examplestand.Constants;
import com.example.examplestand.ExampleStand;
import com.example.examplestand.stand.powers.BasicStandPowers;
import net.hydra.jojomod.item.ModItems;
import net.minecraft.world.item.Item;

import java.util.List;

// the ES is short for Example Stand by the way
public class ESItems {
    public static final Item BASIC_STAND;
    public static final Item BASIC_STAND_MAX;

    static {
        List<Item> basicStand = ModItems.registerStand(new BasicStandPowers(null), ExampleStand.location("basic_stand_disc"));
        BASIC_STAND = basicStand.get(0);
        BASIC_STAND_MAX = basicStand.get(1);
    }

    // please mr jvm... can I have some code executed?
    public static void bootstrap()
    {
        Constants.LOG.info("Creating items");
    }
}