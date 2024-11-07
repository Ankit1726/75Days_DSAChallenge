package Loops;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
        if (n==2){
            System.out.println(n+" is prime number");
        }else {
            boolean isPrime = true;
            for (int i=2;i<=n-1;i++){
                if (n%2==0){
                    isPrime = false;
                }
            }
            if (isPrime == true){
                System.out.println(n+" is prime number ");
            }else {
                System.out.println(n+" is not prime number ");
            }
        }
    }
}
