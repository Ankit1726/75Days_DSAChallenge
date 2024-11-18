package Strings;

public class _StringBuilder {  // TC->O(26)
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a';ch<='z';ch++){
            sb.append(ch+" ");
        }
        System.out.println(sb);
        System.out.println("Total length -> "+sb.length());
    }
}
