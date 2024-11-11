package Advance_Pattern;

import java.util.Scanner;

public class _0_1_Triangle {
    public static void printTriangle(int n){
        for (int i=1;i<=n;i++){
            // inner loop
            for (int j=1;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print(" 1 ");
                }else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
        printTriangle(n);
    }
}
