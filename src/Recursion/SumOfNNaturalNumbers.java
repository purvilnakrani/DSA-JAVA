package Recursion;
import java.util.*;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfN(n));
    }

    static int sumOfN(int n) {
        if (n == 1) return n;
        return n + sumOfN(n - 1);
    }
}
