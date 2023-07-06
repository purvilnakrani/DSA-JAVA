package Maths;

public class SetithBitTo1 {
    public static void main(String[] args) {
        System.out.println(setBit(10, 2));
    }

    static int setBit(int number, int n) {
//        return ((number|(1<<n-1))>>(n-1));
        return ((1 << n) | number);
    }
}
