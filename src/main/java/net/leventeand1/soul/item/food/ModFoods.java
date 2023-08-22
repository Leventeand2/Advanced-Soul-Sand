package net.leventeand1.soul.item.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SOUL_SAND_APPLE = (new FoodProperties.Builder())
            .nutrition(4)
            .saturationMod(6.4f)
            .effect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 2400, 0), 0.1f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 2400, 1), 0.1f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 2400, 1), 0.1f)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 2400, 1), 0.1f)
            .fast()
            .alwaysEat()
            .build();

    public static final FoodProperties YOVO_FRUIT = (new FoodProperties.Builder())
            .nutrition(6)
            .saturationMod(9.9f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 2400, 1), 0.1f)
            .alwaysEat()
            .build();
}
