package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={0,1,3};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        int sum1=0;
        for(int n:nums){
            sum1+=n;
        }
        int sum2=0;
        for(int i=nums.length; i>0; i--){
            sum2+=i;
        }
        return sum2-sum1;
    }
}
