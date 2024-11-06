package Conditional_Statement;

import java.util.Scanner;

public class Basic_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your two number -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("pls enter your operator -> ");
        char operator = input.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
