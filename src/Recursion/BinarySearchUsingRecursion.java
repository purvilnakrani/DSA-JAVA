package Recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8};
        int target=4;
        System.out.println(search(nums,target,0,nums.length-1));
    }
    //Recursion solution Only applicable when constrains are small ex 0< n <100,200,..
        static public int search(int[] nums, int target, int s, int e) {
            if(s>e){
                return -1;
            }
            int m=s+(e-s)/2;
            if(target==nums[m])return m;
            if(target<m){
                return search(nums, target,s,m-1);
            }
            return search(nums,target,m+1,e);
        }
}
