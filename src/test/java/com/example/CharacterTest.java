package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.game.Character;
import org.game.CharacterFactory;
import org.game.ItemFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CharacterTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	Character elf = null;
	Character goblin  = null;
	
	// 기본적으로 사용자 세팅
	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		elf = CharacterFactory.createCharacter("Artemis", "Elf", 100, 100, 30);
		goblin= CharacterFactory.createCharacter("goblin", "Monster", 200, 100, 10);
		elf.getInventory().addItem(elf,ItemFactory.createItem("포션", 50));
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
	}
	
	// 아이템 사용에 대한 테스트
	@Test
	public void useItemTest() {
		assertTrue(elf.useItem("포션"));
		assertFalse(elf.useItem("포션"));
	}
	
	// 공격에 대한 테스트
	public void attackCharaterTest() {
		assertEquals(elf.attack(goblin),110);
	}
	
}
