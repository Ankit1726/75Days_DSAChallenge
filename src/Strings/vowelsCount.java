package Strings;

import java.util.Scanner;

public class vowelsCount {
    public static int countVowels(String str){
        int count = 0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your string -> ");
        String str = input.nextLine();
        System.out.println("Total number of vowels count -> "+countVowels(str));
    }
}
