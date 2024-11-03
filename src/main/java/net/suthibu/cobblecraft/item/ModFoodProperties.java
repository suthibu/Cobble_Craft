package net.suthibu.cobblecraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties THINKING_FOOD = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .nutrition(2100000000)
            .fast()
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100000,1000),1f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000000,2100000000),1f)
            .effect(() -> new MobEffectInstance(MobEffects.CONDUIT_POWER,1000000,1000),1f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED,1000000,255),1f)
            .effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE,100000,100000),1f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION,1000000,1000000),1f)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL,1000000,10000000),1f)
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION,10000000,100000000),1f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION,1000000,1000000),1f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 1000000,1000),1f).build();


}
