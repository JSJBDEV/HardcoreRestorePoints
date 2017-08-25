package uk.co.conclipsegames.hrp.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by James on 24/08/2017.
 */
public class ModBlocks {
    public static BlockBase restore;

    public static void init() {
        restore = register(new BlockBase(Material.WOOD,"restore_point"));

    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if (block instanceof BlockBase) {
            ((BlockBase)block).registerItemModel(itemBlock);
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        System.out.println(itemBlock.getRegistryName());
        return register(block, itemBlock);
    }
}
