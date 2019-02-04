package net.hycrafthd.tutorialmod.init;

import net.hycrafthd.tutorialmod.TutorialConstants;
import net.hycrafthd.tutorialmod.item.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class TutorialItems {
	
	public static final ItemTutorial tutitem = new ItemTutorial();
	
	public static final ItemTeleporter teleporter = new ItemTeleporter();
	
	public static final ItemSuperFood superfood = new ItemSuperFood();
	
	public static final ToolMaterial emeraldToolMaterial = EnumHelper.addToolMaterial("emerald", 3, 1000, 16.0F, 6F, 30);
	public static final ItemEmeraldSword emeraldSword = new ItemEmeraldSword(emeraldToolMaterial);
	public static final ItemEmeraldPickaxe emeraldPickaxe = new ItemEmeraldPickaxe(emeraldToolMaterial);
	public static final ItemEmeraldAxe emeraldAxe = new ItemEmeraldAxe(emeraldToolMaterial);
	public static final ItemEmeraldSpade emeraldSpade = new ItemEmeraldSpade(emeraldToolMaterial);
	public static final ItemEmeraldHoe emeraldHoe = new ItemEmeraldHoe(emeraldToolMaterial);
	
	public static final ArmorMaterial emeraldArmorMaterial = EnumHelper.addArmorMaterial("emerald", TutorialConstants.MODID + ":emerald", 1000, new int[] { 3, 5, 7, 3 }, 30, SoundEvents.ENTITY_ZOMBIE_VILLAGER_HURT, 0F);
	public static final ItemEmeraldArmor emeraldHelmet = new ItemEmeraldArmor(emeraldArmorMaterial, 0, EntityEquipmentSlot.HEAD);
	public static final ItemEmeraldArmor emeraldChestplate = new ItemEmeraldArmor(emeraldArmorMaterial, 1, EntityEquipmentSlot.CHEST);
	public static final ItemEmeraldArmor emeraldLeggings = new ItemEmeraldArmor(emeraldArmorMaterial, 2, EntityEquipmentSlot.LEGS);
	public static final ItemEmeraldArmor emeraldBoots = new ItemEmeraldArmor(emeraldArmorMaterial, 3, EntityEquipmentSlot.FEET);
	
	public static final ItemWrench wrench = new ItemWrench();
	
	public static void init() {
		setName(tutitem, "tutitem");
		setName(teleporter, "teleporter");
		setName(superfood, "superfood");
		
		setName(emeraldSword, "emerald_sword");
		setName(emeraldPickaxe, "emerald_pickaxe");
		setName(emeraldAxe, "emerald_axe");
		setName(emeraldSpade, "emerald_spade");
		setName(emeraldHoe, "emerald_hoe");
		
		setName(emeraldHelmet, "emerald_helmet");
		setName(emeraldChestplate, "emerald_chestplate");
		setName(emeraldLeggings, "emerald_leggings");
		setName(emeraldBoots, "emerald_boots");
		
		setName(wrench, "wrench");
	}
	
	@SubscribeEvent
	public static void register(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		registry.register(tutitem);
		
		registry.register(teleporter);
		
		registry.register(superfood);
		
		registry.registerAll(emeraldSword, emeraldPickaxe, emeraldAxe, emeraldSpade, emeraldHoe);
		
		registry.registerAll(emeraldHelmet, emeraldChestplate, emeraldLeggings, emeraldBoots);
		
		registry.register(wrench);
	}
	
	public static void setName(Item item, String name) {
		item.setRegistryName(new ResourceLocation(TutorialConstants.MODID, name));
		item.setUnlocalizedName(name);
	}
	
}
