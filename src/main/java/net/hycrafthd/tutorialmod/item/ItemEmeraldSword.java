package net.hycrafthd.tutorialmod.item;

import com.google.common.collect.Multimap;

import net.hycrafthd.tutorialmod.init.TutorialTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;

public class ItemEmeraldSword extends ItemSword {

	public ItemEmeraldSword(ToolMaterial material) {
		super(material);
		setCreativeTab(TutorialTabs.tab);
	}

	public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
		Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

		if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
			multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", 0, 0));
		}

		return multimap;
	}

}
