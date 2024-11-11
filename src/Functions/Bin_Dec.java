package Functions;

import java.util.Scanner;

public class Bin_Dec {
    public static void binToDec(int binNum){
        int pow = 0,decNum = 0,myNum = binNum;
        while (binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum+(lastDigit*(int)Math.pow(2,pow) );
            pow++;
            binNum/=10;
        }
        System.out.println("Decimal of "+myNum+" -> "+decNum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your Binary Number -> ");
        int binNum = input.nextInt();
        binToDec(binNum);
    }
}
