package Loops;

import java.util.Scanner;

public class Reverse_GivenNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
        int rev = 0;
        while (n>0){
            int LD = n%10;
            rev = (rev*10)+LD;
            n/=10;
        }
        System.out.println("After Reverse -> "+rev);
    }
}
