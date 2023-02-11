import java.util.Random;
import java.util.Scanner;

public class RPS {

    static String[] arr = new String[]{"", "가위", "바위", "보"};

    static String getMyRps() {
        Scanner sc = new Scanner(System.in);
        String my = arr[sc.nextInt()];
        return my;
    }

    static String getComRps() {
        Random random = new Random();
        String com = arr[random.nextInt(1, 4)];
        return com;
    }

    static void print(String my, String com) {
        System.out.println("나 : " + my);
        System.out.println("컴퓨터 : " + com);

        if (my.equals("가위") && com.equals("가위") || my.equals("바위") && com.equals("바위") || my.equals("보") && com.equals("보")) {
            System.out.println("무승부");
        } else if (my.equals("가위") && com.equals("바위") || my.equals("바위") && com.equals("보") || my.equals("보") && com.equals("가위")) {
            System.out.println("컴퓨터승");
        } else if (my.equals("가위") && com.equals("보") || my.equals("바위") && com.equals("가위") || my.equals("보") && com.equals("바위")) {
            System.out.println("나승");
        }
    }

    public static void main(String[] args) {
        String my = getMyRps();

        String com = getComRps();

        print(my,com);
    }
}
