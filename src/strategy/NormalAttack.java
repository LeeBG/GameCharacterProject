package strategy;
import object.Character;

public class NormalAttack implements AttackStrategy {
	@Override
	public int attack(Character attaker, Character target) {
		String attackerName = attaker.getName();
		String targetName = target.getName();
		int targetRemainHp = attaker.getAttack() > target.getDefense() ? target.getHp() - attaker.getAttack() + target.getDefense() : target.getHp();
		
		System.out.println(attackerName + "이(가) " + targetName + "에게 일반 공격!");
		System.out.println(attackerName+ "이(가) " + targetName + "을(를) " + attaker.getAttack() + "의 데미지로 공격했습니다.");
		if (targetRemainHp <= 0) {
			System.out.println(targetName + "의 남은 HP: " + targetRemainHp);
			System.out.println(targetName + " 처치 완료!");
			return 0;
		} else {
			System.out.println(targetName + "의 남은 HP: " + targetRemainHp);
			return targetRemainHp;
		}
	}
}
