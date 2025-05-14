package org.game;

public class MagicAttack extends AttackStrategy {
	@Override
    protected int calculateDamage(Character attacker, Character target) {
        return attacker.getAttack(); // 방어력 무시
    }

    @Override
    protected void printAttackStart(Character attacker, Character target) {
        System.out.println(attacker.getName() + "이(가) " + target.getName() + "에게 마법 공격!");
    }
}