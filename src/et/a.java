package et;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= s - i; j++) {
                System.out.print(" ");
            }
            for (int q = 1; q <= i; q++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}