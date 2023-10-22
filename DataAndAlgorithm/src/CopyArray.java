import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] firstArray = {0,1,2,3,4,5,6,7,8,9};
        int[] secondArray = new int[10];

        System.out.println("Before Copying Array: " + Arrays.toString(firstArray));
        for(int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }

        System.out.println("After Copying Array: " + Arrays.toString(secondArray));
    }
}
