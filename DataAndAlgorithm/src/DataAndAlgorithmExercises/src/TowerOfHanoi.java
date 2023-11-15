public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        TowerOfHanoi(n, 'A', 'C', 'B');
    }
    static void TowerOfHanoi(int n, char fromRod, char toRod, char auxRod)
    {
        if(n == 0) {
            return;
        }
        TowerOfHanoi(n-1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        TowerOfHanoi(n-1, auxRod, toRod, fromRod);

    }


}
