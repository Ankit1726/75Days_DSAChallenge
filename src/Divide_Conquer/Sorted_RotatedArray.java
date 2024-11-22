package Divide_Conquer;

import _2D_Arrays.Search_SortedMatrix;

public class Sorted_RotatedArray { // TC->O( nlog n)
    public static int search(int arr[],int tar,int si,int ei){
        if (si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        if (arr[mid] == tar){  // case found
            return mid;
        }
        // mid on line 1
        if (arr[si]<=arr[mid]){
            // case a
            if (arr[si]<=tar && tar<=ei){
               return search(arr,tar,si,mid-1);
            }else {
                // case b
                return search(arr,tar,mid+1,ei);
            }
        }
        // mid on line 2
        else {
            // case c
            if (arr[mid]<tar && tar<=arr[ei]){
                return search(arr,tar,mid+1,ei);
            }else {
                // case d
                return search(arr,tar,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int tarIdx = search(arr,target,0,arr.length-1);
        System.out.println("Target is Found at index -> "+tarIdx);
    }
}
