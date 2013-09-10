package mods.lesslyepic.plaguemod.client.item;

import java.util.List;

import mods.lesslyepic.plaguemod.common.plaguemod;
import mods.lesslyepic.plaguemod.common.stringColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;

public class toolUVScannerBasic extends Item {
	
public toolUVScannerBasic(int par1) {
	super(par1);
	setUnlocalizedName("toolUVScannerBasic");
	setMaxStackSize(1);
	setCreativeTab(plaguemod.tabPlagueItems);
	setMaxDamage(500);
}
private int scanned = 0;
@Override
public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B){
l.add("Basic");	
if (scanned >= 1)
{
	l.add(stringColor.dark_red + "Micro-organisms Scanned: " +scanned);
}
else
{
	l.add(stringColor.light_green + "Micro-organisms Scanned: " + scanned);
}
}
public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
{
	
         if(!par3World.isRemote)
         {
                par3World.setBlock(par4, par5, par6, Block.bedrock.blockID);
                par1ItemStack.damageItem(1, par2EntityPlayer);
                scanned++;
                return true;
         }
         else
                return false;
		 }
public void registerIcons(IconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon("lesslyepic:uv_scanner_bas");
	}
}
