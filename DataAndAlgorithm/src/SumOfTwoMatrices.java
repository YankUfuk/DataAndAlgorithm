import java.util.Scanner;

public class SumOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,a,b;

        System.out.println("Input number of rows of matrix: ");
        x = sc.nextInt();
        System.out.println("Input number of column of matrix: ");
        y = sc.nextInt();

        int[][] array1 = new int[x][y];
        int[][] array2 = new int[x][y];
        int[][] sum = new int[x][y];

        System.out.println("Input elements of first matrix: ");
        for (a = 0; a < x; a++){
            for (b = 0; b < y; b++){
                array1[a][b] = sc.nextInt();
            }
        }
        System.out.println("Input elements of second matrix: ");
        for (a = 0; a < x; a++){
            for (b = 0; b < y; b++){
                array2[a][b] = sc.nextInt();
            }
        }
        for (a = 0; a < x; a++){
            for (b = 0; b < y; b++){
                sum[a][b] = array1[a][b] + array2[a][b];
            }
        }
        System.out.println("Sum of Matrices");
        for (a = 0; a < x; a++){
            for (b = 0; b < y; b++){
                System.out.print(sum[a][b] + "\t");

                System.out.println();
            }
        }

    }
}
