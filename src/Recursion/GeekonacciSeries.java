package Recursion;

public class GeekonacciSeries {
    public static void main(String[] args) {
        System.out.println(helper(6,1,3,2));
    }
   static int helper(int n,int A, int B, int C ){
        if(n==1)return A;
        if(n==2)return B;
        if(n==3)return C;
       return helper(n - 1, A, B, C) + helper(n - 2, A, B, C) + helper(n - 3, A, B, C);

    }
}
