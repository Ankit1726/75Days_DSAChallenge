package Advance_Pattern;

import java.util.Scanner;

public class Inverted_Pyramid {
    public static void printInvertedPyramid(int n){
        // outer loop
        for (int i=1;i<=n;i++){
            // spaces
           for (int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           // star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
        printInvertedPyramid(n);
    }
}
