package Strings;

public class String_CompareTo {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1==s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(s1==s3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        /* Strings can compare objects which present on same memory location not stored value.
            compareTo -> is used to check stored value become equal or not
        */
        if (s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
