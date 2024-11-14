package Sorting_Algorithms;

import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_Sort {  // TC->O(nlog n)
    public static void printArr(Integer arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {5,3,4,2,1};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("After Sorting...");
        printArr(arr);
    }
}
