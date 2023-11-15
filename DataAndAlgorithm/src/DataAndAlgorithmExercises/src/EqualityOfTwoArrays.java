import java.util.Arrays;

public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] myArray1  = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] myArray2  = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int i = 0;
        int j = 0;

        while(i < myArray1.length-1 && j < myArray2.length-1) {
            for (i = 0; i < myArray1.length - 1; i++) {
                myArray1[i] = myArray1[i];
            }
            for (j = 0; j < myArray2.length - 1; j++) {
                myArray2[j] = myArray2[j];
            }


        }
        if (myArray1[i] == myArray2[j]) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
