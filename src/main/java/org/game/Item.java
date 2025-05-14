package org.game;

public class Item {
	private String name;
	private int atk;
	private int def;
	private int heal;
	
	
	public Item() {
		super();
	}
	
	public Item(String name, int atk, int def, int heal) {
		super();
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.heal = heal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getHeal() {
		return heal;
	}
	public void setHeal(int heal) {
		this.heal = heal;
	}

}
