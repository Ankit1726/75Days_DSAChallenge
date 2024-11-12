package Arrays;

import java.util.Scanner;

public class Array_Creation {
    public static void main(String[] args) {
        int marks[] = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your 5 subject marks -> ");
        for (int i=0;i<marks.length;i++){
            marks[i] = input.nextInt();
        }
        // Print marks
        for (int j=0;j<marks.length;j++){
            System.out.print(marks[j]+" ");
        }
        System.out.println();
    }
}
