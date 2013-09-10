package mods.lesslyepic.plaguemod.client.item;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mods.lesslyepic.plaguemod.client.item.metadata.metadataBloodSyringe;
import mods.lesslyepic.plaguemod.common.configCore;
import mods.lesslyepic.plaguemod.common.plaguemod;
import mods.lesslyepic.plaguemod.common.stringColor;
import net.minecraft.item.Item;

public class plagueItems {
	
	public static Item toolSyringeBasic;
	public static Item toolSyringeSingleUse;
	public static Item toolUVScannerBasic;
	public static Item toolBlockirusDeployerBasic;
	public static Item toolSyringeBasic_Blood_Metadata;
	public static Item toolSyringeAdvanced;
	public static Item toolUVScannerAdvanced;
	public static Item toolBlockirusDeployerAdvanced;
	public static Item toolSyringeAdvanced_Blood;
	
	public static Item toolCylinder;
	public static Item toolTesttube;
	public static Item toolDropper;
	public static Item toolGlassStrip;
	
	public static Item itemPlastic;
	public static Item itemMeltedPlastic;
	public static Item itemHardenedPlastic;
	
	public static Item itemSyringePlunger;
	public static Item itemSyringeNeedle;
	public static Item itemSyringeTube;
	
	public static Item itemMonitor;
	public static Item itemHandleGrip;
	public static Item itemScanner;
	public static Item itemWire;
	
	public static Item itemImpure;

@EventHandler	
public static void preInit(FMLPreInitializationEvent c){	
	
	configCore cc = new configCore();
	cc.loadConfig(c);	
	
	toolSyringeBasic = new toolSyringeBasic(cc.toolSyringeBasic_ID, true);
	toolSyringeBasic_Blood_Metadata = new metadataBloodSyringe(cc.toolSyringeBasic_Blood_ID);
	toolUVScannerBasic = new toolUVScannerBasic(cc.toolUVScannerBasic_ID);
	toolBlockirusDeployerBasic = new toolBlockirusDeployerBasic(cc.toolBlockirusDeployerBasic_ID);
	toolSyringeAdvanced = new toolSyringeAdvanced(cc.toolSyringeAdvanced_ID);
	toolUVScannerAdvanced = new toolUVScannerAdvanced(cc.toolUVScannerAdvanced_ID);
	toolBlockirusDeployerAdvanced = new toolBlockirusDeployerAdvanced(cc.toolBlockirusDeployerAdvanced_ID);

	toolCylinder = new toolCylinder(cc.toolCylinder_ID);
	toolTesttube = new toolTesttube(cc.toolTesttube_ID);
	toolDropper = new toolDropper(cc.toolDropper_ID);
	toolGlassStrip = new toolGlassStrip(cc.toolGlassStrip_ID);
	
	itemSyringePlunger = new itemSyringePlunger(cc.itemSyringePlunger_ID);
	itemSyringeNeedle = new itemSyringeNeedle(cc.itemSyringeNeedle_ID);
	itemSyringeTube = new itemSyringeTube(cc.itemSyringeTube_ID);
	
	LanguageRegistry.addName(toolSyringeBasic, "Syringe");
	LanguageRegistry.addName(toolUVScannerBasic, "UV Scanner");
	LanguageRegistry.addName(toolSyringeAdvanced, stringColor.light_cyan + "Syringe");
	LanguageRegistry.addName(toolUVScannerAdvanced, stringColor.light_cyan + "UV Scanner");
	LanguageRegistry.addName(toolBlockirusDeployerBasic, "Blockirus Deployer");
	LanguageRegistry.addName(toolBlockirusDeployerAdvanced, stringColor.light_cyan + "Blockirus Deployer");
	
	LanguageRegistry.addName(toolCylinder, "Cylinder");
	LanguageRegistry.addName(toolTesttube, "Test tube");
	LanguageRegistry.addName(toolDropper, "Dropper");
	LanguageRegistry.addName(toolGlassStrip, "Glass Strip");
	
	LanguageRegistry.addName(itemSyringePlunger, "Syringe Plunger");
	LanguageRegistry.addName(itemSyringeNeedle, "Syringe Needle");
	LanguageRegistry.addName(itemSyringeTube, "Syringe Tube");
	
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.blaze.name", "Syringe [Blaze Blood]");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.caveSpider.name", "Syringe [CaveSpider Blood]");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.creeper.name", "Syringe [Creeper Blood]");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.enderman.name", "Syringe "+ stringColor.light_purple +"[Enderman Blood]");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.ghast.name", "Syringe Ghast Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.ironGolem.name", "Syringe Iron Golem Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.pigZombie.name", "Syringe Zombie Pigman Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.silverfish.name", "Syringe Silverfish Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.skeleton.name", "Syringe Skeleton Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.slime.name", "Syringe Slime Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.snowMan.name", "Syringe Snowman Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.spider.name", "Syringe Spider Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.witch.name", "Syringe Witch Blood");		
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.bat.name", "Syringe Bat Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.chicken.name", "Syringe Chicken Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.cow.name", "Syringe Cow Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.horse.name", "Syringe Horse Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.mooshroom.name", "Syringe Mooshroom Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.ocelot.name", "Syringe Ocelot Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.pig.name", "Syringe Pig Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.sheep.name", "Syringe Sheep Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.squid.name", "Syringe Squid Blood");
	LanguageRegistry.instance().addStringLocalization("item.metadataBloodSyringe.villager.name", "Syringe Villager Blood");
	}
}
