package Dynamic_programming;

public class climbingStairs_Recursion {
    public static int CountWays(int n){
        if (n==0){
            return 1;
        }
        if ((n < 0)) {
            return 0;
        }
       return CountWays(n-1)+CountWays(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Total Ways -> "+CountWays(n));
    }
}
