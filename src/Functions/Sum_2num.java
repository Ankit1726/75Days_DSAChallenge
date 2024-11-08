package Functions;

import java.util.Scanner;

public class Sum_2num {
    // Parameterised function
    public static int Sum(int a,int b){  // parameters or formal parameters
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your 2 number -> ");
        int a = input.nextInt();  // Actual Parameters
        int b = input.nextInt();
        System.out.println("Sum of 2 Number -> "+Sum(a,b));
    }
}
