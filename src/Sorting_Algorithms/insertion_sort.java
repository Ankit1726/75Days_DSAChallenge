package Sorting_Algorithms;

public class insertion_sort {  // TC->O(n^2)
    public static void insertion(int arr[]){
        for (int i=1;i<arr.length;i++){
            int curr =arr[i];
            int prev = i-1;
            // finding out correct position
            while (prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,1,3,5,2};
        insertion(arr);
        System.out.println("After sorting...");
        printArr(arr);
    }
}
