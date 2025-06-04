package org.game;

public class CharacterFactory {
	public static Character createCharacter(String name, String race, int hp, int attack, int defense) {
        if ("Elf".equals(race)) {
            return new Elf(name, race, hp, attack, defense, new MagicAttack());
        } else if ("Orc".equals(race)) {
            return new Orc(name, race, hp, attack, defense);
        } else {
        	return new Unit(name, hp); // 기본 몬스터
        }
    }
}
