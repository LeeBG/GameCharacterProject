package org.game;

public class CharacterFactory {
    public static Character createCharacter(String name, RACES race, int hp, int attack, int defense) {
        switch (race) {
            case ELF:
                return new Elf(name, race, hp, attack, defense, new MagicAttack());
            case ORC:
                return new Orc(name, race, hp, attack, defense);
            case MONSTER:
            	return new Monster(name, race, hp, attack, defense);
            default:
                return new Unit(name, race, hp); // 기본 몬스터 유닛
        }
    }
}
