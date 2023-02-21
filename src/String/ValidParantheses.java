package String;

import java.util.Stack;

public class ValidParantheses {
    public static boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else {
                if (stack.isEmpty()) return false;
                if (c == ')' && stack.peek() != '(') return false;
                if (c == '}' && stack.peek() != '{') return false;
                if (c == ']' && stack.peek() != '[') return false;
                stack.pop();
            }
        }
        // for(int i=ch.length-1; i>=0; i--){ //error for ([)]
        //     if(ch[i]==')' || ch[i]=='}' || ch[i]==']'){
        //     if(stack.isEmpty())return false;
        //     if(ch[i]==')' && stack.peek()!='(')return false;
        //     if(ch[i]=='}' && stack.peek()!='{')return false;
        //     if(ch[i]==']' && stack.peek()!='[')return false;
        //     stack.pop();
        // }
        // }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(){}[]";
        System.out.println(isValid(s));
    }
}
