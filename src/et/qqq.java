package et;

import java.util.Scanner;

public class qqq {
    public static String a(int b,int c){
        String out = "";
        for (int i=b; i<c; i++){
            System.out.println(i);
        }
        return out;
    }
    public static void main(String[] args) {
       String ret = a(1,5);
        System.out.println(ret);
    }
}
