package net.hycrafthd.tutorialmod.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TutorialModels {

	@SubscribeEvent
	public static void register(ModelRegistryEvent event) {
		register(TutorialItems.tutitem);

		register(TutorialItems.teleporter);

		register(Item.getItemFromBlock(TutorialBlocks.tutblock));
	}

	private static void register(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
