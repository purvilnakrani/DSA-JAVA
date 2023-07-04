package Recursion;

public class LengthOfString {
    public static void main(String[] args) {
        String s="purvil";
        System.out.println(findLength("",s,0));
    }
    static int findLength(String p, String up, int length){
        if(up.isEmpty())return length;
        char ch=up.charAt(0);
        return findLength(""+ch,up.substring(1),length+1);
    }
}
