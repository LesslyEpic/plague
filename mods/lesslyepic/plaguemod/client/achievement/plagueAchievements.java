package mods.lesslyepic.plaguemod.client.achievement;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class plagueAchievements
{
	static void addAchievementLocalizations(){}
	
	private static void addAchievementName(String ach, String name)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
	}
	private static void addAchievementDesc(String ach, String desc)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
	}
public static void loadAchievements(){
	addAchievementLocalizations();
	{
		addAchievementName("achFirstBlood", "First Blood.");
		addAchievementDesc("achFirstBlood", "Gathered blood from host.");
	}
}
public static void loadAchievementPages(){
	
	}
}
