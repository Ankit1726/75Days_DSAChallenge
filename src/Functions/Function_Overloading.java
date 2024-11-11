package Functions;

public class Function_Overloading {
      // using parameters
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
      // using datatypes
    public static int Sum(int x,int y){
        return x+y;
    }
    public static double Sum(double x , double y){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,7));
        System.out.println(sum(8,9,7));
        System.out.println(Sum(8,9));
        System.out.println(Sum(7.89,78.9));
    }
}
