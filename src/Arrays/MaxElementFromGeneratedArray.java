package Arrays;

public class MaxElementFromGeneratedArray {
    public static void main(String[] args) {
        int n=5;
        System.out.println(getMaximumGenerated(n));
    }
    static int getMaximumGenerated(int n) {
        int[] nums=new int[n+1];
        nums[0]=0;
        if(n>0)nums[1]=1;
        for(int i=0;(2*i+1)<=n;i++){
            nums[2*i]=nums[i];
            nums[2*i+1]=nums[i]+nums[i+1];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        return max;
    }
}
