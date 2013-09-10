package mods.lesslyepic.plaguemod.client.command.version;

import mods.lesslyepic.plaguemod.common.stringColor;
import net.minecraft.client.Minecraft;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

public class Utilities {
	public static String MODE;
	public static String username1 = "LesslyEpic";
	public static void SendChat(ICommandSender player, String message)
	{
		((EntityPlayer)player).addChatMessage(message);
	}
	public static void devConfirmation()
	{
	if (username1 == "LesslyEpic")
		{
			Minecraft.getMinecraft().thePlayer.username.equals(username1);
			MODE = stringColor.light_yellow + "DEVELOPER";
		}
	else
		{
			MODE = stringColor.light_cyan + "USER";
		}
	}
}