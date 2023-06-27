package Recursions;

import java.util.*;

public class PathToReachEndOfMatrix {
    public static void main(String[] args) {
        path("",3,3);
        System.out.println(pathReturn("",3,4));
        System.out.println(countPaths(3, 2));
    }
//    ### Print all paths  ###
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + "D", r - 1, c);
        }
        if (c > 1) {
            path(p + "R", r, c - 1);
        }
    }
//    ### return all paths as arraylist ###
    static ArrayList<String> pathReturn(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList();
            list.add(p);
            return list;
//            return new ArrayList<String>(p);
        }
        ArrayList<String> ans = new ArrayList<>(0);
        if (r > 1) ans.addAll(pathReturn(p + "D", r - 1, c));
        if (c > 1) ans.addAll(pathReturn(p + "R", r, c - 1));
        return ans;
    }

//    ### return count of paths ###
    static int countPaths(int m, int n) {
        if (m == 1 || n == 1) {  //&& not woork
            return 1;
        }

        int down = countPaths(m - 1, n);
        int right = countPaths(m, n - 1);

        return down + right;
    }
}
