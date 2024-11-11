package Functions;

import java.util.Scanner;

public class Binomial_Coefficient {
    public static int factorial(int n){
        int fact = 1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int BinCoe(int n,int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int Binomial = n_fact/(r_fact*nmr_fact);
        return Binomial;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your value of n and r -> ");
        int n = input.nextInt();
        int r = input.nextInt();
        System.out.println("Binomial Coefficient of given number is -> "+BinCoe(n,r));

    }
}
