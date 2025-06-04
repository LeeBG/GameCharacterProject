package org.game;

public class Orc extends Character {
	// 때리는 몬스터(다형성)
	public Orc(String race, int hp, int attack) {
		this.name = "몬스터";
		this.race = race;
		this.hp = hp;
		this.attack = attack;
		this.attackStrategy = new NormalAttack(); // 기본 전략 설정
	}

	// 게임 플레이 캐릭터(다형성)
	public Orc(String name, String race, int hp, int attack, int defense) {
		this.name = name;
		this.race = race;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.attackStrategy = new NormalAttack(); // 기본 전략 설정
	}
}
