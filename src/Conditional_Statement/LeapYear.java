package Conditional_Statement;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter 4 digit year -> ");
        int year = input.nextInt();
        if ((year%4==0 || year%400==0) && year%100!=0){
            System.out.println(year+" is leap year ");
        }else {
            System.out.println(year+" is not leap year");
        }
    }
}
