package String;

import java.util.*;

public class RemoveAllConsecutiveDuplicatesFromTheString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(removeDuplicates(s));
    }

    static String removeDuplicates(String s) {
//        char[] arr=s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                continue;
            } else {
                sb.append(s.charAt(i));
                set.add(s.charAt(i));
            }

        }
        return String.valueOf(sb);
    }
}
