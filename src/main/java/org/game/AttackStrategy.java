package org.game;

//공격전략에 대한 확장 다양한 공격패턴으로 확장할 수 있다면
public abstract class AttackStrategy {
	// hp반환
	public int attack(Character attacker, Character target) {
        int damage = calculateDamage(attacker, target);
        int remainHp = Math.max(0, target.getHp() - damage);

        printAttackStart(attacker, target);
        System.out.println(attacker.getName() + "이(가) " + target.getName() + "을(를) " + damage + "의 데미지로 공격했습니다.");

        if (remainHp <= 0) {
            System.out.println(target.getName() + "의 남은 HP: 0");
            System.out.println(target.getName() + " 처치 완료!");
        } else {
            System.out.println(target.getName() + "의 남은 HP: " + remainHp);
        }

        return remainHp;
    }
	
	protected abstract int calculateDamage(Character attacker, Character target);

    protected abstract void printAttackStart(Character attacker, Character target);
}
