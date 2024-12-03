package Dynamic_programming;

public class Knapsack_Memoization {
    public static int Knapsack(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n - 1] <= W) {
            // Include
            int ans1 = val[n - 1] + Knapsack(val, wt, W - wt[n - 1], n - 1, dp);
            // Exclude
            int ans2 = Knapsack(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            dp[n][W] = Knapsack(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        // Initialize the dp array
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1; // Initialize with -1
            }
        }
        System.out.println("Total Maximum Profit -> " + Knapsack(val, wt, W, val.length, dp));
    }
}
