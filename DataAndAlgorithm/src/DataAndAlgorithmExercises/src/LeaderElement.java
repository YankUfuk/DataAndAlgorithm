public class LeaderElement {
    public static void main(String[] args) {
        int[] myArray = {10, 9, 14, 23, 15, 0, 9};

        for (int i = 0; i < myArray.length; i++) {
            int j;
            for (j = i + 1; j < myArray.length; j++) {
                if (myArray[i] <= myArray[j]) {
                    break;
                }

            }
            if (j == myArray.length) {
                System.out.print(myArray[i] + " ");
            }
        }
    }
}