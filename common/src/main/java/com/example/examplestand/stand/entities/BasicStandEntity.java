package com.example.examplestand.stand.entities;

import net.hydra.jojomod.entity.stand.FollowingStandEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class BasicStandEntity extends FollowingStandEntity {
    public BasicStandEntity(EntityType<? extends Mob> entityType, Level world) { super(entityType, world); }
}
