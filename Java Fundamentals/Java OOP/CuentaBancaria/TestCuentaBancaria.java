package CuentaBancaria;

public class TestCuentaBancaria {
    public static void main(String[] args) {
        // Cuenta 1
        CuentaBancaria cta1 = new CuentaBancaria();
        cta1.cuentaDeposito("Ahorros", 80.00);
        cta1.retiro("Saldo", 100.00);
        cta1.saldo();
        //Cuenta 2
        CuentaBancaria cta2 = new CuentaBancaria();
        cta2.cuentaDeposito("Saldo", 300.00);
        cta2.retiro("Saldo", 150.00);
        cta2.saldo();
        //Cuenta 3
        CuentaBancaria cta3 = new CuentaBancaria();
        cta3.cuentaDeposito("Ahorros", 3000.50);
        cta3.retiro("Ahorros", 2000.00);
        cta3.saldo();
    }
}
/*
1.	Crea una clase CuentaBancaria
2.	La clase debe tener los siguientes atributos: saldo de cuenta corriente (double), saldo de ahorros (double)
3.	Crea un miembro de clase (estático) que tenga la cantidad de cuentas creadas hasta el momento.
4.	Crea un miembro de clase (estático) que rastree la cantidad total de dinero almacenada en cada cuenta creada.
5.	En el constructor, asegúrate de incrementar el número de cuentas.
6.	Crea un método getter para el saldo de la cuenta corriente del usuario.
7.	Crea un método getter para el saldo de la cuenta corriente del usuario.
8.	Crea un método que le permita a un usuario depositar dinero en la cuenta corriente o en la cuenta de ahorros, asegúrate de agregarlo al monto total almacenado.
9.	Crea un método para retirar dinero de uno de los saldos. No les permitas retirar dinero si no hay fondos suficientes.
10.	Crea un método para ver el dinero total de la cuenta corriente y de ahorros.
11.	Los usuarios no deberían poder establecer ninguno de los atributos de la clase.*/