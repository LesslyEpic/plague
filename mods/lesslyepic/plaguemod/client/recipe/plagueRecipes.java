package mods.lesslyepic.plaguemod.client.recipe;

import mods.lesslyepic.plaguemod.client.item.plagueItems;
import mods.lesslyepic.plaguemod.common.plaguemod;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class plagueRecipes {

public static void loadItems(){
	
	GameRegistry.addShapedRecipe(new ItemStack(plagueItems.toolBlockirusDeployerBasic,1,0), new Object []
			{
			"X","X","X", Character.valueOf('X'), Block.dirt 
			});
	GameRegistry.addShapedRecipe(new ItemStack(plagueItems.toolSyringeBasic,1,0), new Object []
			{
			"X","Y","Z", Character.valueOf('X'), plagueItems.itemSyringePlunger, Character.valueOf('Y'), plagueItems.itemSyringeTube, Character.valueOf('Z'), plagueItems.itemSyringeNeedle
			});
	}
public static void loadBlocks(){
	//recipe stub for blocks
	}
}


