package BitManipulation;

public class ConvertToBaseMinus2 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(baseNeg2(n));
    }

    static String base2(int N) {
        StringBuilder res = new StringBuilder();
        while (N != 0) {
            res.append(N & 1);
            N = N >> 1;
        }
        return res.length() > 0 ? res.reverse().toString() : "0";
    }

    static String baseNeg2(int N) {
        StringBuilder res = new StringBuilder();
        while (N != 0) {
            res.append(N & 1);
            N = -(N >> 1);
        }
        return res.length() > 0 ? res.reverse().toString() : "0";
    }
}
