package net.hycrafthd.tutorialmod.block;

import java.util.Random;

import net.hycrafthd.tutorialmod.init.TutorialItems;
import net.hycrafthd.tutorialmod.init.TutorialTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockTutorial extends Block {

	public BlockTutorial() {
		super(Material.ROCK);
		setCreativeTab(TutorialTabs.tab);
		setHardness(2.5F);
		setResistance(100F);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.5F);
	}

	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return random.nextInt(5) + 1;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return TutorialItems.tutitem;
	}

}
