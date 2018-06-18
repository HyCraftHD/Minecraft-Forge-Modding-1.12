package net.hycrafthd.tutorialmod;

import static net.hycrafthd.tutorialmod.TutorialConstants.*;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MODID, name = NAME, version = VERSION)
public class TutorialMod {

	@Instance
	private static TutorialMod instance;

	public static TutorialMod getInstance() {
		return instance;
	}

}
