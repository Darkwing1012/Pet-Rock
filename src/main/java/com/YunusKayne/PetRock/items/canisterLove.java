package com.YunusKayne.PetRock.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import com.YunusKayne.PetRock.creativetab.Tab;
import com.YunusKayne.PetRock.init.Items;
import com.YunusKayne.PetRock.reference.Reference;

public class canisterLove extends ItemFood
{
	public canisterLove(String name, int healAmount, float saturation, boolean alwaysEdible)
	{
		super(healAmount, saturation, alwaysEdible);
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setTextureName(Reference.MOD_ID + ":canisterLove");
		this.setMaxStackSize(1);
	}
	
	public void onFoodEaten(ItemStack canisterLove, World world, EntityPlayer player)
    {
		player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 50, 5));
		player.addPotionEffect(new PotionEffect(Potion.blindness.id, 100, 10));
		player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 10));
		player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 100, 10));
		
		player.inventory.addItemStackToInventory(new ItemStack(Items.canisterEmptyLove));
    }
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
		list.add(StatCollector.translateToLocal("wip"));
    }
}
