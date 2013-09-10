package mods.lesslyepic.plaguemod.client.gui;

import org.lwjgl.opengl.*;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class guiUVScanner extends GuiScreen
{
	public guiUVScanner(){
		
	}
	public final int xSizeOfTexture = 176;
	public final int ySizeOfTexture = 88;
	
	public static final ResourceLocation texture = new ResourceLocation("textures/gui/deployer.png");
	@Override
	public void drawScreen(int x, int y, float f)
	{
	drawDefaultBackground();

	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	Minecraft.getMinecraft().func_110434_K().func_110577_a(texture);

	int posX = (this.width - xSizeOfTexture) / 2;
	int posY = (this.height - ySizeOfTexture) / 2;

	drawTexturedModalRect(posX, posY, 0, 0, xSizeOfTexture, ySizeOfTexture);

	super.drawScreen(x, y, f);
	}
	@Override
    public void initGui() {
            super.initGui();
    }
}	
