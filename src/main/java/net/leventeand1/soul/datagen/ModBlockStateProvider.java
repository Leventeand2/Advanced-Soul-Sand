package net.leventeand1.soul.datagen;

import com.sun.jna.platform.win32.OaIdl;
import net.leventeand1.soul.Main;
import net.leventeand1.soul.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Main.MOD_ID,exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.REF_SOUL_SAND);

        logBlock(((RotatedPillarBlock) ModBlocks.AVATAR_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.AVATAR_WOOD.get(), blockTexture(ModBlocks.AVATAR_LOG.get()), blockTexture(ModBlocks.AVATAR_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_AVATAR_LOG.get(), new ResourceLocation(Main.MOD_ID, "block/stripped_avatar_log"),
                new ResourceLocation(Main.MOD_ID, "block/stripped_avatar_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_AVATAR_WOOD.get(), new ResourceLocation(Main.MOD_ID, "block/stripped_avatar_log"),
                new ResourceLocation(Main.MOD_ID, "block/stripped_avatar_log"));

        blockWithItem(ModBlocks.AVATAR_PLANKS);
        blockWithItem(ModBlocks.AVATAR_LEAVES);
        saplingBlock(ModBlocks.AVATAR_SAPLING);



        simpleBlockItem(ModBlocks.AVATAR_LOG.get(), models().withExistingParent("soul:avatar_log",
                "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.AVATAR_WOOD.get(), models().withExistingParent("soul:avatar_wood",
                "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_AVATAR_LOG.get(), models().withExistingParent("soul:stripped_avatar_log",
                "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_AVATAR_WOOD.get(), models().withExistingParent("soul:stripped_avatar_wood", "minecraft:block/cube_column"));
    }



    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
