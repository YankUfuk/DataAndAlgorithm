import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        ArrayList<Integer> common = new ArrayList<Integer>();
        int[] array1 = {10,20,30,40,50};
        int[] array2 = {10,11,12,13,14,15,16,17,18,19,20};
        int[] array3 = {2,4,6,8,10,12,14,16,18,20};

        int x = 0;
        int y = 0;
        int z = 0;

        while(x < array1.length && y < array2.length && z < array3.length) {
            if (array1[x] == array2[y] && array2[y] == array3[z]){
                common.add(array1[x]);
                x++;
                y++;
                z++;
            }
            else if (array1[x] < array2[y]){
                x++;
            }
            else if (array2[y] < array3[z]){
                y++;
            }
            else {
                z++;
            }
        }
        System.out.print("Common numbers are: " + common);
    }
}
