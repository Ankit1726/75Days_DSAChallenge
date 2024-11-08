package Functions;

import java.util.Scanner;

public class Product_2Num {
    public static int product(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter your 2 number -> ");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("Product of 2 Number -> "+product(x,y));
    }
}
