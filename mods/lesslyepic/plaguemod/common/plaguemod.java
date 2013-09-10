package mods.lesslyepic.plaguemod.common;

import mods.lesslyepic.plaguemod.client.achievement.plagueAchievements;
import mods.lesslyepic.plaguemod.client.block.blockSyringeScannerBasic;
import mods.lesslyepic.plaguemod.client.block.plagueBlocks;
import mods.lesslyepic.plaguemod.client.command.tweet.commandTweet;
import mods.lesslyepic.plaguemod.client.command.version.commandLibraryData;
import mods.lesslyepic.plaguemod.client.command.version.commandVersionData;
import mods.lesslyepic.plaguemod.client.entity.plagueEntities;
import mods.lesslyepic.plaguemod.client.item.plagueItems;
import mods.lesslyepic.plaguemod.client.key.keyDisposeSyringeContent;
import mods.lesslyepic.plaguemod.client.recipe.plagueRecipes;
import mods.lesslyepic.plaguemod.client.tab.tabPlagueBlocks;
import mods.lesslyepic.plaguemod.client.tab.tabPlagueItems;
import mods.lesslyepic.plaguemod.common.core.commonProxy;
import mods.lesslyepic.plaguemod.common.packetHandler.clientPacketHandler;
import mods.lesslyepic.plaguemod.common.packetHandler.serverPacketHandler;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.server.MinecraftServer;
import org.lwjgl.input.Keyboard;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;

@NetworkMod(clientSideRequired = true,serverSideRequired = false,
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"plagueClient"}, packetHandler = clientPacketHandler.class),
serverPacketHandlerSpec = @SidedPacketHandler(channels = {"plagueServer"}, packetHandler = serverPacketHandler.class))
@Mod(modid = "plague_MOD", version = "Alpha 0.1.0", name = "P l a g u e")

public class plaguemod
{  
		boolean[] repeat = {false};
		KeyBinding[] key = {new KeyBinding("Dispose syringe contents", Keyboard.KEY_G)};
		
		public static String version = "Alpha 0.1.0";
	
		public static ItemFood foodImpure;
		
		public static CreativeTabs tabPlagueBlocks = new tabPlagueBlocks(CreativeTabs.getNextID(),"plagueClient");
		public static CreativeTabs tabPlagueItems = new tabPlagueItems(CreativeTabs.getNextID(), "plagueClient");
		
public static blockSyringeScannerBasic instance;

@SidedProxy(clientSide = "mods.lesslyepic.plaguemod.client.core.clientProxy", serverSide = "mods.lesslyepic.plaguemod.common.core.commonProxy")
public static commonProxy proxy;

@EventHandler()
public void preInit(FMLPreInitializationEvent event)
{	
	plagueItems.preInit(event);
	plagueBlocks.preInit(event);
}

@EventHandler
public void load(FMLInitializationEvent event)
{	
	plagueRecipes.loadItems();
	plagueRecipes.loadBlocks();
	plagueAchievements.loadAchievements();
	plagueAchievements.loadAchievementPages();
	
    KeyBindingRegistry.registerKeyBinding(new keyDisposeSyringeContent(key, repeat));
	
	plagueEntities.loadEntities();
}

@EventHandler
public void postInit(FMLPostInitializationEvent event)
{
	
}
@EventHandler
public void serverStart(FMLServerStartingEvent event)
{
	ICommandManager  manager = MinecraftServer.getServer().getCommandManager();
	ServerCommandManager serverManager = ((ServerCommandManager)manager);
	
	serverManager.registerCommand(new commandTweet(configCore.consumerKey, configCore.consumerSecret, configCore.accessToken, configCore.accessTokenSecret));
	serverManager.registerCommand(new commandVersionData());
	serverManager.registerCommand(new commandLibraryData());
}
}