package String;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        char[] ch = s.trim().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] != ' ') {
                sb.append(ch[i]);
            } else {
                break;
            }
        }
        return sb.length();
    }

    public static void main(String[] args) {
        String s = "   Hello my name is Purvil  ";
        System.out.println(lengthOfLastWord(s));
    }
}
