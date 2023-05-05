package com.fernando.maestrodeobjetos.human;

public class Ninja extends Human {

	//Constructor
	public Ninja() {
		this.stealth = 10;
	}
	public Ninja(String name) {
		this.stealth = 10;
		this.name = name;
	}
	
	//Methods
	public void steal(Human human) {
		human.setHealth(human.getHealth()-stealth);
		this.setHealth(this.getHealth()+stealth);
		System.out.println("Pfft!");
		System.out.println("(" + human.getName() + " fue sorprendido y tomó " + stealth + " puntos de daño!)");
	}
	public void runAway() {
		this.setHealth(-10);
	}
}