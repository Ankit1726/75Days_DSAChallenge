package Functions;

import java.util.Scanner;

public class prime_Num {
    public static boolean isPrime(int n){
        if (n==2) {
            return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
        if (isPrime(n)==true){
            System.out.println(n+" is prime number ");
        }else {
            System.out.println(n+ " is not prime number ");
        }
    }
}
