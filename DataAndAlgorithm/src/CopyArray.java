import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] firstArray = {0,1,2,3,4,5,6,7,8,9};
        int[] secondArray = new int[10];

        System.out.println("Original Array: " + Arrays.toString(firstArray));

        for (int i = 1; i <= firstArray.length-1; i++){
            secondArray[i] = firstArray[i];
        }

        System.out.println("Copy Array: " + Arrays.toString(secondArray));
    }
}
