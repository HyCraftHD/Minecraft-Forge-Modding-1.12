package net.hycrafthd.tutorialmod.item;

import net.hycrafthd.tutorialmod.init.TutorialTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSuperFood extends ItemFood {

	public ItemSuperFood() {
		super(3, 2, false);
		setCreativeTab(TutorialTabs.tab);
		setAlwaysEdible();
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if (!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 100, 2));
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 150, 4));
			player.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 500, 0));
			player.addExperience(5);
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.EPIC;
	}

}
