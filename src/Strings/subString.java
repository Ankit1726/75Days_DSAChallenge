package Strings;

public class subString {
    public static String subStr(String str,int si,int ei){
        String SubStr = "";
        for(int i=si;i<ei;i++){
            SubStr+=str.charAt(i);
        }
        return SubStr;
    }
    public static void main(String[] args) {
        // subString function
        String str = "Hello World";
        System.out.println(str.substring(0,7));
        System.out.println(subStr(str,0,5));
    }
}
