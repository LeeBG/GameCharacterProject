package org.game;

public class Unit extends Character{
	public Unit(String race, int hp) {
		this.name = "몬스터";
		this.race = race;
		this.hp = hp;
		this.attackStrategy = new NormalAttack(); // 기본 전략 설정
	}
}
