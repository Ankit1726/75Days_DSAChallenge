package Recursion;

public class OptimisedPower {  // TC->O(log n)
    public static int optimisedPower(int a,int n){
        if (n==0){
            return 1;
        }
        int halfPower = optimisedPower(a,n/2);
        int PowerSq = halfPower*halfPower;

        // n is odd
        if (n%2!=0){
            PowerSq = a*PowerSq;
        }
        return PowerSq;
    }
    public static void main(String[] args) {
        int a = 2,n = 5;
        System.out.println(optimisedPower(a,n));
    }
}
