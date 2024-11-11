package Advance_Pattern;

import java.util.Scanner;

public class solid_Rhombus {
    public static void rhombus(int n){
        for (int i=1;i<=n;i++){
            // spaces
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // stars
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
        rhombus(n);
    }
}
