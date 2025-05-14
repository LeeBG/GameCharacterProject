package org.game;

public class Game {
    public static void main(String[] args) {
        Character hero = CharacterFactory.createCharacter("Artemis", "Elf", 100, 100, 30);
        InventoryManager manager = new InventoryManager();
        
        hero.addItem(ItemFactory.createItem("검", 10));
        hero.addItem(ItemFactory.createItem("방패", 10));
        hero.addItem(ItemFactory.createItem("포션", 50));
        manager.printItemDetails(hero);
        hero.useItem("포션");
        hero.printInventory();
        Character goblin = CharacterFactory.createCharacter("goblin", "Monster", 100, 100, 10); 
        BattleSystem battle = new BattleSystem();
        hero.attack("오크", 40);
        System.out.println("최종 HP: " + hero.getHp());
        
        battle = new BattleSystem();
        battle.fight(hero, goblin);
        
        
        manager.printItemDetails(hero);
// 상태 패턴 테스트
//        CharacterWithState orcWithState = new CharacterWithState("Goroth", "Orc", 120, 60, 40);
//        orcWithState.performAction();  // 공격 상태에서 행동
//        orcWithState.setState(new DefendState());  // 방어 상태로 변경
//        orcWithState.performAction();  // 방어 상태에서 행동
    }
}

