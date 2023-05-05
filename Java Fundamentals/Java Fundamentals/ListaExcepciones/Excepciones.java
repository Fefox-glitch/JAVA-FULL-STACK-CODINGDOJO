package ListaExcepciones;
import java.util.ArrayList;

public class Excepciones {

	public static void main(String[] args) {

		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("Hola Mundo");
		myList.add(48);
		myList.add("Adios Mundo");
		myList.add(true);

		for (int i = 0; i < myList.size(); i++) {
			try {
				int convertirDato = (int) myList.get(i);
				System.out.println(convertirDato);

			} catch (Exception e) {
				System.err.println("error: " + e.getMessage() + " of value: " + myList.get(i));
			}
		}

	}

}