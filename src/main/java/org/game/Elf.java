package org.game;

public class Elf extends Character {
	// 게임 플레이 캐릭터(다형성)
	public Elf(String name, RACES race, int hp, int attack, int defense) {
		this.name = name;
		this.race = race;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.attackStrategy = new NormalAttack(); // 기본 전략 설정
	}
	
	public Elf(String name, RACES race, int hp, int attack, int defense, MagicAttack magicAttack) {
		this.name = name;
		this.race = race;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.attackStrategy = magicAttack; // 기본 전략 설정
	}
}
