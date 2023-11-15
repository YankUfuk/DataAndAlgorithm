public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci value of 5: " + FibonacciCalculator(5));
        System.out.println("Fibonacci value of 4: " + FibonacciCalculator(4));
        System.out.println("Fibonacci value of 3: " + FibonacciCalculator(3));
    }

    static int FibonacciCalculator(int n){

        if(n == 0 || n == 1){
            return n;
        }
        return FibonacciCalculator(n-1) + FibonacciCalculator(n-2);

    }
}
//1 1 2 3 5 8 13