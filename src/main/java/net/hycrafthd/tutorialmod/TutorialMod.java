package net.hycrafthd.tutorialmod;

import static net.hycrafthd.tutorialmod.TutorialConstants.MODID;
import static net.hycrafthd.tutorialmod.TutorialConstants.NAME;
import static net.hycrafthd.tutorialmod.TutorialConstants.VERSION;

import net.hycrafthd.tutorialmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MODID, name = NAME, version = VERSION)
public class TutorialMod {

	@Instance
	private static TutorialMod instance;

	public static TutorialMod getInstance() {
		return instance;
	}

	@SidedProxy(serverSide = "net.hycrafthd.tutorialmod.proxy.CommonProxy", clientSide = "net.hycrafthd.tutorialmod.proxy.ClientProxy")
	private static CommonProxy proxy;

	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		proxy.preinit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		proxy.postinit(event);
	}

}
