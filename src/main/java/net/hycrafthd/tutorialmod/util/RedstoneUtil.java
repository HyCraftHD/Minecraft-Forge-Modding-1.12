package net.hycrafthd.tutorialmod.util;

import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RedstoneUtil {
	
	public static boolean isPowered(World world, BlockPos pos) {
		boolean powered = world.isBlockPowered(pos);
		if (!powered) {
			for (EnumFacing facing : EnumFacing.VALUES) {
				BlockPos offsetPos = pos.offset(facing);
				IBlockState state = world.getBlockState(offsetPos);
				if (state.getBlock() == Blocks.REDSTONE_WIRE && state.getValue(BlockRedstoneWire.POWER) > 0) {
					return true;
				}
			}
		}
		return powered;
	}
}
