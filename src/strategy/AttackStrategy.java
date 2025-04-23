package strategy;

import object.Character;

//공격전략에 대한 확장 다양한 공격패턴으로 확장할 수 있다면
public interface AttackStrategy {
	// hp반환
	public int attack(Character character, Character target);
}
