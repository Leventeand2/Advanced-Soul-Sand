package net.leventeand1.soul;

import com.mojang.logging.LogUtils;
import net.leventeand1.soul.block.ModBlocks;
import net.leventeand1.soul.effect.ModEffects;
import net.leventeand1.soul.item.ModCreativeModTabs;
import net.leventeand1.soul.item.ModItems;
import net.leventeand1.soul.potion.ModPotion;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MOD_ID)
public class Main {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "soul";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Main() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEffects.register(modEventBus);
        ModPotion.register(modEventBus);
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ModCreativeModTabs.ADVANCED_SOUL_SAND) {
            event.accept(ModItems.SOUL_SAND_DUST);
            event.accept(ModBlocks.REF_SOUL_SAND);
            event.accept(ModItems.SOUL_SAND_SWORD);
            event.accept(ModItems.SOUL_SAND_PICKAXE);
            event.accept(ModItems.SOUL_SAND_SHOVEL);
            event.accept(ModItems.SOUL_SAND_AXE);
            event.accept(ModItems.SOUL_SAND_HOE);
            event.accept(ModItems.SOUL_SAND_HELMET);
            event.accept(ModItems.SOUL_SAND_CHESTPLATE);
            event.accept(ModItems.SOUL_SAND_LEGGINGS);
            event.accept(ModItems.SOUL_SAND_BOOTS);
            event.accept(ModBlocks.AVATAR_LOG);
            event.accept(ModBlocks.AVATAR_WOOD);
            event.accept(ModBlocks.AVATAR_PLANKS);
            event.accept(ModBlocks.STRIPPED_AVATAR_LOG);
            event.accept(ModBlocks.STRIPPED_AVATAR_WOOD);
            event.accept(ModBlocks.AVATAR_LEAVES);
            event.accept(ModBlocks.AVATAR_SAPLING);
            event.accept(ModItems.SOUL_SAND_APPLE);
            event.accept(ModItems.YOVO_FRUIT);

        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
        }
    }
}
