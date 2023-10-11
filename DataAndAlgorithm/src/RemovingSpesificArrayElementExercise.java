import java.lang.reflect.Array;
import java.util.Arrays;

public class RemovingSpesificArrayElementExercise {
    public static void main(String[] args) {
        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Original array: " + Arrays.toString(myArray));

        int removeIndex = 4;

        for (int i = removeIndex; i < myArray.length-1; i++){
            myArray[i] = myArray[i+1];
        }

        System.out.println("After removing 4th element of the array: " + Arrays.toString(myArray));
    }
}
