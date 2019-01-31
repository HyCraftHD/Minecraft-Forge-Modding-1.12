package net.hycrafthd.tutorialmod.proxy;

import net.hycrafthd.tutorialmod.init.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preinit(FMLPreInitializationEvent event) {
		TutorialItems.init();
		TutorialBlocks.init();
		
		MinecraftForge.EVENT_BUS.register(TutorialItems.class);
		MinecraftForge.EVENT_BUS.register(TutorialBlocks.class);
		
		GameRegistry.registerWorldGenerator(new TutorialWorldGeneration(), 0);
	}
	
	public void init(FMLInitializationEvent event) {
		TutorialSmelting.init();
	}
	
	public void postinit(FMLPostInitializationEvent event) {
	}
	
}
