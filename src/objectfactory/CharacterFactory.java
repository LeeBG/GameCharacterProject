package objectfactory;

import object.Character;
import strategy.MagicAttack;

public class CharacterFactory {

	public static Character createCharacter(String name, String race, int hp, int attack, int defense) {
        if ("Elf".equals(race)) {
            return new Character(name, race, hp, attack, defense, new MagicAttack());
        } else if ("Orc".equals(race)) {
            return new Character(name, race, hp, attack, defense);
        } else {
        	return new Character(name, hp); // 기본 몬스터
        }
    }
}
