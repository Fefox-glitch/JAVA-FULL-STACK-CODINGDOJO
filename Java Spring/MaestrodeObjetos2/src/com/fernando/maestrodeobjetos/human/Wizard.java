package com.fernando.maestrodeobjetos.human;

public class Wizard extends Human {
	
	//Constructor
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	public Wizard(String name) {
		this.health = 50;
		this.intelligence = 8;
		this.name = name;
	}

	//Methods
	public void heal(Human human) {
		human.setHealth(human.getHealth()+intelligence);
		System.out.println("Siente la bendición sobre ti!");
		System.out.println("(" + human.getName() + " su salud aumentó en " + this.intelligence + ".)");
	}
	public void fireball(Human human) {
		human.setHealth(human.getHealth()-(intelligence*3));
		System.out.println("Quema con la furia del sol!!!");
		System.out.println("(" + human.getName() + " ha tomado " + intelligence*3 + " puntos de daño!)");
	}
}