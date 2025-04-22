package objectfactory;

import object.Character;

public class CharacterFactory {
    public static Character createCharacter(String race, String name, int hp, int attack, int defense) {
        if ("Elf".equals(race)) {
            return new Character(name, race, hp, attack, defense);
        } else if ("Orc".equals(race)) {
            return new Character(name, race, hp, attack, defense);
        }
        return new Character(name, "Unknown", hp, attack, defense); // 기본 캐릭터
    }
}
