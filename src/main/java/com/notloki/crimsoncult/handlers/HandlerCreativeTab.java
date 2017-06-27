package com.notloki.crimsoncult.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static net.minecraft.init.Blocks.GOLD_BLOCK;

public class HandlerCreativeTab {

    public static final CreativeTabs crimson_cult = new CreativeTabs("Crimson Cult") {

        @Override
        public ItemStack getTabIconItem() {return new ItemStack(Item.getItemFromBlock(GOLD_BLOCK));}
    };
}
