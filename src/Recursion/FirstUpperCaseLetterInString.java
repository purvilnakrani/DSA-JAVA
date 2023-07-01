package Recursion;

public class FirstUpperCaseLetterInString {
    public static void main(String[] args) {
        String s="purVil";
        System.out.println(firstUppercase(s,0));
    }
    static String firstUppercase(String s,int index){
        if(index>s.length()){
            return "";
        }
        if(s.charAt(index)>=65 && s.charAt(index)<=90){
            return String.valueOf((s.charAt(index)));
        }
        return firstUppercase(s,index+1);
    }

}
