package Loops;

import java.util.Scanner;

public class Sum_N_natural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your range -> ");
        int n = input.nextInt();
        int sum = 0;
        int i=1;
        while (i<=n){
            sum+=i;
            i++;
        }
        System.out.print("Final Sum is  -> "+sum);
    }

}
