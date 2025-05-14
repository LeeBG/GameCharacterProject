package org.game;

public class NormalAttack extends AttackStrategy {
    @Override
    protected int calculateDamage(Character attacker, Character target) {
        int rawDamage = attacker.getAttack() - target.getDefense();
        return Math.max(0, rawDamage); // 방어력이 더 크면 데미지 0
    }

    @Override
    protected void printAttackStart(Character attacker, Character target) {
        System.out.println(attacker.getName() + "이(가) " + target.getName() + "에게 일반 공격!");
    }
}
