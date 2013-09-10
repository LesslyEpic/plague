package mods.lesslyepic.plaguemod.client.command.version;

import mods.lesslyepic.plaguemod.common.plaguemod;
import mods.lesslyepic.plaguemod.common.stringColor;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class commandVersionData extends CommandBase{

	@Override
	public String getCommandName() {
		return "plague-info";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "/plague-info";
	}

	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring) {
		Utilities.SendChat(icommandsender, stringColor.dark_red + "P L A G U E " + stringColor.dark_green + plaguemod.version);
		Utilities.devConfirmation();
		Utilities.SendChat(icommandsender, "MODE: " + stringColor.light_cyan + Utilities.MODE);
	}

}
