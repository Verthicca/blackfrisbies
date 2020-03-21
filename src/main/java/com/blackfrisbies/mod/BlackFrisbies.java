package com.blackfrisbies.mod;

import com.blackfrisbies.mod.group.DiscGroup;
import com.blackfrisbies.mod.util.GiveDiscCommand;
import com.blackfrisbies.mod.util.Reference;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

@Mod(Reference.MODID)
public class BlackFrisbies {
    public static final ItemGroup DISC_GROUP = new DiscGroup("discgroup");

    public void serverStarting(FMLServerStartingEvent event)
    {
        GiveDiscCommand.register(event.getCommandDispatcher());
    }
}
