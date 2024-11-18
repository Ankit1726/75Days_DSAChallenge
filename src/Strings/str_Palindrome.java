package Strings;

import java.util.Scanner;

public class str_Palindrome { // TC->O(n)
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if (str.charAt(i)!=str.charAt(n-1-i)){
                // not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pls  enter your String -> ");
        String str = input.nextLine();
        if (isPalindrome(str) == true){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is not Palindrome");
        }
    }
}
