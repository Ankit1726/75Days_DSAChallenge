package Conditional_Statement;

import java.util.Scanner;

public class Largest_2Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your two number -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a>b){
            System.out.println(a+" is  Greatest Number ");
        }else {
            System.out.println(b+" is  Greatest Number ");
        }
    }
}
