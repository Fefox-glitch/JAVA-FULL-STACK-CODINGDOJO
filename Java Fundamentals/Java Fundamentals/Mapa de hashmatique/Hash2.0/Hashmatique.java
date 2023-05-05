import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

    public static void main(String[] args) {

        // Crea un Hashmap de cuatro canciones con sus títulos como claves
        // y sus letras asociadas a los títulos
        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("RENAULT 12", "Renault 12 alto auto los repuesto son baratos y pa andar nada gasta...");
        songMap.put("Balada Conformista", "Me voy a tener que conformar con lo que estas diciendo...");
        songMap.put("Song 2", "I got my head checked by a jumbo jet it wasn't easy...");
        songMap.put("Verbatim", "I wear women's underwear and then I go to strike a pose in my full...");

        // Primero obtenemos la letra de una canción por su título
        String single = songMap.get("RENAULT 12");
        System.out.println(single);

        // y luego hacemos que imprima el título y la letra de cada canción de la lista
        Set<String> keys = songMap.keySet();
        for (String llave: keys) {
            System.out.println("Titulo: " + llave);
            System.out.println("Letra: " + songMap.get(llave));
        }
    }
}