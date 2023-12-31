import java.io.*;
import java.util.*;

class RadixSort {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Random rand = new Random();
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(15);
        }

        int n = arr.length;

        radixsort(arr, n);
        print(arr, n);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Time elapsed: " + timeElapsed);
    }
    
    static int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
    static void countSort(int arr[], int n, int exp) {

        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);


        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;


        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];


        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }


        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
    static void radixsort(int arr[], int n) {

        int m = getMax(arr, n);


        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    static void print(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ");
    }
}

