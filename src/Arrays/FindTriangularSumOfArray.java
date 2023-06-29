package Arrays;

public class FindTriangularSumOfArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(triangularSum(nums));
    }
    static int triangularSum(int[] nums) {
        int length=nums.length;
        while(length>0){
            for(int i=0; i<length-1; i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
            if(nums.length==1)return nums[0];
            length--;
        }
        return nums[0];
    }
}
