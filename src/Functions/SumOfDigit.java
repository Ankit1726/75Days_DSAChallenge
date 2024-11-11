package Functions;

import java.util.Scanner;

public class SumOfDigit {
    public static int sumOfDigit(int n){
        int sum = 0;
        while (n>0){
            int LD = n%10;
            sum+=LD;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your Numbers -> ");
        int n = input.nextInt();
        System.out.println("Total Sum -> "+sumOfDigit(n));
    }
}
