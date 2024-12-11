package Dynamic_programming;

public class catalan_Tabulation {  // TC->O(n^2)
    public static int Catalan_tab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2;i<=n;i++){  // Ci
            for (int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];  // ci -> Cj*Ci-j-1
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(Catalan_tab(4));
    }
}
