public class PairOfElementsEqualToSpesificNumber {
    public static void main(String[] args) {
        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int spesificNumber = 10;

        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = 1; j < myArray.length-1; j++) {
                if(myArray[i] + myArray[j] == 10){
                    System.out.println(myArray[i] + " + " + myArray[j] + " = " + (myArray[i] + myArray[j]));
                }
            }
        }
    }
}
