package Arrays;

public class maxSum_BruteForce {   // TC->O(n^3)
    public static void printSubArrSum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<num.length;i++){
            int start = i;
            for (int j=i;j<num.length;j++){
                int end = j;
                currSum = 0;
                for (int k=start;k<=end;k++){
                    // sum
                    currSum+=num[k];
                }
                System.out.println(currSum);
                if (maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum -> "+maxSum);
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        printSubArrSum(num);
    }
}
