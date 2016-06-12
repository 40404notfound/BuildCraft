package buildcraft.factory;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import buildcraft.core.BCCore;
import buildcraft.lib.BCLib;
import buildcraft.lib.RegistryHelper;

@Mod(modid = BCFactory.MODID, name = "BuildCraft Factory", dependencies = "required-after:buildcraftcore", version = BCLib.VERSION)
public class BCFactory {
    public static final String MODID = "buildcraftfactory";

    @Mod.Instance(MODID)
    public static BCFactory INSTANCE = null;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt) {
        RegistryHelper.useOtherModConfigFor(MODID, BCCore.MODID);

        BCFactoryItems.preInit();
        BCFactoryBlocks.preInit();

        NetworkRegistry.INSTANCE.registerGuiHandler(INSTANCE, FactoryProxy_BC8.getProxy());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent evt) {
        FactoryProxy_BC8.getProxy().fmlInit();
        BCFactoryRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent evt) {

    }
}