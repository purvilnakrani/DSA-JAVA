package Recursion;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        System.out.println(primeOrNot(29));
    }
    static boolean primeOrNot(int n){
        if(n%2==0)return false;
        if(n%3==0)return false;
        if(n%5==0)return false;
        if(n%7==0)return false;
        return true;
    }
}
