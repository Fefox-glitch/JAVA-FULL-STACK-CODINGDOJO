import java.util.Scanner;

public class testpitagoras {
    public static void main(String[] args) {
        try (// Creamos el objeto de la clase Scanner para leer datos.
        Scanner input = new Scanner(System.in)) {
            // Preguntamos al usuario el valor de los catetos en Int como pide la actividad.
            System.out.print("Valor cateto A: ");
            double a = input.nextInt();
            System.out.print("Valor cateto B: ");
            double b = input.nextInt();
            /*
             * Usamos la funcion Math.pow(base,exponente) para calcular
             * el cuadrado de un numero.
             * el resultado lo guardaremos en la misma variable
             */
            a = Math.pow(a, 2);
            b = Math.pow(b, 2);
            /*
             * Para obtener la raiz cuadrada de un numero usamos la
             * funcion Math.sqrt(num) en este caso, dentro de los
             * parentesis se hará la suma de los cuadrados de los
             * catetos.
             * guardaremos el resultado en la variable "c"
             * que será el valor de la hipotenusa.
             */
            double c = Math.sqrt(a + b);
            System.out.println("--------------------------");
            System.out.println("Valor de Hipotenusa: " + c);
        }
    }
}
