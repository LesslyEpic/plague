package mods.lesslyepic.plaguemod.client.item.metadata;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.lesslyepic.plaguemod.client.item.plagueItems;
import mods.lesslyepic.plaguemod.common.plaguemod;
import mods.lesslyepic.plaguemod.common.stringColor;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.FakePlayerFactory;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;

public class metadataBloodSyringe extends Item
{
public static boolean keyPressed_DISPOSE = false;
/** List of item names */
public static final String[] itemMetaNames = new String[] {"blaze", "caveSpider", "creeper", "enderman", "ghast", "ironGolem", "pigZombie", "silverfish", "skeleton", "slime", "snowMan", "spider", "witch", "bat", "chicken", "cow", "horse", "mooshroom", "ocelot", "pig", "sheep", "squid", "villager"};
public static final String[] item_a = new String[] {"blaze", "caveSpider", "creeper", "enderman", "ghast", "ironGolem", "pigZombie", "silverfish", "skeleton", "slime", "snowMan", "spider", "witch", "bat", "chicken", "cow", "horse", "mooshroom", "ocelot", "pig", "sheep", "squid", "villager"};
@SideOnly(Side.CLIENT)
private Icon[] item_b;

public metadataBloodSyringe(int par1)
{
         super(par1);
         this.setHasSubtypes(true);
         this.setMaxStackSize(1);
         this.setMaxDamage(0);
         this.setCreativeTab(plaguemod.tabPlagueItems);
         this.setUnlocalizedName("metadataBloodSyringe");
}

@SideOnly(Side.CLIENT)

/**
         * Gets an icon index based on an item's damage value
         */
public Icon getIconFromDamage(int par1)
{
         int j = MathHelper.clamp_int(par1, 0, 22);
         return this.item_b[j];
}

/**
         * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
         * different names based on their damage or NBT.
         */
public String getUnlocalizedName(ItemStack par1ItemStack)
{
         int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 22);
         return super.getUnlocalizedName() + "." + itemMetaNames[i];
}

public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
{
EntityPlayer player = (EntityPlayer)par3Entity;

if(this.keyPressed_DISPOSE)
	{
    if(player.getHeldItem() != null && player.getHeldItem().itemID == plagueItems.toolSyringeBasic_Blood_Metadata.itemID)
    {
		player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(plagueItems.toolSyringeBasic));
	}
}
}
@Override
public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
{
l.add("Basic");	
l.add(stringColor.dark_red + "[Blood]");
}

@SideOnly(Side.CLIENT)

/**
         * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
         */
public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
{
         for (int j = 0; j < 23; ++j)
         {
                 par3List.add(new ItemStack(par1, 1, j));
         }
}

@Override
public void registerIcons(IconRegister par1IconRegister)
{
         this.item_b = new Icon[item_a.length];
        
         for (int i = 0; i < item_a.length; ++i)
         {
                 this.item_b[i] = par1IconRegister.registerIcon("lesslyepic:syringe_blood");
         }
}
}