package net.hycrafthd.tutorialmod.proxy;

import net.hycrafthd.tutorialmod.init.TutorialModels;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	public void preinit(FMLPreInitializationEvent event) {
		super.preinit(event);
		MinecraftForge.EVENT_BUS.register(TutorialModels.class);
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	public void postinit(FMLPostInitializationEvent event) {
		super.postinit(event);
	}

}
