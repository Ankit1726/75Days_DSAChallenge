package Arrays;

public class BinarySearch {
    public static int Binary(int num[],int key){
        int start = 0,end = num.length-1;
        while (start<=end){
            int mid = (start+end)/2;

            if (num[mid]==key){
                return mid;
            }
            if (num[mid]<key){
                start = mid+1;   // search right half
            }
            else {
                end = mid-1;    // search left half
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14};
        int key = 12;
        System.out.println("Key is found at index -> "+Binary(num,key));
    }
}
