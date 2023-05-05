
//package com.margottig.zooproject.main;

//import com.margottig.zooproject.animals.Gorilla;

// import com.margottig.zooproject.animals.Mammal;

public class GorillaTest {

    public static void main(String[] args) {

		
//		Mammal mamifero = new Mammal();
//		mamifero.displayEnergy();
		
//		Gorilla 1
		Gorilla gorilla1 = new Gorilla();
		System.out.println(" Gorilla1");
		gorilla1.throwSomething();
//		gorilla1.displayEnergy();
		gorilla1.eatBananas();
//		gorilla1.displayEnergy();
		System.out.println("\n");
		
//		Gorilla2
		Gorilla dK = new Gorilla(200);
		System.out.println(" DK");
		dK.throwSomething();
//		dK.displayEnergy();
		dK.eatBananas();
//		dK.displayEnergy();		
		
		
//		Gorilla3
		Gorilla gorilla3 = new Gorilla(100);
		System.out.println(" Gorilla3");
		dK.throwSomething();
//		dK.displayEnergy();
		dK.eatBananas();
//		dK.displayEnergy();	
		System.out.println(dK.getEnergyLevel() + "PUEDO CONSUMIR METODOS MAESTROS");

    }
}