import java.util.ArrayList;
import java.util.Arrays;

public class FindEvenAndOddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        int[] myArray = {0,1,2,3,4,5,6,7,8,9};
        int even = 0;
        int odd = 0;
        int i = 0;
        for (i = 0; i < myArray.length-1; i++) {
            if ((myArray[i] % 2) == 0) {
                evenNumbers.add(myArray[i]);
                even++;
            }
            else {
             oddNumbers.add(myArray[i]);
             odd++;
            }
        }
        System.out.println("Original Array: " + Arrays.toString(myArray) );
        System.out.println("----------------------------------------------");
        System.out.println("Even Numbers: " + evenNumbers + "Number of evens: " + even);
        System.out.println("----------------------------------------------");
        System.out.println("Odd Numbers: " + oddNumbers + "Number of odds: " + odd);
    }
}
