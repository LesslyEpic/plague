package mods.lesslyepic.plaguemod.client.tab;

import mods.lesslyepic.plaguemod.client.item.plagueItems;
import mods.lesslyepic.plaguemod.common.plaguemod;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.*;

public class tabPlagueItems extends CreativeTabs {
	
public tabPlagueItems(int position, String tabID) {
super(position, tabID);
}
@SideOnly(Side.CLIENT)
public int getTabIconItemIndex()
//Item Show Case
{
return plagueItems.toolSyringeBasic.itemID;
}

public String getTranslatedTabLabel()
{
//Creative Tab In-Game Name	
return "Plague Items";
}
}
