package Arrays;

import java.util.*;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 3, 1, -2, 1, 1};
        System.out.println(uniqueOccurrences(arr));
    }

    static boolean uniqueOccurrences(int[] arr) {
        int[] ans = new int[2000];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) ans[0]++;
            if (arr[i] < 0) {
                ans[(-1 * arr[i])]++;
            } else if (arr[i] > 0) {
                ans[1000 + (arr[i])]++;
            }
        }
        Arrays.sort(ans);
        for (int i = 0; i < ans.length - 1; i++) {
            if (ans[i] == 0) continue;
            if (ans[i] == ans[i + 1]) return false;
        }
        return true;
    }
}
