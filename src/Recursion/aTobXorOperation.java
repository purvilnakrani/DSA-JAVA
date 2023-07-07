package Recursion;

public class aTobXorOperation {
    public static void main(String[] args) {
        System.out.println(aTob(3,9));
    }
    static int aTob(int a,int b){
        if(a==b){
            return 0;
        }
        return a^aTob(a+1,b);
    }
}
