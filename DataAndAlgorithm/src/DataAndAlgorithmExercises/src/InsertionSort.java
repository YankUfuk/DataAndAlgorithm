import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Random rand = new Random();
        int[] numbers = new int[10000000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000000);
        }

        insertionSort(numbers);
        printArray(numbers);

        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Time elapsed: " + timeElapsed);
    }

    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {

            int currentValue = inputArray[i];

            int j = i - 1;
            while (j >= 0 && inputArray[j] > currentValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}