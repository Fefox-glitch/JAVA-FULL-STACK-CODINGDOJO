public class FizzBuzzTest {

    public static void main(String args[]) {

        FizzBuzz fB = new FizzBuzz();
        String salida = fB.fizzBuzz(3);
        System.out.println(salida);
        salida = fB.fizzBuzz(5);
        System.out.println(salida);
        salida = fB.fizzBuzz(15);
        System.out.println(salida);
        salida = fB.fizzBuzz(2);
        System.out.println(salida);
        
    }
}
