package Conditional_Statement;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pls enter your age -> ");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("Person eligible for driving");
        }else {
            System.out.println("Person not eligible for driving ");
        }
    }
}
