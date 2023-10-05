package Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(shuffle(nums, 3));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int j = 0;
        int k = n;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[j];
                j++;
            } else {
                ans[i] = nums[k];
                k++;
            }
        }
        return ans;
    }
}
