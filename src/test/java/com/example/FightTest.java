package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.game.BattleSystem;
import org.game.Character;
import org.game.CharacterFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FightTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	Character hero = null;
	Character goblin  = null;
	BattleSystem battle = null;
	// 기본적으로 battle 사용할 사용자 세팅
	@BeforeEach
	public void setUpStreams() {
		battle = new BattleSystem();
		hero = CharacterFactory.createCharacter("Artemis", "Elf", 100, 100, 30);
		goblin= CharacterFactory.createCharacter("goblin", "Monster", 100, 100, 10); 
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
	}

	
	// 배틀시스템에서의 
	@Test
	public void testBattleSystemFight() {
		battle.fight(hero, goblin); 
		String expectedOutput = "전투 시작! Artemis VS 몬스터\r\n"
				+ "Artemis이(가) 몬스터에게 마법 공격!\r\n"
				+ "Artemis이(가) 몬스터을(를) 100의 데미지로 공격했습니다.\r\n"
				+ "몬스터의 남은 HP: 0\r\n"
				+ "몬스터 처치 완료!";
		assertEquals(expectedOutput, outContent.toString());
	}
	
	
}
