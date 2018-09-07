package net.hycrafthd.tutorialmod.item;

import net.hycrafthd.tutorialmod.TutorialConstants;
import net.hycrafthd.tutorialmod.init.TutorialItems;
import net.hycrafthd.tutorialmod.init.TutorialTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemEmeraldArmor extends ItemArmor {

	public ItemEmeraldArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setCreativeTab(TutorialTabs.tab);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (TutorialItems.emeraldChestplate.equals(itemStack.getItem())) {
			player.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 20));
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 1));
		}
	}

}
