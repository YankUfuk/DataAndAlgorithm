import java.util.Scanner;

public class GCDUsingRecursion {
    public static void main(String[] args) {
        int a,b;

        Scanner sc = new Scanner((System.in));
        System.out.print("Enter first number:");
        a = sc.nextInt();
        System.out.print("Enter second number:");
        b = sc.nextInt();
        System.out.print("GCD of two number is: " + GCD(a, b));
    }

    static int GCD(int a, int b){
        if(b != 0){
            return GCD(b, a % b);
        }else{
            return a;
        }
    }
}
