package org.game;


public class Character {
	
	protected String name;
	protected RACES race;
	protected int hp;
	protected int attack;
	protected int defense;
	protected AttackStrategy attackStrategy;
	protected Inventory inventory;

	public void attack(String enemyName, int enemyHp) {
		System.out.println(name + "이(가) " + enemyName + "을(를) " + attack + "의 데미지로 공격했습니다.");
		if (enemyHp - attack <= 0) {
			System.out.println(enemyName + " 처치 완료!");
		} else {
			System.out.println(enemyName + "의 남은 HP: " + (enemyHp - attack));
		}
	}
	
	// InventoryManager
	public void printInventory() {
		System.out.println(name + "의 인벤토리:");
		for (int i = 0; i < inventory.getItemCount(); i++) {
			System.out.println("- " + inventory.getItems()[i].getName() + " (공격력:" + inventory.getItems()[i].getAtk() + ", 방어력:" + inventory.getItems()[i].getDef() + ", 회복력:" +inventory.getItems()[i].getHeal() + ")");
		}
	}

	public boolean useItem(String itemName) {
		for (int i = 0; i < inventory.getItemCount(); i++) {
			if (inventory.getItems()[i].getName().equals(itemName)) {
				attack += inventory.getItems()[i].getAtk() ;
				defense += inventory.getItems()[i].getDef();
				hp += inventory.getItems()[i].getHeal();
				System.out.println(inventory.getItems()[i].getName() + " 아이템을 사용했습니다. 현재 능력치: HP=" + hp + ", 공격력=" + attack + ", 방어력=" + defense);
				inventory.removeItem(this,i);
				return true;
			}
		}
		return false;
	}

	public int attack(Character target) {
		return attackStrategy.attack(this, target);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public AttackStrategy getAttackStrategy() {
		return attackStrategy;
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RACES getRace() {
		return race;
	}

	public void setRace(RACES race) {
		this.race = race;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
}
