package Dynamic_programming;

public class catalans_Number {
    public static int Catalan_Recursion(int n){
        if (n==0||n==1){
            return 1;
        }
        int ans = 0;  // Cn
        for (int i=0;i<=n-1;i++){
            ans+=Catalan_Recursion(i)*Catalan_Recursion(n-i-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Catalan_Recursion(n));
    }
}
