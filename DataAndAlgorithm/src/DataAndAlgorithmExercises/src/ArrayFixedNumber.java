public class ArrayFixedNumber {
    public static void main(String[] args) {
        int[] myArray = {1,20,10,30,10};
        int searchNum = 10;
        int fixedNum = 30;

        System.out.println(Result(myArray, searchNum, fixedNum));
    }

    private static boolean Result(int[] array, int search_num, int fixed_num) {
        int tempSum = 0;
        for (int number : array) {
            if (search_num == number) {
                tempSum += search_num;
            }else if (tempSum > fixed_num){
                break;
            }

        }
        return tempSum == fixed_num;
    }
}
