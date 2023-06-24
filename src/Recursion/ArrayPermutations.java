package Recursion;

import java.util.ArrayList;

public class ArrayPermutations {
    public static void main(String[] args) {

    }
    static ArrayList<String> permutations(ArrayList<Integer> p, ArrayList<Integer> up) {
        if (up.size()==0) {
            ArrayList<Integer> list = new ArrayList();
            list.add(p);
            return list;
        }

        int ch = up.get(0);
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= p.size(); i++) {
            ArrayList<Integer> f = p.subList(0, i);
            ArrayList<Integer> s = p.subList(i);
            ans.addAll(permutations(f + ch + s, up.subList(1)));
        }
        return ans;
    }

}
