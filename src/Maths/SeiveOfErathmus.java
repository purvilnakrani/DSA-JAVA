package Maths;

public class SeiveOfErathmus {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(countPrimes(n));
    }

    static int countPrimes(int n) {
        boolean[] composites = new boolean[n];
        if (n <= 2) return 0;
        int limit = (int) (Math.sqrt(n));

        for (int i = 2; i <= limit; i++) {
            if (composites[i] == false) {
                for (int j = i * i; j < n; j += i) {
                    composites[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (composites[i] == false) {
                count++;
            }
        }
        return count;
    }
}
