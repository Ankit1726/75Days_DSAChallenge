package Loops;

import java.util.Scanner;

public class printNum_1ToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your range -> ");
        int range = input.nextInt();
        int count = 1;
        while(count<range){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
}
