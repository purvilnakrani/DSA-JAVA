package Maths;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        int n=8;
        System.out.println(isPowerOfTwo(n));
    }
    static boolean isPowerOfTwo(int n) {
        // if (n==1) return true;
        // if(n%3==1) return false;
        // if(n%3==0)return false;
        // return true;

        // // sol2
        // while(n/2>0){
        //     if(n==0)return false;
        //     if(n==1)return true;
        //     if((n/2)%2!=0)return false;
        //     n=n/2;
        // }
        // return true;

        if(n==1)return true;
        if(n==0)return false;
        if(n%2!=0)return false;
        return isPowerOfTwo(n/2);
    }
}
