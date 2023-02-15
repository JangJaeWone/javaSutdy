import java.util.Scanner;

public class tes5 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String s = a.next();
        String d = a.next();
        if(s.equals("qwer")){
            if (d.equals("asdf")){
                System.out.println("aaa");
            }else {
                System.out.println("bbb");
            }
        }else {
            System.out.println("ddd");
        }
    }
}
