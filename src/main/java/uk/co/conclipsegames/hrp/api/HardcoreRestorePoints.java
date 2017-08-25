package uk.co.conclipsegames.hrp.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.DimensionManager;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by James on 24/08/2017.
 */
public class HardcoreRestorePoints {
    public static void genPoint(EntityPlayer playerToWarn)
    {
        try {
            String fileIn = DimensionManager.getCurrentSaveRootDirectory().getName();
            FileUtils.copyDirectory(new File("saves/"+fileIn),new File("saves/"+fileIn+"-R"));
            playerToWarn.addChatMessage(new TextComponentString("NOTE: Always save and quit to title before activating, otherwise the point may not be created "));
        } catch (IOException e) {

        }
    }
}
