package mods.lesslyepic.plaguemod.common;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class configCore
{

	public static String consumerKey = "";
	public static String consumerSecret = "";
	public static String accessToken = "";
	public static String accessTokenSecret = "";
	
	public static int toolSyringeBasic_ID;
	public static int toolSyringeBasic_Blood_ID;
	public static int toolUVScannerBasic_ID;
	public static int toolBlockirusDeployerBasic_ID;
	public static int toolSyringeAdvanced_ID;
	public static int toolUVScannerAdvanced_ID;
	public static int toolBlockirusDeployerAdvanced_ID;
	
	public static int toolCylinder_ID;
	public static int toolTesttube_ID;
	public static int toolDropper_ID;
	public static int toolGlassStrip_ID;
	
	public static int itemSyringePlunger_ID;
	public static int itemSyringeNeedle_ID;
	public static int itemSyringeTube_ID;

	public static int blockBasicSyringeScanner_ID;
	public static int blockAdvancedSyringeScanner_ID;
	
public static void loadConfig(FMLPreInitializationEvent c)
{
	Configuration config = new Configuration(c.getSuggestedConfigurationFile()); //Gets the file

	config.load();
//twitter
	Property consumerKey = config.get(Configuration.CATEGORY_GENERAL, "cK", "NULL");
	Property consumerSecret = config.get(Configuration.CATEGORY_GENERAL, "cS", "NULL");
	Property accessToken = config.get(Configuration.CATEGORY_GENERAL, "aT", "NULL");
	Property accessTokenSecret = config.get(Configuration.CATEGORY_GENERAL, "aTS", "NULL");
//tool
	toolSyringeBasic_ID = config.getItem("syringe.basic", 5000).getInt();
	toolSyringeBasic_Blood_ID = config.getItem("syringe.basic.bloodMetadata", 5001).getInt();
	toolUVScannerBasic_ID = config.getItem("uvscanner.basic", 5002).getInt();
	toolBlockirusDeployerBasic_ID = config.getItem("blockirus_deploy.basic", 5003).getInt();	
	toolSyringeAdvanced_ID = config.getItem("syringe.advanced", 5004).getInt();
	toolUVScannerAdvanced_ID = config.getItem("uvscanner.advanced", 5005).getInt();
	toolBlockirusDeployerAdvanced_ID = config.getItem("blockirus_deploy.advanced", 5006).getInt();	
//item
	toolCylinder_ID = config.getItem("cylinder", 5007).getInt();
	toolTesttube_ID = config.getItem("testtube", 5008).getInt();
	toolDropper_ID = config.getItem("dropper", 5009).getInt();
	toolGlassStrip_ID = config.getItem("glass_strip", 5010).getInt();
	
	itemSyringePlunger_ID = config.getItem("syringe.plunger", 5011).getInt();
	itemSyringeNeedle_ID = config.getItem("syringe.needle", 5012).getInt();
	itemSyringeTube_ID = config.getItem("syringe.tube", 5013).getInt();
	
//block	
	blockBasicSyringeScanner_ID = config.getBlock("syringe_scanner.basic", 2000).getInt();
	blockAdvancedSyringeScanner_ID = config.getBlock("syringe_scanner.advanced", 2001).getInt();
	
	config.save();
	
	
	if(consumerKey.getString() != "NULL")
		configCore.consumerKey = consumerKey.getString();
    if(consumerSecret.getString() != "NULL")
    	configCore.consumerSecret = consumerSecret.getString();
    if(accessToken.getString() != "NULL")
		configCore.accessToken = accessToken.getString();
    if(accessTokenSecret.getString() != "NULL")
		configCore.accessTokenSecret = accessTokenSecret.getString();
	}
}