package com.fernando.calculadora.main;

public class Calculadora {
	
	//Atributos
	private Double operandOne = 0.0;
	private Double operandTwo = 0.0;
	private Double mathTotal = 0.0;
	private String operation = "";
	
	//Constructores
	public Calculadora() {
	}
	public Calculadora(Double operandOne, String operation, Double operandTwo) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
	}
		
	//Get
	public Double getOperandOne() {
		return operandOne;
	}
	public Double getOperandTwo() {
		return operandTwo;
	}
	public Double getMathTotal() {
		return mathTotal;
	}
	public String getOperation() {
		return operation;
	}
	
	//Set
	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}
	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public void setMathTotal(Double mathTotal) {
		this.mathTotal = mathTotal;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	//Metodos
	public void performOperation() {
		if(getOperation().equals("+")) {
			Double total = getOperandOne() + getOperandTwo();
			setMathTotal(total);
		}
		else if(getOperation().equals("-")) {
			Double total = getOperandOne() - getOperandTwo();
			setMathTotal(total);
		}else if(getOperation().equals("*")) {
			Double total = getOperandOne() * getOperandTwo();
			setMathTotal(total);
		}else if(getOperation().equals("/")) {
			Double total = getOperandOne() / getOperandTwo();
			setMathTotal(total);
		}
	}
	public void getResults() {
		System.out.println(getMathTotal());
	}	
}