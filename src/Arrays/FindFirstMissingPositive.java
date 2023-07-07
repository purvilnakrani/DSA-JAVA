package Arrays;

import java.util.*;

public class FindFirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {-5, 0, 1, 4, 5, 6};
        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int positive = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            // if(nums[i]>=0){
            //     if(i==nums.length-1)return nums[i]+1;
            //     if(nums[i+1]-nums[i]!=1){
            //         return nums[i]+1;
            //     }
            if (nums[i] > 0) {
                positive = i;
                break;
            }
        }
        int element = 1;
        if (nums.length == 1) {
            if (nums[0] > 1 || nums[0] <= 0) {
                return 1;
            }
        }
        for (int i = positive; i < nums.length; i++) {
            if (nums[i] != element) {
                if (i > 0 && nums[i] != nums[i - 1]) {
                    return element;
                }
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                if (i == 0 && nums[i] != element) {
                    return 1;
                }
            } else if (i == nums.length - 1) {
                return nums[i] + 1;
            } else {
                element = element + 1;
            }
        }
        return nums[nums.length - 1] + 1;
    }
}
