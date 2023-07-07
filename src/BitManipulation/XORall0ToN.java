package BitManipulation;

public class XORall0ToN {
    public static void main(String[] args) {
        int N = 8;
        System.out.println(xorAll(N));
    }

    static int xorAll(int n) {
        if (n % 4 == 0) {
            return n;
        } else if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else {
            return 0;
        }
    }
}
