package ListaExcepciones;
import java.util.*;

public class ListaExcepciones{
    public void workTest(){
        ArrayList<Object> workList = new ArrayList<Object>();
        workList.add("13");
        workList.add("Hola Mundo");
        workList.add(48);
        workList.add("Adios Mundo");
        workList.add(true);
    
        
            for(int i = 0; i < workList.size(); i++){
                try {
//              Integer convertirDato = (Integer)workList.get(i);
            } 
        catch(ClassCastException e) {
            System.out.println("No puedo castear este dato: "+ workList.get(i));
        }
    }
    
}
}