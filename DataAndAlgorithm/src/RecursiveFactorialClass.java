public class RecursiveFactorialClass {
    int FactorialCalculator(int n){

        int result;

        if(n == 1){
            return 1;
        }

        result = FactorialCalculator(n-1) * n;
        return result;
    }
}
