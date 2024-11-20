package Recursion;

import java.util.Scanner;

public class print_Inc {
    public static void PrintInc(int n){
        // Base Case
        if (n==1){
            System.out.print(1+" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
        PrintInc(n);
    }
}
