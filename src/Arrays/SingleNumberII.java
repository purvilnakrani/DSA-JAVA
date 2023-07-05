package Arrays;
import java.util.*;
public class SingleNumberII {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,3,3,4,4,4};
        System.out.println(singleNumber(arr));
    }
    static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums.length==1)return nums[0];
            if(i==nums.length-1 && nums.length>1){
                if(nums[i]!=nums[i-1]){return nums[i];}
            }
            if(i==0 && nums.length>1){
                if(nums[i]!=nums[i+1]){return nums[i];}
            }
            if(i>0){
                if((nums[i]!=nums[i-1] && nums[i]!=nums[i+1])){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
