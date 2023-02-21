package String;

import java.util.Arrays;

public class LongestCommonPrifix {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        // sb.append("");
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int i = 0;
        while (i < str1.length()) {
            if (i == 0 && str1.charAt(i) != str2.charAt(i)) return "";
            if (str1.charAt(i) == str2.charAt(i)) {
                sb.append(str1.charAt(i));
            } else {
                return sb.toString();
            }

            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] s = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(s));
    }
}
