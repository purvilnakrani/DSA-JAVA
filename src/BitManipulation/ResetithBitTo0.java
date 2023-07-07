package BitManipulation;

public class ResetithBitTo0 {
    public static void main(String[] args) {
        System.out.println(resetbit(10, 3));
    }

    static int resetbit(int number, int n) {
        return number & (~(1 << (n - 1)));
    }
}
