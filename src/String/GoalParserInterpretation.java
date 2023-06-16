package Strings;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String s = "G()(al)";
        System.out.println(interpret(s));
    }

    static public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                sb.append('G');
            } else if (i + 1 < command.length() && command.charAt(i + 1) == ')') {
                sb.append('o');
                i++;
            } else {
                sb.append("al");
                i = i + 3;
            }
        }
        return sb.toString();
    }
    //       6% fasterss
//    static public String interpret(String command) {
//         return command.replaceAll("\\(\\)","o").replaceAll("\\(al\\)","al");
//              }
}
