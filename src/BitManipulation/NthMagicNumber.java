package BitManipulation;

public class NthMagicNumber {
    public static void main(String[] args) {
        int N = 6;
        System.out.println(nthMagic(N, 1));
    }

    static int nthMagic(int n, int power) {
        if (n < 1) return 0;
        return ((n & 1) * (int) (Math.pow(5, power)) + nthMagic(n >> 1, power + 1));
    }
}
