package uk.co.conclipsegames.hrp;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.co.conclipsegames.hrp.Blocks.ModBlocks;
import uk.co.conclipsegames.hrp.Proxy.CommonProxy;

/**
 * Created by James on 20/08/2017.
 */
@Mod(modid = hrp.modId, name = hrp.name, version = hrp.version, acceptedMinecraftVersions = "[1.10.2]")
public class hrp {
    public static final String modId = "hrp";
    public static final String name = "HardcoreRestorePoints";
    public static final String version = "1.0.0";

    @SidedProxy(serverSide = "uk.co.conclipsegames.hrp.Proxy.CommonProxy", clientSide = "uk.co.conclipsegames.hrp.Proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static hrp instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModBlocks.init();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }


}
