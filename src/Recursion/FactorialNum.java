package Recursion;

import java.util.Scanner;

public class FactorialNum {
    public static int factorial(int n){
       if (n==0){
           return 1;
       }
       return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pld enter your number -> ");
        int n = input.nextInt();
        System.out.println("Factorial of Number is -> "+factorial(n));
    }
}
