public class ArrayDifferenceBetweenTwoNumbers {
    public static void main(String[] args) {
        int[] myArray = {1,5,4,3,2};

        int max = myArray[0];
        int min = myArray[0];
        for(int i = 1; i < myArray.length; i++) {
            if(myArray[i] > max) {
                max = myArray[i];
            }
            else if (myArray[i] < min) {
                min = myArray[i];

            }

        }
        System.out.println("Difference between biggest and smalest: " + (max - min));
    }
}
