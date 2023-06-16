package Strings;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "purvil";
        int[] arr = new int[]{2, 3, 1, 4, 0, 5};
        System.out.println(restoreString(s, arr));
    }

    static public String restoreString(String s, int[] indices) {
        char[] c = new char[s.length()];
        for (int i = 0; i < c.length; i++) {
            c[indices[i]] = s.charAt(i);
        }
        return new String(c);
    }
}
