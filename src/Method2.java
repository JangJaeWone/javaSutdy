import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String s = a.next();

        System.out.println(aaa(s));
    }
    public static String aaa(String a){
        return a+a;
    }
}
