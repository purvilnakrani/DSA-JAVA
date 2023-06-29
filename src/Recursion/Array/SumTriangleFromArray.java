package Recursion.Array;
import java.util.*;
public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
//        sumTriangle(nums);


        while(nums.length>
                0){
            int[] temp = new int[nums.length-1];
            for(int i=0;i<nums.length-1;i++){
                temp[i]=nums[i]+nums[i+1];
            }
            System.out.println(Arrays.toString(nums));
            nums=temp;
        }
    }
    static void sumTriangle(int[] arr){
        if(arr.length<1){
            return;
        }
        int[] temp=new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }
        sumTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }


    }