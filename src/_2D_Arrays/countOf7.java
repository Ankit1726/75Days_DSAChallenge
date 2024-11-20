package _2D_Arrays;

public class countOf7 {
    public static void main(String[] args) {
        int arr[][] = {{4,7,8},{8,8,7}};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (arr[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("Total Count of 7 is -> "+count);
    }
}
