package org.game;

public class ItemFactory {
	public static Item createItem(String name, int value) {
        if ("검".equals(name)) {
            return new Item(name, value, 0, 0);
        } else if ("방패".equals(name)) {
            return new Item(name, 0, value, 0);
        } else if ("포션".equals(name)){
        	return new Item(name, 0, 0, value); // 기본 몬스터
        }
        return new Item("기타 아이템",0,0,0);
    }
}
