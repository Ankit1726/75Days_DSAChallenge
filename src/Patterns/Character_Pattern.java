package Patterns;

import java.util.Scanner;

public class Character_Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
        char ch = 'A';
        for (int i=1;i<=n;i++){
            for (int Char=1;Char<=i;Char++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
