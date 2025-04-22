package strategy;

import object.Character;

public class MagicAttack implements AttackStrategy {
    @Override
    public void attack(Character attacker, Character victim) {
        System.out.println(attacker.getName() + "이(가) " + victim.getName() + "에게 마법 공격!");
    }
}