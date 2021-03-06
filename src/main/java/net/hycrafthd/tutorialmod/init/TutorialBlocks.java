package net.hycrafthd.tutorialmod.init;

import net.hycrafthd.tutorialmod.TutorialConstants;
import net.hycrafthd.tutorialmod.block.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class TutorialBlocks {
	
	public static final BlockTutorial tutblock = new BlockTutorial();
	
	public static final BlockTutorialFacing tutblockfacing = new BlockTutorialFacing();
	
	public static void init() {
		setName(tutblock, "tutblock");
		setName(tutblockfacing, "tutblockfacing");
	}
	
	@SubscribeEvent
	public static void register(RegistryEvent.Register<Block> event) {
		IForgeRegistry<Block> registry = event.getRegistry();
		registry.register(tutblock);
		registry.register(tutblockfacing);
	}
	
	@SubscribeEvent
	public static void registerItem(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		registry.register(new ItemBlock(tutblock).setRegistryName(tutblock.getRegistryName()));
		registry.register(new ItemBlock(tutblockfacing).setRegistryName(tutblockfacing.getRegistryName()));
	}
	
	public static void setName(Block block, String name) {
		block.setRegistryName(new ResourceLocation(TutorialConstants.MODID, name));
		block.setUnlocalizedName(name);
	}
	
}
