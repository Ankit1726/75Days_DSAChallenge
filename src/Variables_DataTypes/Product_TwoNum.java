package Variables_DataTypes;

import java.util.Scanner;

public class Product_TwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your two number -> ");
        int x = input.nextInt();
        int y = input.nextInt();
        int product = x*y;
        System.out.println("Product of two number -> "+product);
    }
}
