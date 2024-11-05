package Variables_DataTypes;

import java.util.Scanner;

public class Avg_3Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter your three number -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int Average = (a+b+c)/3;
        System.out.println("Average of 3 number -> "+Average);
    }
}
