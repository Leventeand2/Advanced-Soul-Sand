package net.leventeand1.soul.datagen;

import net.leventeand1.soul.block.ModBlocks;
import net.leventeand1.soul.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.REF_SOUL_SAND.get());

        add(ModBlocks.REF_SOUL_SAND.get(), (block -> createSingleItemTable(ModItems.SOUL_SAND_DUST.get())));

        this.dropSelf(ModBlocks.AVATAR_LOG.get());
        this.dropSelf(ModBlocks.AVATAR_WOOD.get());
        this.dropSelf(ModBlocks.AVATAR_PLANKS.get());
        this.dropSelf(ModBlocks.STRIPPED_AVATAR_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_AVATAR_WOOD.get());
        this.dropSelf(ModBlocks.AVATAR_SAPLING.get());

        this.add(ModBlocks.AVATAR_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.AVATAR_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
