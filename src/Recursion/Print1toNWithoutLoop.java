package Recursion;

public class Print1toNWithoutLoop {
    public static void main(String[] args) {
       printNumbers(5);
    }

        static void printNumbers(int n)
        {
            if(n<=0)
            {
                return;
            }
            else
            {
                // Recursively call printNumbers
                printNumbers(n-1);
                // Print number while returning from recursion
                System.out.print(" "+n);
            }
        }
}
