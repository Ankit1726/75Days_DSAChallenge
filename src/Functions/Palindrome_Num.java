package Functions;

import javax.swing.event.MenuKeyListener;
import java.util.Scanner;

public class Palindrome_Num {
    public static boolean isPalindrome(int n){
        int palindrome = n , rev = 0;
        while (palindrome!=0){
            int rem = palindrome%10;
            rev = rev*10+rem;
            palindrome = palindrome/10;
        }
        if (n==rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
        if (isPalindrome(n)){
            System.out.println(n+" is palindrome number ");
        }
        else{
            System.out.println(n+" is not palindrome number ");
        }
    }
}
