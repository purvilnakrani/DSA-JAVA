package String;
public class Palindrome_String {

    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }

    static public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
