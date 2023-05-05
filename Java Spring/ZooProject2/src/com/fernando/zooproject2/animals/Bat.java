package com.fernando.zooproject2.animals;

public class Bat extends Mammal {
	
	public Bat() {
	this.energyLevel = 300;
	}
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("*inserte sonido de despegue*");
		displayEnergy();
	}
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("bueno, no importa");
		displayEnergy();
	}
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("*inserte sonido en llamas*");
		displayEnergy();
	}
}