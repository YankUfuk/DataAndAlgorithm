import java.util.*;
import java.util.Collections;
public class BucketSort {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        BucketSort b = new BucketSort();
        Random rand = new Random();
        float[] arr = new float[77000000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextFloat(20000000);
        }
        b.bucketSort(arr, 77000000);

        for (float i : arr)
            System.out.println(i + "  ");
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Time elapsed: " + timeElapsed);

    }
    public void bucketSort(float[] arr, int n) {
        if (n <= 0)
            return;

        ArrayList<Float>[] bucket = new ArrayList[n];


        for (int i = 0; i < n; i++)
            bucket[i] = new ArrayList<Float>();


        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i];
            bucket[bucketIndex].add(arr[i]);
        }


        for (int i = 0; i < n; i++) {
            Collections.sort((bucket[i]));
        }


        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0, size = bucket[i].size(); j < size; j++) {
                arr[index++] = bucket[i].get(j);
            }
        }
    }


}

