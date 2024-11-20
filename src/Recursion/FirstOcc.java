package Recursion;

public class FirstOcc {
    public static int firstOcc(int arr[],int key,int i){
        // Base Case
        if (i==arr.length){
            return -1;
        }
        if (arr[i]== key){
            return i;
        }
        return firstOcc(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,21,4,6,7};
        int key = 3;
        System.out.println("First Occurrence of key is at index -> "+firstOcc(arr,key,0));
    }
}
