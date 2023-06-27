package Recursions;

import java.util.*;

public class StringPermutations {
    public static void main(String[] args) {
        System.out.println(permutations("", "purvil"));
        System.out.println(permutations("", "ABC"));
        System.out.println(countPermutations("", "ABC"));
        System.out.println(countPermutations("", "purvil"));
    }

    static ArrayList<String> permutations(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            ans.addAll(permutations(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int countPermutations(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);
        int count =0;

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            count =count + countPermutations(f + ch + s, up.substring(1));
        }
        return count;
    }
}
