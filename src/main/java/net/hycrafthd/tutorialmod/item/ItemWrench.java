package net.hycrafthd.tutorialmod.item;

import net.hycrafthd.tutorialmod.init.TutorialTabs;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemWrench extends Item {
	
	public ItemWrench() {
		setCreativeTab(TutorialTabs.tab);
		setMaxStackSize(1);
	}
	
	@Override
	public EnumActionResult onItemUseFirst(EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand) {
		if (!world.isRemote) {
			IBlockState state = world.getBlockState(pos);
			
			for (IProperty<?> prop : state.getProperties().keySet()) {
				if ((prop.getName().equals("facing") || prop.getName().equals("rotation")) && prop.getValueClass() == EnumFacing.class) {
					if (prop.getAllowedValues().contains(side)) {
						world.setBlockState(pos, state.withProperty((IProperty<EnumFacing>) prop, side));
					}
				}
			}
		}
		return EnumActionResult.SUCCESS;
	}
	
}
