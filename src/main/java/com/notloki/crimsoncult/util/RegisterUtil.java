package com.notloki.crimsoncult.util;

import com.notloki.crimsoncult.blocks.BlockAncientStone;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Mod.EventBusSubscriber
public class RegisterUtil {

    private static List<Block> blocks = new ArrayList<>();


    private static void getBlock() {
        List<Block> blocks = new ArrayList<>();
        Collections.addAll(blocks,
                new BlockAncientStone("ancient_stone"));

        RegisterUtil.blocks = blocks;

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        getBlock();
        List<Block> blocks = RegisterUtil.blocks;
        for (Block block : blocks) {

            System.out.println("Registering :" + block.getRegistryName().toString());
            event.getRegistry().register(block);
        }
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        List<Block> blocks = RegisterUtil.blocks;

        for (Block block : blocks) {
            event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));

            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
                    new ModelResourceLocation(
                            block.getRegistryName(),
                            "inventory"));

        }
    }

}
