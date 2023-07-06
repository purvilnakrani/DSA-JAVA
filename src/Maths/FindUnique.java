package Maths;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,6,3,1};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
