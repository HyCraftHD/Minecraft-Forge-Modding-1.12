package net.hycrafthd.tutorialmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialSmelting {

	public static void init() {
		GameRegistry.addSmelting(TutorialBlocks.tutblock, new ItemStack(TutorialItems.tutitem, 2), 2F);
	}

}
