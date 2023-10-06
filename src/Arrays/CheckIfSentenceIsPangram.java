package Arrays;

public class CheckIfSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "kgfvbxcvjdfkjebgkbvkvkbkds";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence) {
        int[] temp = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            temp[sentence.charAt(i) - 97] = 1;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 1) return false;
        }
        return true;
    }

}
