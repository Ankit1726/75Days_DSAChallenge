package Variables_DataTypes;

import java.util.Scanner;

public class Sum_TwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your two number -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("Sum of Two number -> "+sum);
    }
}
