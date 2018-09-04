package net.hycrafthd.tutorialmod.item;

import net.hycrafthd.tutorialmod.init.TutorialTabs;
import net.minecraft.item.ItemSword;

public class ItemEmeraldSword extends ItemSword {

	public ItemEmeraldSword(ToolMaterial material) {
		super(material);
		setCreativeTab(TutorialTabs.tab);
	}

}
