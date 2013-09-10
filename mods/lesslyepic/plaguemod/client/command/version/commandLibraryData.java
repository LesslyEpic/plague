package mods.lesslyepic.plaguemod.client.command.version;

import mods.lesslyepic.plaguemod.common.stringColor;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class commandLibraryData extends CommandBase{

	@Override
	public String getCommandName() {
		return "/plague-help";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "/plague-help";
	}

	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring) {
		Utilities.SendChat(icommandsender, stringColor.dark_green + "/plague-info" + stringColor.light_white + " - " + stringColor.light_cyan + "to view information about " + stringColor.dark_red + "Plague");
	}

}
