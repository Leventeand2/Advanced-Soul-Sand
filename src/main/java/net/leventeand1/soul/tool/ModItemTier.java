package net.leventeand1.soul.tool;

import net.leventeand1.soul.item.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModItemTier {
    public static final ForgeTier SOUL_SAND = new ForgeTier(6,5000, 5,
            4, 26, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.SOUL_SAND_DUST.get()));
}
