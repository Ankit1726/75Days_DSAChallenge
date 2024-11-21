package Recursion;

import java.util.Scanner;

public class FriendPairing_Problem {
    public static int friendPairing(int n){
        if (n==1||n==2){
            return n;
        }
        return friendPairing(n-1)+(n-1)*friendPairing(n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your friends count -> ");
        int n = input.nextInt();
        System.out.println("Total Pairs Formed -> "+friendPairing(n));
    }
}
