package com.fernando.zooproject.animals;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("Gorilla lanzó un barril!");
		displayEnergy();
	}
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("Gorilla comió una banana! ");
		displayEnergy();
	}
	public void climb() {
		energyLevel -= 10;
		System.out.println("Gorilla trepó a la cima del árbol!");
		displayEnergy();
	}
}