package net.hycrafthd.tutorialmod.item;

import net.hycrafthd.tutorialmod.init.TutorialTabs;
import net.minecraft.item.ItemAxe;

public class ItemEmeraldAxe extends ItemAxe {

	public ItemEmeraldAxe(ToolMaterial material) {
		super(material, 10.0F, 0F);
		setCreativeTab(TutorialTabs.tab);
	}

}
