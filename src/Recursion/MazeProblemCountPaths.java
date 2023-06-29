package Recursion;

//
public class MazeProblemCountPaths {
    public static void main(String[] args) {
        System.out.println(countPaths(3, 2));
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
