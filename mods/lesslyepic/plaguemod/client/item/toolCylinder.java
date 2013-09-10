package mods.lesslyepic.plaguemod.client.item;

import java.util.List;

import mods.lesslyepic.plaguemod.common.plaguemod;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;

public class toolCylinder extends Item{
	
public toolCylinder(int par1) {
	super(par1);
	setUnlocalizedName("toolCylinder");
	setMaxStackSize(1);
	setCreativeTab(plaguemod.tabPlagueItems);
}

public void registerIcons(IconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon("lesslyepic:cylinder");
	}
}
