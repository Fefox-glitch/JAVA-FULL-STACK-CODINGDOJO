package com.fernando.maestrodeobjetos.main;

import com.fernando.maestrodeobjetos.human.Human;

public class HumanTest {

	public static void main(String[] args) {
			Human ninja1 = new Human("Curry");
			Human samurai1 = new Human("Shaq");
			Human wizard1 = new Human("Jordan");
			
			wizard1.attack(ninja1);
			samurai1.attack(ninja1);
			ninja1.attack(samurai1);
	}
}