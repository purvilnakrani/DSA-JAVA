package Recursion;

public class MaxOfArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr={7,9,9,0,7,4,3,9,6,7};
        System.out.println(findMax(arr,0));
    }
    static int findMax(int[] arr, int index){
        if(index==arr.length-1){
            return arr[index];
        }
        return Math.max(arr[index],findMax(arr,index+1));
    }
}
