package Strings;

import java.util.Scanner;

public class StrExample {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Strings are immutable in java
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str1 = new String("xyz");

        // input from user
       Scanner input = new Scanner(System.in);
     //   System.out.print("pls enter your name -> ");
     //   String name = input.nextLine();
     //   System.out.println(name);

        // Concatenation
        String firstName = "ankit";
        String lastName = "gupta";
        String Name = firstName+" "+lastName;
        System.out.println(Name.charAt(0));
        printLetters("Ankit");
    }
}
