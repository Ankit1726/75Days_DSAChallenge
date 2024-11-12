package Arrays;

public class Linear_Search {
    public static int linear(int num[],int key){
        for (int i=0;i<=num.length;i++){
            if (num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12};
        int key = 10;
        int idx = linear(num,key);
            if (idx==-1){
                System.out.print("key is not found ");
            }else {
                System.out.println("Key is at index -> "+idx);
            }
        }
    }
