package net.hycrafthd.tutorialmod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class CreativeTabTutorial extends CreativeTabs {

	public CreativeTabTutorial() {
		super("tuttab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Blocks.ANVIL);
	}

}
