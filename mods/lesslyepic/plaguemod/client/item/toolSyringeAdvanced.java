package mods.lesslyepic.plaguemod.client.item;

import java.util.List;

import mods.lesslyepic.plaguemod.common.plaguemod;
import mods.lesslyepic.plaguemod.common.stringColor;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;

public class toolSyringeAdvanced extends Item{
	
public toolSyringeAdvanced(int par1) {
	super(par1);
	setUnlocalizedName("toolSyringeAdvanced");
	setMaxStackSize(1);
	setCreativeTab(plaguemod.tabPlagueItems);
	setMaxDamage(1000);

}
@Override
public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B){
l.add(stringColor.light_cyan + "Advanced");	
l.add("[Empty]");
}

public void registerIcons(IconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon("lesslyepic:syringe_adv");
	}
}
