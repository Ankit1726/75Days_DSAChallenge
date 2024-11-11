package Advance_Pattern;

import java.util.Scanner;

public class InvertedPyramid_Num {
    public static void printPyramidNum(int n){
        for (int i=1;i<=n;i++){
            // inner loop
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
        printPyramidNum(n);
    }
}
