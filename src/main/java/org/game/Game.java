package org.game;

public class Game {
    public static void main(String[] args) {
        Character hero = CharacterFactory.createCharacter("Artemis", "Elf", 100, 100, 30);
        
        hero.getInventory().addItem(hero,ItemFactory.createItem("검", 10));
        hero.getInventory().addItem(hero,ItemFactory.createItem("방패", 10));
        hero.getInventory().addItem(hero,ItemFactory.createItem("포션", 50));
        hero.getInventory().printItemDetails(hero);
        hero.useItem("포션");
        hero.printInventory();
        Character goblin = CharacterFactory.createCharacter("goblin", "Monster", 100, 100, 10); 
        BattleSystem battle = new BattleSystem();
        hero.attack("오크", 40);
        System.out.println("최종 HP: " + hero.getHp());
        
        battle = new BattleSystem();
        battle.fight(hero, goblin);
        
        hero.getInventory().printItemDetails(hero);
    }
}

