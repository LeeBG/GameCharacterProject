package state;


public interface CharacterState {
    void performAction(Character character);
}

public class AttackState implements CharacterState {
    @Override
    public void performAction(Character character) {
        System.out.println(character.getName() + "이(가) 공격 중입니다!");
    }
}

public class DefendState implements CharacterState {
    @Override
    public void performAction(Character character) {
        System.out.println(character.getName() + "이(가) 방어 중입니다!");
    }
}

public class HealState implements CharacterState {
    @Override
    public void performAction(Character character) {
        System.out.println(character.getName() + "이(가) 회복 중입니다!");
    }
}
