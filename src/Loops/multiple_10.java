package Loops;

import java.util.Scanner;

public class multiple_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your number -> ");
        do {
            int n = input.nextInt();
            if (n%10==0){
                break;
            }
            System.out.print(n);
        }while (true);
        System.out.println("I am out of the loop");
    }
}
