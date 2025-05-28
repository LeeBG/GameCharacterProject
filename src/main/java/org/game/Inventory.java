package org.game;

public class Inventory {
	public static final int INVENTORY_SIZE = 10; // max inventory
	
	private Item[] items = new Item[10];
	int itemCount = 0;
	
	public void printItemDetails(Character c) {
		System.out.println("[아이템 상세 정보 출력 시작]");
		c.printInventory();
		System.out.println("[아이템 상세 정보 출력 끝]");
	}
	
	// 아이템 추가
	public boolean addItem(Character c, Item item) {
		if(itemCount < INVENTORY_SIZE) {
			items[itemCount] = item;
			itemCount++;
			return true;
		}else {
			System.out.println("인벤토리 가득 참");
			return false;
		}
	}
	
	public void removeItem(Character c, int index) {
		for (int i = index; i < itemCount - 1; i++) {
			items[i].setName(items[i+1].getName());
			items[i].setAtk(items[i+1].getAtk());
			items[i].setDef(items[i+1].getDef());
			items[i].setHeal(items[i+1].getHeal());
		}
		itemCount--;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	
}
