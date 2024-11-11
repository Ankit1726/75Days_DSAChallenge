package Functions;

import java.util.Scanner;

public class check_EvenOdd {
    public static boolean isEven(int n){
        if (n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pls enter your number -> ");
        int n = input.nextInt();
       if (isEven(n)==true){
           System.out.println(n+" is even number ");
       }else {
           System.out.println(n+" is odd number ");
       }
    }
}
