package Conditional_Statement;

import javax.swing.*;
import java.util.Scanner;

public class Income_TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter income -> ");
        int income = input.nextInt();
        int tax;
        if (income <500000){
            tax = 0;
        }else if (income>=500000 && income<1000000){
            tax = (int)(income*0.2);
        }else {
            tax = (int)(income*0.3);
        }
        System.out.println("Your Tax of Income is  -> "+tax);
    }
}