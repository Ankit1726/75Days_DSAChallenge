package Conditional_Statement;

import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pls enter your number -> ");
        int n = input.nextInt();
        String ans = (n%2==0)?"even number ":"odd number ";
        System.out.println(ans);
    }
}
