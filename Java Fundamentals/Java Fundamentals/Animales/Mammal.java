// package com.margottig.zooproject.animals;

public class Mammal {
	private int energyLevel = 0;

//	CONSTRUCTORS
	public Mammal() {
	}

	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	

//	METODOS
	public int displayEnergy() {
		System.out.println(" Su nivel de energia es maestra " + energyLevel);
		return energyLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	
	
}
