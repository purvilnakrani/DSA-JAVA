package Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 0, 2};
        System.out.println(func(nums));
    }

    static int[] func(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
