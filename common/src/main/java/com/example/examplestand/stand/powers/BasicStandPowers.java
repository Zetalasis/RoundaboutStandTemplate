package com.example.examplestand.stand.powers;

import net.hydra.jojomod.client.StandIcons;
import net.hydra.jojomod.event.index.PowerIndex;
import net.hydra.jojomod.event.powers.StandPowers;
import net.hydra.jojomod.stand.powers.elements.PowerContext;
import net.hydra.jojomod.stand.powers.presets.NewPunchingStand;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.entity.LivingEntity;

public class BasicStandPowers extends NewPunchingStand {
    public BasicStandPowers(LivingEntity self) { super(self); }

    @Override
    public StandPowers generateStandPowers(LivingEntity entity) {
        return new BasicStandPowers(entity);
    }

    @Override
    public void renderIcons(GuiGraphics context, int x, int y) {
        // Render icons here.
        // Example skill icons:

        setSkillIcon(context, x, y, 1, StandIcons.NONE, PowerIndex.SKILL_1);
        setSkillIcon(context, x, y, 2, StandIcons.NONE, PowerIndex.SKILL_2);
        setSkillIcon(context, x, y, 3, StandIcons.NONE, PowerIndex.SKILL_3);
        setSkillIcon(context, x, y, 4, StandIcons.NONE, PowerIndex.SKILL_4);

        // Look at other stands' power classes to see how they render icons.

        super.renderIcons(context, x, y);
    }

    @Override
    public void powerActivate(PowerContext context) {
        // Handle button presses here.
    }
}