package Functions;

import java.util.Scanner;

public class Dec_Bin {
    public static void decTobin(int n){
        int pow = 0,binNum = 0,myNum = n;
        while (n>0){
            int rem = n%2;
            binNum = binNum+(rem*(int) Math.pow(10,pow));
            pow++;
            n/=2;
        }
        System.out.println("Binary form of "+myNum+" -> "+binNum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your Decimal Number -> ");
        int n = input.nextInt();
        decTobin(n);
    }
}
