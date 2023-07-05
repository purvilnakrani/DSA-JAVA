package Maths;

public class IsPowerOfThree {
    public static void main(String[] args) {
        int n=8;
        System.out.println(isPowerOfThree(n));
    }
    static boolean isPowerOfThree(int n) {

        if(n==1)return true;
        if(n==0)return false;
        if(n%3!=0)return false;
        return isPowerOfThree(n/3);
    }
}
