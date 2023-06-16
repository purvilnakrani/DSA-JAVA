package Strings;

public class ReverseTheString {
    public static void main(String[] args) {
        char[] ch = new char[]{'P', 'u', 'r', 'v', 'i', 'l'};
        reverseString(ch);
        System.out.print(ch);
    }

    static public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }
}
