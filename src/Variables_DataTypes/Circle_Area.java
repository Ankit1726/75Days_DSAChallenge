package Variables_DataTypes;

import java.util.Scanner;

public class Circle_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your radius -> ");
        double radius = input.nextDouble();
        double Area = Math.PI*Math.pow(radius,2);
        System.out.println("Area of circle -> "+Area);
    }
}
