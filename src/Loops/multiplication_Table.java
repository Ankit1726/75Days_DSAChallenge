package Loops;

import java.util.Scanner;

public class multiplication_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
