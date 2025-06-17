package org.game;

public class Unit extends Character{
	public Unit(String name, RACES race, int hp) {
		this.name = name;
		this.race = race;
		this.hp = hp;
		this.attackStrategy = new NormalAttack(); // 기본 전략 설정
	}
}
