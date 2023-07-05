package Maths;

public class NumberOfStepsToReduceNumberToZero {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(numberOfSteps(n));
    }

    static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
                count++;
            } else {
                num = num - 1;
                count++;
            }
        }
        return count;
    }
}
