package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.game.CharacterFactory;
import org.game.Item;
import org.game.ItemFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.game.Character;

public class ItemTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	Character hero = null;

	// 기본적으로 아이템을 사용할 사용자 세팅
	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		hero = CharacterFactory.createCharacter("Artemis", "Elf", 100, 50, 30);
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
	}

	@Test
	public void testAddItem() {
		for (int i = 0; i < Character.INVENTORY_SIZE; i++) {
			assertTrue(hero.addItem(ItemFactory.createItem("검", 10)));
		}
	}

	@Test
	void testAddItemInventoryFull() {
		for (int i = 0; i < Character.INVENTORY_SIZE; i++) {
			assertTrue(hero.addItem(new Item("검", 10, 0, 0)));
		}
		assertFalse(hero.addItem(new Item("검", 10, 0, 0)));
	}

	@Test
	public void testUseItem() {
		hero.addItem(ItemFactory.createItem("검", 10));
		hero.addItem(ItemFactory.createItem("방패", 10));
		hero.addItem(ItemFactory.createItem("포션", 50));

		assertTrue(hero.useItem("검"));
		assertFalse(hero.useItem("방패"));
		assertEquals(hero.getItemCount(), 1);
	}

	@Test
	public void testAttack() {
		hero.attack("고블린", 100);

		String expectedOutput = "Artemis이(가) 고블린을(를) 50의 데미지로 공격했습니다.\r\n" + "고블린 처치 완료!\r\n";

		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	public void testGetItemCount() {
		hero.addItem(ItemFactory.createItem("검", 10));
		hero.addItem(ItemFactory.createItem("방패", 10));
		hero.addItem(ItemFactory.createItem("포션", 50));
		hero.addItem(ItemFactory.createItem("포션", 50));

		int count = hero.getItemCount();
		assertEquals(4, count);
	}

}
