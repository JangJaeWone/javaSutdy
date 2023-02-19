package et;

import java.util.Scanner;

public class BMI {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();
        double m = sc.nextDouble() / 100;
        double bmi = kg/(m*m);
        String result = "";
        if (25<=bmi){
            result = "비만";
        } else if (23<=bmi) {
            result = "과체중";
        } else if (18.5<=bmi) {
            result = "정상";
        }else{
            result = "저체중";
        }
        System.out.printf("%.2f%n", bmi);
        System.out.println(result);
    }
}
