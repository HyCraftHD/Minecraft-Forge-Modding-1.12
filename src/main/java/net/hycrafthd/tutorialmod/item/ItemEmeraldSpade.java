package net.hycrafthd.tutorialmod.item;

import net.hycrafthd.tutorialmod.init.TutorialTabs;
import net.minecraft.item.ItemSpade;

public class ItemEmeraldSpade extends ItemSpade {

	public ItemEmeraldSpade(ToolMaterial material) {
		super(material);
		setCreativeTab(TutorialTabs.tab);
	}

}
