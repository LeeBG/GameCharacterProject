package org.game;

public class Game {
    public static void main(String[] args) {
        Character hero = CharacterFactory.createCharacter("Artemis", RACES.ELF, 100, 100, 30);
        
        hero.getInventory().addItem(hero,ItemFactory.createItem(ITEMS.SWORD, 10));
        hero.getInventory().addItem(hero,ItemFactory.createItem(ITEMS.SHIELD, 10));
        hero.getInventory().addItem(hero,ItemFactory.createItem(ITEMS.POTION, 50));
        hero.getInventory().printItemDetails(hero);
        hero.useItem("포션");
        hero.printInventory();
        Character goblin = CharacterFactory.createCharacter("goblin", RACES.MONSTER, 100, 100, 10); 
        BattleSystem battle = new BattleSystem();
        hero.attack("오크", 40);
        System.out.println("최종 HP: " + hero.getHp());
        
        battle = new BattleSystem();
        battle.fight(hero, goblin);
        
        hero.getInventory().printItemDetails(hero);
    }
}

