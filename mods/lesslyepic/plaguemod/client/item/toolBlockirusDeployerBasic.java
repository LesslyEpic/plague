package mods.lesslyepic.plaguemod.client.item;

import java.util.List;

import mods.lesslyepic.plaguemod.common.plaguemod;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import cpw.mods.fml.common.ICraftingHandler;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;

public class toolBlockirusDeployerBasic extends Item{
	
public toolBlockirusDeployerBasic(int par1) {
	super(par1);
	setUnlocalizedName("toolBlockirusDeployerBasic");
	setMaxStackSize(1);
	setCreativeTab(plaguemod.tabPlagueItems);
	setMaxDamage(500);
}
@Override
public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B){
l.add("Basic");	
l.add("[Empty]");
}
public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
{
	
         if(!par3World.isRemote)
         {
                par3World.setBlock(par4, par5, par6, Block.bedrock.blockID);
                par1ItemStack.damageItem(1, par2EntityPlayer);
                return true;
         }
         else
                return false;
		}

public void registerIcons(IconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon("lesslyepic:blockirus_deploy_bas");
	}
}