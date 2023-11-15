import java.util.Arrays;

public class AverageOfArraysExceptSmallestAndBiggest {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original Array: " + Arrays.toString(myArray));
        int max = myArray[0];
        int min = myArray[0];
        int sum = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            sum += myArray[i];

            if(myArray[i] > max) {
                max = myArray[i];
            }else if (myArray[i] < min){
                min = myArray[i];
            }
        }
        float average = ((sum-max-min)/(myArray.length-2));
        System.out.println(average);
    }

}
