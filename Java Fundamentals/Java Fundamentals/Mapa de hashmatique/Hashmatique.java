import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public void retriveSongData(){  
        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("RENAULT 12", "Renault 12 alto auto los repuesto son baratos y pa andar nada gasta...");
        songMap.put("Balada Conformista", "Me voy a tener que conformar con lo que estas diciendo...");
        songMap.put("Song 2", "I got my head checked by a jumbo jet it wasn't easy...");
        songMap.put("Verbatim", "I wear women's underwear and then I go to strike a pose in my full...");

        String single = songMap.get("RENAULT 12");
        System.out.println(single);

        Set<String> keys = songMap.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(songMap.get(key));
        }
    }
}