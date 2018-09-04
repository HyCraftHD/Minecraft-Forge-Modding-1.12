package net.hycrafthd.tutorialmod.init;

import net.hycrafthd.tutorialmod.TutorialConstants;
import net.hycrafthd.tutorialmod.item.ItemEmeraldAxe;
import net.hycrafthd.tutorialmod.item.ItemEmeraldHoe;
import net.hycrafthd.tutorialmod.item.ItemEmeraldPickaxe;
import net.hycrafthd.tutorialmod.item.ItemEmeraldSpade;
import net.hycrafthd.tutorialmod.item.ItemEmeraldSword;
import net.hycrafthd.tutorialmod.item.ItemSuperFood;
import net.hycrafthd.tutorialmod.item.ItemTeleporter;
import net.hycrafthd.tutorialmod.item.ItemTutorial;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
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

	public static void init() {
		setName(tutitem, "tutitem");
		setName(teleporter, "teleporter");
		setName(superfood, "superfood");

		setName(emeraldSword, "emerald_sword");
		setName(emeraldPickaxe, "emerald_pickaxe");
		setName(emeraldAxe, "emerald_axe");
		setName(emeraldSpade, "emerald_spade");
		setName(emeraldHoe, "emerald_hoe");
	}

	@SubscribeEvent
	public static void register(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		registry.register(tutitem);

		registry.register(teleporter);

		registry.register(superfood);

		registry.registerAll(emeraldSword, emeraldPickaxe, emeraldAxe, emeraldSpade, emeraldHoe);
	}

	public static void setName(Item item, String name) {
		item.setRegistryName(new ResourceLocation(TutorialConstants.MODID, name));
		item.setUnlocalizedName(name);
	}

}
