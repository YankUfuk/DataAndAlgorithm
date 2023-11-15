import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] startArray = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int i = 0; i < startArray.length/2; i++){
            int temp = startArray[i];
            startArray[i] = startArray[startArray.length-i-1];
            startArray[startArray.length-i-1] = temp;
        }
        System.out.println("Reverse array : " + Arrays.toString(startArray));
    }
}
