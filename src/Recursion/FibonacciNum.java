package Recursion;

import java.util.Scanner;

public class FibonacciNum { // TC->O(n^2)
    public static int printFib(int n){
        if (n==0||n==1){
            return n;
        }
        return printFib(n-1)+printFib(n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
        System.out.println("Fibonacci Series of Sum is-> "+printFib(n));
    }
}
