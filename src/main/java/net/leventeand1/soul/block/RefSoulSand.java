package net.leventeand1.soul.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class RefSoulSand extends Block {

    public RefSoulSand() {
        super(BlockBehaviour.Properties.of(Material.SAND)
                .sound(SoundType.SOUL_SAND)
                .strength(1f)
                .requiresCorrectToolForDrops());
    }
}
