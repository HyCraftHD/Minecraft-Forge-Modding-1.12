package net.hycrafthd.tutorialmod.block;

import net.hycrafthd.tutorialmod.init.TutorialTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.*;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.*;

public class BlockTutorialFacing extends Block {
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing");
	
	public BlockTutorialFacing() {
		super(Material.ROCK);
		setCreativeTab(TutorialTabs.tab);
		setDefaultState(getDefaultState().withProperty(FACING, EnumFacing.NORTH));
	}
	
	@Override
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
		return getDefaultState().withProperty(FACING, EnumFacing.getDirectionFromEntityLiving(pos, placer));
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(FACING).getIndex();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(FACING, EnumFacing.getFront(meta));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, FACING);
	}
	
	@Override
	public boolean canConnectRedstone(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
		if (side == null) {
			return true;
		}
		if (state.getValue(FACING) != side.getOpposite()) {
			return true;
		}
		return false;
	}
	
}
