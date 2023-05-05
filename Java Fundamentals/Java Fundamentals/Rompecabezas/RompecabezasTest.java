public class RompecabezasTest{
    public static void main(String[] args){
    Rompecabezas testData = new Rompecabezas();
    
    int[] testArr = {3,5,1,2,7,9,8,13,25,32};
    testData.sumYmayorque10(testArr);

    String[] testList = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    testData.StringsCombinados(testList);

    testData.AlfabetoCombinado();

    testData.NumeroRandom();

    testData.NumeroRandom2();

    testData.StringRandom();

    testData.StringDeStringsRandom();
    }
}