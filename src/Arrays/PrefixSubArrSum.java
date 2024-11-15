package Arrays;

public class PrefixSubArrSum {  // TC->O(n^2)
    public static void prefixArrSum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        // cal prefix array
        for (int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+num[i];
        }
        for (int i=0;i<num.length;i++){
            int start = i;
            for(int j=i;j<num.length;j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] -prefix[start-1];
                if (maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum -> "+maxSum);
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        prefixArrSum(num);
    }
}
