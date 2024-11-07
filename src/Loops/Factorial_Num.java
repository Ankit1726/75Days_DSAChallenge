package Loops;

import java.util.Scanner;

public class Factorial_Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
        int fact = 1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is -> "+fact);
    }
}
