package mods.lesslyepic.plaguemod.client.gui.container;

import mods.lesslyepic.plaguemod.client.tileentity.tileEntitySyringeScannerBasic;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class containerSyringeScannerBasic extends Container {

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return tileEntity.isUseableByPlayer(entityplayer);
	}
	
	protected tileEntitySyringeScannerBasic tileEntity;
//"chest"	
	public containerSyringeScannerBasic(InventoryPlayer inventoryPlayer, tileEntitySyringeScannerBasic TE) {
		tileEntity = TE;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				addSlotToContainer(new Slot(tileEntity, j + i * 3, 62 + j * 18, 17 + i * 18));
			}
		}
		bindPlayerInventory(inventoryPlayer);
	}
//inventory
	private void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		for (int i = 0; i < 9; i++) {
			addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
		}		
	}
//event on Stack	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
		ItemStack stack = null;
		Slot slotObject = (Slot)inventorySlots.get(slot);
		
		if (slotObject != null && slotObject.getHasStack()) {
			ItemStack stackInSlot = slotObject.getStack();
			stack = stackInSlot.copy();
			
			if (slot < 9) {
				if (!this.mergeItemStack(stackInSlot, 0, 35, true)) {
					return null;
				}
			}
			else if (!this.mergeItemStack(stackInSlot, 0, 9, false)) {
				return null;
			}
			if (stackInSlot.stackSize == 0) {
				slotObject.putStack(null);
			} else {
				slotObject.onSlotChanged();
			}
			if (stackInSlot.stackSize == stack.stackSize) {
				return null;
			}
			slotObject.onPickupFromSlot(player, stackInSlot);
		}
		return stack;
	}
}
