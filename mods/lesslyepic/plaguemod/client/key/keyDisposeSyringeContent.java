package mods.lesslyepic.plaguemod.client.key;

import java.util.EnumSet;
import java.util.Iterator;

import mods.lesslyepic.plaguemod.client.item.toolSyringeBasic;
import mods.lesslyepic.plaguemod.client.item.metadata.metadataBloodSyringe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;

public class keyDisposeSyringeContent extends KeyHandler
{
         private EnumSet tickTypes = EnumSet.of(TickType.CLIENT);
        
         public keyDisposeSyringeContent(KeyBinding[] keyBindings, boolean[] repeatings)
         {
                 super(keyBindings, repeatings);
         }
         @Override
         public String getLabel()
         {
                 return "Dispose syringe contents";
         }
         @Override
         public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat)
         {
        	 metadataBloodSyringe.keyPressed_DISPOSE = true;
        	 Minecraft.getMinecraft().thePlayer.playSound("random.bow", 0.15F, 1.0F);
                 //what to do when key is pressed/down
         }
         @Override
         public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd)
         {
        	 metadataBloodSyringe.keyPressed_DISPOSE = false;
                 //What to do when key is released/up
         }
         @Override
         public EnumSet<TickType> ticks()
         {
                 return tickTypes;
         }
}