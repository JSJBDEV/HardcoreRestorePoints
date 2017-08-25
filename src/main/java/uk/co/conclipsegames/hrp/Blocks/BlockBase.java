package uk.co.conclipsegames.hrp.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import uk.co.conclipsegames.hrp.api.HardcoreRestorePoints;
import uk.co.conclipsegames.hrp.hrp;

import javax.annotation.Nullable;

/**
 * Created by James on 24/08/2017.
 */
public class BlockBase extends Block {
    protected String name;

    public BlockBase(Material material, String name) {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel(ItemBlock itemBlock) {
        hrp.proxy.registerItemRenderer(itemBlock, 0, name);
    }



    @Override
    public boolean onBlockActivated(World p_onBlockActivated_1_, BlockPos p_onBlockActivated_2_, IBlockState p_onBlockActivated_3_, EntityPlayer p_onBlockActivated_4_, EnumHand p_onBlockActivated_5_, @Nullable ItemStack p_onBlockActivated_6_, EnumFacing p_onBlockActivated_7_, float p_onBlockActivated_8_, float p_onBlockActivated_9_, float p_onBlockActivated_10_) {
        HardcoreRestorePoints.genPoint(p_onBlockActivated_4_);
        return super.onBlockActivated(p_onBlockActivated_1_, p_onBlockActivated_2_, p_onBlockActivated_3_, p_onBlockActivated_4_, p_onBlockActivated_5_, p_onBlockActivated_6_, p_onBlockActivated_7_, p_onBlockActivated_8_, p_onBlockActivated_9_, p_onBlockActivated_10_);
    }
}
