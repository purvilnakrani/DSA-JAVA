package Strings;

public class RobotReturntoOrigin {
    public static void main(String[] args) {
        String s = "UDRL";
        System.out.println(judgeCircle(s));
    }

    static public boolean judgeCircle(String moves) {
        if (moves.length() % 2 != 0) return false;
        char[] ch = moves.toCharArray();
        int x = 0;
        int y = 0;
        for (char c : ch) {
            if (c == 'U') y++;
            if (c == 'D') y--;
            if (c == 'R') x++;
            if (c == 'L') x--;
        }
        return x == 0 && y == 0;
    }
}
