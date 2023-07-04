package Recursion;

public class ReverseStringUsinRecursion {
    public static void main(String[] args) {
        char[] s = {'p', 'u', 'r', 'v', 'i', 'l' };
        System.out.println(helper(s, 0, s.length - 1));
    }

    static char[] helper(char[] s, int i, int j) {
        if (i > j) {
            return s;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        return helper(s, i + 1, j - 1);
    }
}
