package net.leventeand1.soul.potion;

import net.leventeand1.soul.Main;
import net.leventeand1.soul.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotion {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, Main.MOD_ID);

    public static final RegistryObject<Potion> CURSE_OF_THE_SOULS_POTION = POTIONS.register("curse_of_the_souls_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.CURSE_OF_THE_SOULS.get(), 200, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
