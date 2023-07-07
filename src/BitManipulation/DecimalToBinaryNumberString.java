package BitManipulation;

public class DecimalToBinaryNumberString {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(decimalToBinary(n));
    }

    static String decimalToBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n >= 1) {
            if (n < 2) {
                sb.append("" + n);
                break;
            } else {
                sb.append("" + (n % (n / 2)));
                n = n / 2;
            }
        }
        return sb.reverse().toString();
    }
}
