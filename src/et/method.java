package et;

import java.util.Scanner;

public class method {
    public static int plus(int n){
        return n+n;
    }
    public static int minus(int n){
        return n-n;
    }
    public static int nn(int n){
        return n*n;
    }
    public static int nnnn(int n){
        return n/n;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        System.out.println(plus(n));
        System.out.println(minus(n));
        System.out.println(nn(n));
        System.out.println(nnnn(n));
    }

}
