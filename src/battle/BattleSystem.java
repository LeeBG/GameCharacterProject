package battle;
import object.Character;


public class BattleSystem {
    public void fight(Character character1, Character character2) {
        System.out.println("전투 시작! " + character1.getName() + " VS " + character2.getName());
        // 적 남은 체력
        int enemyRemainHp = character2.getHp();
        do {
        	if(character1.getHp() <= 0 && enemyRemainHp <= 0 && character1.getAttack() <= 0)
        		break;
        	enemyRemainHp = character1.getAttackStrategy().attack(character1, character2);
        	character2.setHp(enemyRemainHp);
        }while (enemyRemainHp > 0 && character1.hp > 0);
    }
}
