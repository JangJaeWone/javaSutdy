package et;

public class ARRAY {

    public static void main(String[] args) {
        String[][] a = new String[4][2];
        a[0] = new String[]{"et.a", "1"};
        a[1] = new String[]{"et.b", "2"};
        a[2] = new String[]{"et.c", "3"};
        a[3] = new String[]{"et.d", "4"};

        System.out.println(a[0][0]);
        System.out.println(a[0][1]);
        System.out.println(a[1][0]);
        System.out.println(a[1][1]);
        System.out.println(a[2][0]);
        System.out.println(a[2][1]);
        System.out.println(a[3][0]);
        System.out.println(a[3][1]);


    }
}
