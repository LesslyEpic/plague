package mods.lesslyepic.plaguemod.client.block;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mods.lesslyepic.plaguemod.common.configCore;
import mods.lesslyepic.plaguemod.common.plaguemod;
import mods.lesslyepic.plaguemod.common.stringColor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class plagueBlocks {

	public static Block blockSyringeScannerBasic;
	public static Block blockSyringeScannerAdvanced;
	
	public static Block blockImpure;

@EventHandler	
public static void preInit(FMLPreInitializationEvent c){
	
	configCore cc = new configCore();
	cc.loadConfig(c);	
	
	blockSyringeScannerBasic = new blockSyringeScannerBasic(cc.blockBasicSyringeScanner_ID, Material.iron);
	blockSyringeScannerAdvanced = new blockSyringeScannerAdvanced(cc.blockAdvancedSyringeScanner_ID, Material.iron);
	
	GameRegistry.registerBlock(blockSyringeScannerBasic, "Basic Syringe Scanner");
	GameRegistry.registerBlock(blockSyringeScannerAdvanced, ItemBlock.class, "Advanced Syringe Scanner");
	
	LanguageRegistry.addName(blockSyringeScannerBasic, "Basic Syringe Scanner");
	LanguageRegistry.addName(blockSyringeScannerAdvanced, stringColor.light_cyan + "Advanced Syringe Scanner");
	
	}
}
