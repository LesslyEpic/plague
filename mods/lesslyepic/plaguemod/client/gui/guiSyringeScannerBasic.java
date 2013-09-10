package mods.lesslyepic.plaguemod.client.gui;

import mods.lesslyepic.plaguemod.client.gui.container.containerSyringeScannerBasic;
import mods.lesslyepic.plaguemod.client.tileentity.tileEntitySyringeScannerBasic;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

public class guiSyringeScannerBasic extends GuiContainer{
	
	public static final ResourceLocation field_110421_t = new ResourceLocation("textures/gui/syringeScannerBasic.png");
	
	public guiSyringeScannerBasic(InventoryPlayer inventoryPlayer, tileEntitySyringeScannerBasic tileEntity) {
		super(new containerSyringeScannerBasic(inventoryPlayer, tileEntity));
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
		float color = 1.0F;
		GL11.glColor4f(color, color, color, color);
		
		this.mc.func_110434_K().func_110577_a(field_110421_t);
		
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		
		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int param1, int param2) {
		fontRenderer.drawString("Basic Syringe Scanner", 8, 6, 4210752);
		fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
	}
}