package org.game;

public class InventoryManager {
	public void printItemDetails(Character c) {
		System.out.println("[아이템 상세 정보 출력 시작]");
		c.printInventory();
		System.out.println("[아이템 상세 정보 출력 끝]");
	}
}
