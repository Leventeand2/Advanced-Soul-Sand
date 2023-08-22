package net.leventeand1.soul.datagen;

import net.leventeand1.soul.Main;
import net.leventeand1.soul.block.ModBlocks;
import net.leventeand1.soul.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SOUL_SAND_AXE);
        simpleItem(ModItems.SOUL_SAND_HOE);
        simpleItem(ModItems.SOUL_SAND_PICKAXE);
        simpleItem(ModItems.SOUL_SAND_SHOVEL);
        simpleItem(ModItems.SOUL_SAND_SWORD);
        simpleItem(ModItems.SOUL_SAND_DUST);
        simpleItem(ModItems.SOUL_SAND_HELMET);
        simpleItem(ModItems.SOUL_SAND_CHESTPLATE);
        simpleItem(ModItems.SOUL_SAND_LEGGINGS);
        simpleItem(ModItems.SOUL_SAND_BOOTS);
        saplingItem(ModBlocks.AVATAR_SAPLING);
        simpleItem(ModItems.SOUL_SAND_APPLE);
        simpleItem(ModItems.YOVO_FRUIT);
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Main.MOD_ID, "block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Main.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Main.MOD_ID,"item/" + item.getId().getPath()));
    }
}
