package uk.co.conclipsegames.hrp.Proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import uk.co.conclipsegames.hrp.hrp;

/**
 * Created by James on 20/08/2017.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(hrp.modId + ":" + id, "inventory"));
    }
}
