package com.fernando.calculadora.test;

import com.fernando.calculadora.main.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		Calculadora testCalc1 = new Calculadora(10.5,"+",5.2);
		Calculadora testCalc2 = new Calculadora(10.5,"-",5.2);
		Calculadora testCalc3 = new Calculadora(5.2,"*",10.0);
		Calculadora testCalc4 = new Calculadora(10.0,"/",5.2);
		testCalc1.performOperation();
		testCalc2.performOperation();
		testCalc3.performOperation();
		testCalc4.performOperation();
		testCalc1.getResults();
		testCalc2.getResults();
		testCalc3.getResults();
		testCalc4.getResults();
	}
}