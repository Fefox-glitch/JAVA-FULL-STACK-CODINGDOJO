package com.fernando.zooproject.animals;

public class Mammal {
	int energyLevel = 100;

	public int displayEnergy() {
		System.out.println("Su nivel de energía es: " + this.energyLevel);
		return energyLevel;
	}
}