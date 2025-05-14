package org.game;


public class Character {
	public static final int INVENTORY_SIZE = 10; // max inventory
	public String name;
	public String race;
	public int hp;
	private int attack;
	private int defense;
	private AttackStrategy attackStrategy;
	private Item[] items = new Item[10];
	int itemCount = 0;

	// 게임 플레이 캐릭터(다형성)
	public Character(String name, String race, int hp, int attack, int defense) {
		this.name = name;
		this.race = race;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.attackStrategy = new NormalAttack(); // 기본 전략 설정
	}
	
	// 때리는 몬스터(다형성)
	public Character(String race, int hp, int attack) {
		this.name = "몬스터";
		this.race = race;
		this.hp = hp;
		this.attack = attack;
		this.attackStrategy = new NormalAttack(); // 기본 전략 설정
	}
	
	// 떄리지 못하는 몬스터(다형성)
	public Character(String race, int hp) {
		this.name = "몬스터";
		this.race = race;
		this.hp = hp;
		this.attackStrategy = new NormalAttack(); // 기본 전략 설정
	}
	
	public Character(String name, String race, int hp, int attack, int defense, MagicAttack magicAttack) {
		this.name = name;
		this.race = race;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.attackStrategy = magicAttack; // 기본 전략 설정
	}

	// 아이템 추가
	public boolean addItem(Item item) {
		if(itemCount < INVENTORY_SIZE) {
			items[itemCount] = item;
			itemCount++;
			return true;
		}else {
			System.out.println("인벤토리 가득 참");
			return false;
		}
	}
	
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
		for (int i = 0; i < itemCount; i++) {
			System.out.println("- " + items[i].getName() + " (공격력:" + items[i].getAtk() + ", 방어력:" + items[i].getDef() + ", 회복력:" +items[i].getHeal() + ")");
		}
	}

	public boolean useItem(String itemName) {
		for (int i = 0; i < itemCount; i++) {
			if (items[i].getName().equals(itemName)) {
				attack += items[i].getAtk() ;
				defense += items[i].getDef();
				hp += items[i].getHeal();
				System.out.println(items[i].getName() + " 아이템을 사용했습니다. 현재 능력치: HP=" + hp + ", 공격력=" + attack + ", 방어력=" + defense);
				removeItem(i);
				return true;
			}
		}
		return false;
	}

	private void removeItem(int index) {
		for (int i = index; i < itemCount - 1; i++) {
			items[i].setName(items[i+1].getName());
			items[i].setAtk(items[i+1].getAtk());
			items[i].setDef(items[i+1].getDef());
			items[i].setHeal(items[i+1].getHeal());
		}
		itemCount--;
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

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
	
}
