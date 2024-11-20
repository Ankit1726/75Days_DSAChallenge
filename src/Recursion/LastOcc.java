package Recursion;

public class LastOcc {
    public static int lastOcc(int arr[],int key,int i){
        if (i== arr.length){
            return -1;
        }
        int isFound =  lastOcc(arr,key,i+1);
        if (isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,7,8,3,4,2,2};
        int key = 3;
        System.out.println("Key of Last Occurrence is found  at index -> "+lastOcc(arr,key,0));
    }
}
