public class ProyectoTest {
    
    public static void main(String[] args){
        Proyecto testProject = new Proyecto();
        testProject.setNombre("Proyecto x");
        testProject.setDescripcion("you yipi youuu!");
        testProject.setCosto(10.0);
        // System.out.println(testProject.getNombre());
        // System.out.println(testProject.getDescripcion());
        // System.out.println(testProject.getCosto());
        System.out.println(testProject.elevatorPitch());
    }
}
