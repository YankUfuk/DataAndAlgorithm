import java.util.Arrays;

public class DuplicateValues {
    public static void main(String[] args) {
        int[] myArray = {0,1,2,3,4,5,5,7,8,3};

        int duplicatedNumber;

        for(int left = 0; left < myArray.length; left++) {
            for (int right = left+1; right < myArray.length; right++){
                if(myArray[left] == myArray[right]) {

                    System.out.println("Duplicated number(s): " + left);
                }
            }
        }

    }
}
