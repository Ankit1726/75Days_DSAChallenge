package Strings;

import java.util.Scanner;

public class shortest_Path { // TC->O(n)
    public static float getPath(String path){
        int x = 0,y = 0;
        for (int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            // South
            if (dir == 'S'){
                y--;
            }
            // North
            else if (dir == 'N'){
                y++;
            }
            // West
            else if (dir == 'W'){
                x--;
            }
            // East
          else {
              x++;
          }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return  (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your Direction -> ");
        String Direction = input.nextLine();
        System.out.println(getPath(Direction));
    }
}
