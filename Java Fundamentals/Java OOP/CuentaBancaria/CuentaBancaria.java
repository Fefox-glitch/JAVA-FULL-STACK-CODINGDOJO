package CuentaBancaria;

import java.util.Random;

public class CuentaBancaria {
    
    //Atributos
    private String ctaCte = "";
    private double saldoCtaCte = 0;
    private double saldoAhorro = 0;
    private static int cuentaCreada = 0;
    private static double montoTotal = 0;
    

    //Constructores
    public CuentaBancaria(){
        String ctaCte = newCtaCte();
        double saldoCtaCte = 0.0;
        double saldoAhorro = 0.0;
        cuentaCreada +=1;
        System.out.println("Nuevo usuario creado con numero: "+ ctaCte +".");
        System.out.println("Total de cuentas creadas: "+ cuentaCreada +".");   
    }


    //Getters
    public double getsaldoCtaCte(){
        return saldoCtaCte;
    }
    public double getsaldoAhorro(){
        return saldoAhorro;
    }

    //Setters
    public void setsaldoCtaCte(double saldoCtaCte){
        this.saldoCtaCte = saldoCtaCte;
    }
    public void setsaldoAhorro(double saldoAhorro){
        this.saldoAhorro = saldoAhorro;
    }

    //Metodos
    private String newCtaCte() {
		String numberTable = "0123456789";
		String randomNumber = "";
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			char num = numberTable.charAt(rand.nextInt(10));
			randomNumber += num;
		}
		ctaCte = randomNumber;
		return randomNumber;	
	}

    public void cuentaDeposito(String type, Double cuentaDeposito) {
		if(type == "saldo" || type == "Saldo") {
			setsaldoCtaCte(getsaldoCtaCte() + cuentaDeposito);
			montoTotal += cuentaDeposito;
		}
		if(type == "savings" || type == "Ahorros") {
			setsaldoAhorro(getsaldoAhorro() + cuentaDeposito);
			montoTotal += cuentaDeposito;
		}
		else {
			System.out.println("Por favor, elija el tipo de cuenta apropiado.");
		}	
	}

    public void retiro(String type, Double retiro) {
		if(type == "saldo" || type == "Saldo") {
			if(getsaldoCtaCte() < retiro) {
				System.out.println("Fondos Insuficientes!");
			}
			else {
			setsaldoCtaCte(getsaldoCtaCte() - retiro);
			montoTotal -= retiro;
			}
		}
		if(type == "ahorros" || type == "Ahorros") {
			if(getsaldoAhorro() < retiro) {
				System.out.println("Insufficient Funds!");
			}
			else {
			setsaldoAhorro(getsaldoAhorro() - retiro);
			montoTotal -= retiro;
			}
		}
	}

    public Double saldo() {
		Double totalSaldo = saldoCtaCte + saldoAhorro;
		System.out.println(totalSaldo);
		return totalSaldo;
	}
}

