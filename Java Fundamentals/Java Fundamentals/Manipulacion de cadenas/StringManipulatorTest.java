public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator finalstring = new StringManipulator();
        String result = finalstring.trimAndConcat("         Hola     ", "   Mundo          ");
        System.out.println(result);

        StringManipulator testindex = new StringManipulator();
        Integer finalvalue = testindex.getIndexOrNull("Coding", 'u');
        System.out.println(finalvalue);

        StringManipulator findSubString = new StringManipulator();
        Integer finalValue = findSubString.getIndexOrNull("Ho", "la");
        System.out.println(finalValue);

        StringManipulator combineString = new StringManipulator();
        String endResult = combineString.concatSubstring("Hola", 1, 3, "Mundo");
        System.out.println(endResult);
    }
}
