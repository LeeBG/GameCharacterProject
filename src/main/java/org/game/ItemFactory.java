package org.game;

public class ItemFactory {
	public static Item createItem(ITEMS item, int value) {
		switch (item) {
        case SWORD:
            return new Item("검", value, 0, 0);
        case SHIELD:
            return new Item("방패", 0, value, 0);
        case POTION:
            return new Item("포션", 0, 0, value);
        default:
            return new Item("기타 아이템", 0, 0, 0);
		}
    }
}
