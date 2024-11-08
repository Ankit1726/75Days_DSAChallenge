package Functions;

import java.util.Scanner;

public class Swap_2Num {
    public static void Swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a -> "+a);
        System.out.println("b -> "+b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your 2 number -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("After Swapping...");
        Swap(a,b);
    }
}
