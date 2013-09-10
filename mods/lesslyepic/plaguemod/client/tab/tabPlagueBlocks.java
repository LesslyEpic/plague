package mods.lesslyepic.plaguemod.client.tab;

import mods.lesslyepic.plaguemod.client.block.plagueBlocks;
import mods.lesslyepic.plaguemod.common.plaguemod;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.*;

public class tabPlagueBlocks extends CreativeTabs {
	
public tabPlagueBlocks(int position, String tabID) {
super(position, tabID);
}
@SideOnly(Side.CLIENT)
public int getTabIconItemIndex()
//Item Show Case
{
return plagueBlocks.blockSyringeScannerBasic.blockID;
}

public String getTranslatedTabLabel()
{
//Creative Tab In-Game Name	
return "Plague Blocks";
}
}
