package net.leventeand1.soul.item;

import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import java.io.IOException;
import java.util.function.Supplier;

public class SoulSandApple extends Item {
    public SoulSandApple() throws IOException {
        super(new Item.Properties()
                .food(new FoodProperties.Builder()
                        .nutrition(5)
                        .saturationMod(5.0f)
                        .alwaysEat()
                        .effect((Supplier<MobEffectInstance>) new EffectInstance((ResourceManager) MobEffects.CONDUIT_POWER, "2400"), 0.2f).build())


        );
    }
}
