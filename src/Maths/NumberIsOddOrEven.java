package Maths;

public class NumberIsOddOrEven {
    public static void main(String[] args) {
        int n=5;
        System.out.println(OddEven(n));
    }
    static String OddEven(int n){
        return ((n&1)==1)?"Odd":"Even";
    }
}
