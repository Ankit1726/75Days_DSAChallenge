package Recursion;

import java.util.Scanner;

public class printnum_Dec {
    public static void PrintDec(int n){
        // Base Case
        if (n==1){
            System.out.print(n);
            return ;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pld enter your number -> ");
        int n = input.nextInt();
        PrintDec(n);

    }
}
