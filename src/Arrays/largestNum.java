package Arrays;

public class largestNum {
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE;  // -infinity
        for (int i=0;i<num.length;i++){
            if (largest<num[i]){
                largest = num[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int num[]){
        int smallest = Integer.MAX_VALUE;
        for (int i=0;i<num.length;i++){
            if (smallest>num[i]){
                smallest = num[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,7,8,9,10};
        System.out.println("Largest Number is -> "+getLargest(num));
        System.out.println("Smallest Number is -> "+getSmallest(num));
    }
}
