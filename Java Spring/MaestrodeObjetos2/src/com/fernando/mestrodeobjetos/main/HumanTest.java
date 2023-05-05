package com.fernando.mestrodeobjetos.main;

import com.fernando.maestrodeobjetos.human.Human;
import com.fernando.maestrodeobjetos.human.Ninja;
import com.fernando.maestrodeobjetos.human.Samurai;
import com.fernando.maestrodeobjetos.human.Wizard;

public class HumanTest {

	public static void main(String[] args) {
		Human testHuman1 = new Human("Diego");
		Human testHuman2 = new Human("Ismael");
		Human testHuman3 = new Human("Tiago");
		Wizard testWizard1 = new Wizard("Merlin");
		Wizard testWizard2 = new Wizard("Harry");
		Wizard testWizard3 = new Wizard("Asghard");
		Ninja testNinja1 = new Ninja("Saimon");
		Ninja testNinja2 = new Ninja("Samuel");
		Ninja testNinja3 = new Ninja("Matias");
		Samurai testSamurai1 = new Samurai("Patricio");
		Samurai testSamurai2 = new Samurai("Cristian");
		Samurai testSamurai3 = new Samurai("Josue");		
		
		testHuman1.attack(testSamurai3);
		testWizard1.fireball(testNinja2);
		testNinja2.steal(testHuman2);
		testSamurai1.attack(testHuman3);
		testWizard2.heal(testNinja2);
		testWizard3.fireball(testNinja3);
		testSamurai3.deathBlow(testNinja1);
		testSamurai2.meditate();
		testNinja1.runAway();
		testSamurai3.howMany();		
	}
}