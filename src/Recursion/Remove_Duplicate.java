package Recursion;

public class Remove_Duplicate {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        int mapIndex = Character.toLowerCase(currChar) - 'a';

        if (map[mapIndex]) {
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[mapIndex] = true;
            newStr.append(currChar);
            removeDuplicates(str, idx + 1, newStr, map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnaCollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
