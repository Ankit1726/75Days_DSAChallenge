package Recursion;

import java.util.Scanner;

public class Sum_NaturalNum {
    public static int sumNatural(int n){
        if (n==1){
            return 1;
        }
        return n+sumNatural(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
        System.out.println("Sum of Natural Number is -> "+sumNatural(n));

    }
}
