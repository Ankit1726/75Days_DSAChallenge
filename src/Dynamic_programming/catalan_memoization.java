package Dynamic_programming;
import java.util.Arrays;

public class catalan_memoization {
    public static int Catalan_memo(int n,int dp[]){
        if (n==0||n==1){
            return 1;
        }
        if (dp[n]!=-1){
            return dp[n];
        }
        int ans = 0;
        for (int i=0;i<n;i++){
            ans+=Catalan_memo(i,dp) * Catalan_memo(n-i-1,dp);
        }
        return dp[n] = ans;
    }
    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(Catalan_memo(n,dp));
    }
}
