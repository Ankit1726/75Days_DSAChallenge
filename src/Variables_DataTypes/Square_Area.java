package Variables_DataTypes;

import java.util.Scanner;

public class Square_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your side value -> ");
        int side = input.nextInt();
        int SqArea = side*side;
        System.out.println("Area of Square -> "+SqArea);
    }
}
