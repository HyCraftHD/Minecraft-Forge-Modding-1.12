package net.hycrafthd.tutorialmod.item;

import net.hycrafthd.tutorialmod.init.TutorialTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemEmeraldPickaxe extends ItemPickaxe {

	public ItemEmeraldPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(TutorialTabs.tab);
		attackSpeed = -8;
	}

}
