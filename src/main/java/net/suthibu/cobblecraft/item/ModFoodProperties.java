package net.suthibu.cobblecraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties THINKING_FOOD = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .nutrition(2100000000)
            .fast()
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100000), 5000f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 1000000),5000f).build();
}
