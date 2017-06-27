package com.notloki.crimsoncult.blocks;

import com.notloki.crimsoncult.handlers.HandlerCreativeTab;
import net.minecraft.block.material.Material;

public class BlockAncientStone extends BlockBase {

    public BlockAncientStone(String name) {
        super(name, Material.ROCK, HandlerCreativeTab.crimson_cult, 1.5F, 10F,"pickaxe", 2);
    }
}
