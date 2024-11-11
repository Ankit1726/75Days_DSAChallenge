package Advance_Pattern;

import java.util.Scanner;

public class Hollow_Rectangle {
    public static void printHollow(int totRow,int totCol){
        // outer loop
        for (int i=1;i<=totRow;i++){
            // inner -> columns
            for (int j=1;j<=totCol;j++){
                if (i==1||i==totRow||j==1||j==totCol){ // Boundary condition
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your totRow and totCol -> ");
        int totRow = input.nextInt();
        int totCol = input.nextInt();
        printHollow(totRow,totCol);
    }
}
