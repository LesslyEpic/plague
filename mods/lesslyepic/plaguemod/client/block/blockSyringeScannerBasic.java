package mods.lesslyepic.plaguemod.client.block;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.lesslyepic.plaguemod.client.gui.guiSyringeScannerBasic;
import mods.lesslyepic.plaguemod.common.plaguemod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class blockSyringeScannerBasic extends BlockContainer{
	
	private String className = this.getClass().getName();
	
	public blockSyringeScannerBasic(int par1, Material par2Material) {
		super(par1, par2Material);
		setUnlocalizedName(className);
		setCreativeTab(plaguemod.tabPlagueBlocks);
		setHardness(3.0F);
		setResistance(3.0F);
		setStepSound(this.soundMetalFootstep);
	}
    @SideOnly(Side.CLIENT)
    private Icon blockIconTop;
    @SideOnly(Side.CLIENT)
    private Icon blockIconFront;
    @SideOnly(Side.CLIENT)
    private Icon blockIconBottom;
    @SideOnly(Side.CLIENT)
    
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 0 ? this.blockIconBottom : par1 == 1 ? this.blockIconTop : (par1 != par2 ? this.blockIcon : this.blockIconFront);
    }
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        super.onBlockAdded(par1World, par2, par3, par4);
        this.setDefaultDirection(par1World, par2, par3, par4);
    }

    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
        }

        if (l == 1)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
        }

        if (l == 2)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
        }

        if (l == 3)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);
        }
    }
    
    private void setDefaultDirection(World par1World, int par2, int par3, int par4)
    {
        if (!par1World.isRemote)
        {
            int l = par1World.getBlockId(par2, par3, par4 - 1);
            int i1 = par1World.getBlockId(par2, par3, par4 + 1);
            int j1 = par1World.getBlockId(par2 - 1, par3, par4);
            int k1 = par1World.getBlockId(par2 + 1, par3, par4);
            byte b0 = 3;

            if (Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[i1])
            {
                b0 = 3;
            }

            
            if (Block.opaqueCubeLookup[i1] && !Block.opaqueCubeLookup[l])
            {
                b0 = 2;
            }

            if (Block.opaqueCubeLookup[j1] && !Block.opaqueCubeLookup[k1])
            {
                b0 = 5;
            }

            if (Block.opaqueCubeLookup[k1] && !Block.opaqueCubeLookup[j1])
            {
                b0 = 4;
            }

            par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 2);
        }
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("lesslyepic:syringe_scanner_bas_side");//side
        this.blockIconFront = par1IconRegister.registerIcon("lesslyepic:syringe_scanner_bas_front");//front
        this.blockIconTop = par1IconRegister.registerIcon("lesslyepic:syringe_scanner_bas_top");//top
        this.blockIconBottom = par1IconRegister.registerIcon("lesslyepic:syringe_scanner_bas_bottom");//bottom
    }
	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}
	@Override
	public void breakBlock(World world, int x, int y, int z, int par5, int par6) {
		dropItems(world, x, y, z);
		super.breakBlock(world, x, y, z, par5, par6);
	}
	private void dropItems(World world, int x, int y, int z) {
		Random rand = new Random();
		
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		
	if (!(tileEntity instanceof IInventory)) {
			return;
		}
	
	IInventory inventory = (IInventory) tileEntity;
	
	for (int i = 0; 1 < inventory.getSizeInventory(); i++) {
		ItemStack item  = inventory.getStackInSlot(i);
		if (item != null && item.stackSize > 0) {
			float rx = rand.nextFloat() * 0.0F + 0.1F;
			float ry = rand.nextFloat() * 0.0F + 0.1F;
			float rz = rand.nextFloat() * 0.0F + 0.1F;
			
			EntityItem entityItem = new EntityItem(world, x + rx, y + ry, z + rz, new ItemStack(item.itemID, item.stackSize, item.getItemDamage()));
			
		if (item.hasTagCompound()) {
			entityItem.getEntityItem().setTagCompound((NBTTagCompound)item.getTagCompound().copy());
			}
		
		float factor = 0.05F;
			entityItem.motionX = rand.nextGaussian() * factor;
			entityItem.motionY = rand.nextGaussian() * factor + 0.2F;
			entityItem.motionZ = rand.nextGaussian() * factor;
			
		world.spawnEntityInWorld(entityItem);	
			item.stackSize = 0;	
			}
		}
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int metadata, float what, float these, float are) {
			TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
	if (tileEntity == null || player.isSneaking()) {
			return false;
		}
			player.openGui(plaguemod.instance, 0, world, x, y, z);
			return true;
		}
	}