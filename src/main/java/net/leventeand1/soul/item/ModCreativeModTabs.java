package net.leventeand1.soul.item;

import net.leventeand1.soul.Main;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModTabs {
    public static CreativeModeTab ADVANCED_SOUL_SAND;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
       ADVANCED_SOUL_SAND = event.registerCreativeModeTab(new ResourceLocation(Main.MOD_ID, "soul_tab"),
               builder -> builder.icon(() -> new ItemStack(ModItems.SOUL_SAND_DUST.get())).title(Component.translatable("creativemodetab.advanced_soul_sand")));
    }
}
