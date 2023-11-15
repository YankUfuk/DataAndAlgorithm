import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] my_array = {0, 1, 9, 3, 4, 8, 6, 7, 3, 5};
        Arrays.sort(my_array);
        int index = my_array.length-1;
        while(my_array[index]==my_array[my_array.length-1]){
            index--;
        }
        System.out.println("Second largest value: " + my_array[index]);
    }
}


