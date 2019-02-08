package net.hycrafthd.tutorialmod.block;

import net.hycrafthd.tutorialmod.TutorialConstants;
import net.hycrafthd.tutorialmod.init.TutorialTabs;
import net.hycrafthd.tutorialmod.tileentity.TileEntityTutorialFacing;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.*;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockTutorialFacing extends Block implements ITileEntityProvider {
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing");
	
	public BlockTutorialFacing() {
		super(Material.ROCK);
		setCreativeTab(TutorialTabs.tab);
		setDefaultState(getDefaultState().withProperty(FACING, EnumFacing.NORTH));
		GameRegistry.registerTileEntity(TileEntityTutorialFacing.class, new ResourceLocation(TutorialConstants.MODID, "tutblockfacing"));
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
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityTutorialFacing();
	}
	
}
