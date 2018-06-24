package net.hycrafthd.tutorialmod.block;

import net.hycrafthd.tutorialmod.init.TutorialTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTutorial extends Block {

	public BlockTutorial() {
		super(Material.ROCK);
		setCreativeTab(TutorialTabs.tab);
	}

}
