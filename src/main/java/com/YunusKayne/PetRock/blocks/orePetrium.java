package com.YunusKayne.PetRock.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

import com.YunusKayne.PetRock.creativetab.Tab;
import com.YunusKayne.PetRock.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class orePetrium extends Block
{
	public orePetrium(Material rock, String name)
	{
		super(rock);
		this.setBlockName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setBlockTextureName("PetRock:orePetrium");
		this.setStepSound(soundTypeStone);
		//this.setHardness(2.0F);
		//this.setResistance(10.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
	this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName());
	}
}