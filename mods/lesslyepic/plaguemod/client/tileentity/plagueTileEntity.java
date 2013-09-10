package mods.lesslyepic.plaguemod.client.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;

public class plagueTileEntity {

public static void loadTileEntity(){
		GameRegistry.registerTileEntity(tileEntitySyringeScannerBasic.class, "BasicSyringeScanner TileEntity");
	}
}
