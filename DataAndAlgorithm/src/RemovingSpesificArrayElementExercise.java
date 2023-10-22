import java.lang.reflect.Array;
import java.util.Arrays;

public class RemovingSpesificArrayElementExercise {
    public static void main(String[] args) {
        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original Array: " + Arrays.toString(myArray));
        int removeIndex = 3;

        for(int i = removeIndex; i < myArray.length-1; i++){
            myArray[i] = myArray[i+1];
        }

        System.out.println("After Removing an Element From Array: " + Arrays.toString(myArray));
    }
}
