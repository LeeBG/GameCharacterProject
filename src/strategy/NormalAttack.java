package strategy;
import object.Character;

public class NormalAttack implements AttackStrategy {
	@Override
	public void attack(Character attaker, Character victim) {
		System.out.println(attaker.getName() + "이(가) " + victim.getName() + "에게 일반 공격!");
	}
}
