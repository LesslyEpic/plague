package mods.lesslyepic.plaguemod.client.item;

import java.util.List;

import mods.lesslyepic.plaguemod.client.key.keyDisposeSyringeContent;
import mods.lesslyepic.plaguemod.common.plaguemod;
import mods.lesslyepic.plaguemod.common.stringColor;
import net.minecraft.item.Item;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

public class toolSyringeBasic extends Item {
	
public toolSyringeBasic(int par1, boolean canHoldFluid_confir) {
	super(par1);
	setUnlocalizedName("toolSyringeBasic");
	setMaxStackSize(1);
	setCreativeTab(plaguemod.tabPlagueItems);
	setMaxDamage(50);
}
@Override
public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B){
l.add("Basic");
l.add("[Empty]");
}


public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
{
  return true;
}

public void registerIcons(IconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon("lesslyepic:syringe");
	}
}
