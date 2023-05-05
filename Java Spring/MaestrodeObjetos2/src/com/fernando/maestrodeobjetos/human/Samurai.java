package com.fernando.maestrodeobjetos.human;

public class Samurai extends Human {
	static int samuraiCount = 0;
	
	//Constructor
	public Samurai() {
		this.health = 200;
		samuraiCount +=1;
	}
	public Samurai(String name) {
		this.health = 200;
		this.name = name;
		samuraiCount +=1;
	}
	
	//Methods
	public void deathBlow(Human human) {
		human.setHealth(human.getHealth() - human.getHealth());
		this.setHealth(this.getHealth()/2);
		System.out.println("K-BOOM!");
	}
	public void meditate() {
		this.setHealth(this.getHealth() + this.getHealth()/2);
		System.out.println("(" + this.getName() + " meditó su espíritu, curando por " + this.getHealth() / 2 + " puntos!)");
	}
	public int howMany() {
		System.out.println(samuraiCount);
		return samuraiCount;
	}
}