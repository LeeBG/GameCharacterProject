package object;
import lombok.Getter;
import lombok.Setter;
import strategy.AttackStrategy;
import strategy.NormalAttack;

@Getter
@Setter
public class Character {
	public String name;
	public String race;
	public int hp;
	private int attack;
	private int defense;
	private AttackStrategy attackStrategy;
	
	String[] itemNames = new String[10];
	int[] itemAttack = new int[10];
	int[] itemDefense = new int[10];
	int[] itemHeal = new int[10];
	int itemCount = 0;

	public Character(String name, String race, int hp, int attack, int defense) {
		this.name = name;
		this.race = race;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.attackStrategy = new NormalAttack(); // 기본 전략 설정
	}

	public void addItem(String name, int atk, int def, int heal) {
		itemNames[itemCount] = name;
		itemAttack[itemCount] = atk;
		itemDefense[itemCount] = def;
		itemHeal[itemCount] = heal;
		itemCount++;
	}

	public void printInventory() {
		System.out.println(name + "의 인벤토리:");
		for (int i = 0; i < itemCount; i++) {
			System.out.println("- " + itemNames[i] + " (공격력:" + itemAttack[i] + ", 방어력:" + itemDefense[i] + ", 회복력:" + itemHeal[i] + ")");
		}
	}

	public void useItem(String itemName) {
		for (int i = 0; i < itemCount; i++) {
			if (itemNames[i].equals(itemName)) {
				attack += itemAttack[i];
				defense += itemDefense[i];
				hp += itemHeal[i];
				System.out.println(itemNames[i] + " 아이템을 사용했습니다. 현재 능력치: HP=" + hp + ", 공격력=" + attack + ", 방어력=" + defense);
				removeItem(i);
				break;
			}
		}
	}

	private void removeItem(int index) {
		for (int i = index; i < itemCount - 1; i++) {
			itemNames[i] = itemNames[i + 1];
			itemAttack[i] = itemAttack[i + 1];
			itemDefense[i] = itemDefense[i + 1];
			itemHeal[i] = itemHeal[i + 1];
		}
		itemCount--;
	}

	public void attack(Character target) {
		attackStrategy.attack(this, target);
	}

}
