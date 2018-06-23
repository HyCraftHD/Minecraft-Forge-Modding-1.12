package net.hycrafthd.tutorialmod.init;

import net.hycrafthd.tutorialmod.TutorialConstants;
import net.hycrafthd.tutorialmod.item.ItemTutorial;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class TutorialItems {

	public static final ItemTutorial tutitem = new ItemTutorial();

	public static void init() {
		setName(tutitem, "tutitem");
	}

	@SubscribeEvent
	public static void register(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		registry.register(tutitem);
	}

	public static void setName(Item item, String name) {
		item.setRegistryName(new ResourceLocation(TutorialConstants.MODID, name));
		item.setUnlocalizedName(name);
	}

}
