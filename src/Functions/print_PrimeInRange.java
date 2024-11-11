package Functions;

import java.util.PriorityQueue;
import java.util.Scanner;

public class print_PrimeInRange {
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
    public static void PrimeRange(int n){
        for (int i=2;i<=n;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your range number  n -> ");
        int n = input.nextInt();
        System.out.println("Following Prime Numbers are -> ");
       PrimeRange(n);
    }
}
