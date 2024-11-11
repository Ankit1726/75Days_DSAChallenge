package Functions;

import java.util.Scanner;

public class Avg_3Num {
    public static int Average(int a,int b,int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your 3 Number -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("Average of 3 Number -> "+Average(a,b,c));
    }
}
