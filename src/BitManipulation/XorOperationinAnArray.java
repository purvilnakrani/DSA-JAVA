package BitManipulation;

public class XorOperationinAnArray {
    public static void main(String[] args) {
        int n = 10;
        int start = 3;
        System.out.println(xorOperation(n, start));
    }

    static int xorOperation(int n, int start) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + 2 * i;
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
