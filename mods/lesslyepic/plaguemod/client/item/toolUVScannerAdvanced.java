package mods.lesslyepic.plaguemod.client.item;

import java.util.List;

import mods.lesslyepic.plaguemod.common.plaguemod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;

public class toolUVScannerAdvanced extends Item {
	
public toolUVScannerAdvanced(int par1) {
	super(par1);
	setUnlocalizedName("toolUVScannerAdvanced");
	setMaxStackSize(1);
	setCreativeTab(plaguemod.tabPlagueItems);
}
@Override
public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B){
l.add("\u00a7BAdvanced");	
l.add("[Empty]");
}
public void registerIcons(IconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon("lesslyepic:uv_scanner_adv");
	}
}
