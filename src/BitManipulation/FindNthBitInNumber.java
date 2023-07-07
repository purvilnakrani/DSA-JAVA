package BitManipulation;

public class FindNthBitInNumber {
    public static void main(String[] args) {
        int n=5;
        System.out.println(nthBit(10,2));
    }
    static int nthBit(int number,int n){
        return (number&(1<<(n-1))>>(n-1));
    }
}
