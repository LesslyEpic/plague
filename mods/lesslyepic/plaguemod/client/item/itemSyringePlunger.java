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

public class itemSyringePlunger extends Item{
	
public itemSyringePlunger(int par1) {
	super(par1);
	setUnlocalizedName("itemSyringePlunger");
	setMaxStackSize(1);
	setCreativeTab(plaguemod.tabPlagueItems);
}

public void registerIcons(IconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon("lesslyepic:syringe_plunger");
	}
}