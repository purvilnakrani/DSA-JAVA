package String;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
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
//    public static boolean isPalindrome(String s) {
//
//        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
//
//        String rev = new StringBuffer(actual).reverse().toString();
//
//        return actual.equals(rev);
//
//    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
//"A man, a plan, a canal: Panama"