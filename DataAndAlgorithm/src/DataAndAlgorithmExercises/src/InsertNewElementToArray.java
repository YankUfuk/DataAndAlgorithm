import java.util.Arrays;

public class InsertNewElementToArray {
    public static void main(String[] args) {
        int[] originalArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = 2;
        int value = 5;
        System.out.println("Before Inserting New Element: " + Arrays.toString(originalArray));
        for (int i = 0; i < originalArray.length; i++){
            originalArray[index] = value;
            originalArray[i] = originalArray[i];
        }
        System.out.println("-----------------------------------------");
        System.out.println("After Inserting New Element: " + Arrays.toString(originalArray));
    }
}
