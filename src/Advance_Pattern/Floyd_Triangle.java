package Advance_Pattern;

import java.util.Scanner;

public class Floyd_Triangle {
    public static void printTriangle(int n){
        int count = 1;
        for (int i=1;i<=n;i++){
            // inner loop
            for (int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
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
