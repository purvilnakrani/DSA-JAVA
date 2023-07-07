package Arrays;

import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList();
        if (numRows <= 0) return ans;
        if (numRows == 1) {
            List<Integer> firstRow = new ArrayList();
            firstRow.add(1);
            ans.add(firstRow);
            return ans;
        }
        if (numRows >= 2) {
            List<Integer> firstRow = new ArrayList();
            firstRow.add(1);
            ans.add(firstRow);
            List<Integer> secondRow = new ArrayList();
            secondRow.add(1);
            secondRow.add(1);
            ans.add(secondRow);
        }
        for (int row = 2; row < numRows; row++) {
            List<Integer> temp = new ArrayList();
            for (int column = 0; column <= row; column++) {
                if (column == 0 || column == row) {
                    temp.add(1);
                } else {
                    temp.add((ans.get(row - 1).get(column - 1)) + (ans.get(row - 1).get(column)));
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
