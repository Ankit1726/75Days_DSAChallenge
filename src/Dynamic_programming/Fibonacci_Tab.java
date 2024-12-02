package Dynamic_programming;

public class Fibonacci_Tab {  // TC->O(n)
    public static int fibTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int h[] = new int[n+1];
        System.out.println(fibTab(n));
    }
}
