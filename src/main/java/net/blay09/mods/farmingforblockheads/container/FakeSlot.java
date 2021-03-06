package net.blay09.mods.farmingforblockheads.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class FakeSlot extends Slot {

	private ItemStack displayStack;

	public FakeSlot(int slotId, int x, int y) {
		super(null, slotId, x, y);
	}

	public void setDisplayStack(ItemStack itemStack) {
		this.displayStack = itemStack;
	}

	@Override
	public ItemStack getStack() {
		return displayStack;
	}

	@Override
	public boolean getHasStack() {
		return displayStack != null;
	}

	@Override
	public void putStack(@Nullable ItemStack stack) {
		// NOP
	}

	@Override
	@Nullable
	public ItemStack decrStackSize(int amount) {
		return null;
	}

	@Override
	public void onSlotChanged() {
		// NOP
	}

	@Override
	public int getSlotStackLimit() {
		return 64;
	}

	@Override
	public boolean isItemValid(@Nullable ItemStack itemStack) {
		return false;
	}

	@Override
	public boolean canTakeStack(EntityPlayer player) {
		return false;
	}
}