package com.fernando.maestrodeobjetos.human;

public class Human {
	
	//Atributos
	private String name = "";
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	
	//Constructores
    public Human(){
    }

    public Human(String name){
        this.name = name;
    }
	
	//Get y Set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	//Metodos
	public void attack(Human human) {
		human.setHealth(human.getHealth()-strength);
		System.out.println(this.getName() + " atacado " + human.getName() + " por " + this.getStrength() + " daño!");
	}
	
}