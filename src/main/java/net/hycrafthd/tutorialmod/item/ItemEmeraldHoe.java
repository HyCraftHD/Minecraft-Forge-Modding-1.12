package net.hycrafthd.tutorialmod.item;

import net.hycrafthd.tutorialmod.init.TutorialTabs;
import net.minecraft.item.ItemHoe;

public class ItemEmeraldHoe extends ItemHoe {

	public ItemEmeraldHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(TutorialTabs.tab);
	}

}
