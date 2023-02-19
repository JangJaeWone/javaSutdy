package bmi;

import java.util.Scanner;

public class Bmi {

    int kg;
    double m;
    double bmi;
    String result;

    public void scanBmi(){
        Scanner sc = new Scanner(System.in);

        kg = sc.nextInt();
        m = sc.nextDouble() / 100;
    }

    public void calculate(){
        this.bmi =  kg/ (m*m);

        if (25<=bmi){
            result = "비만";
        } else if (23<=bmi) {
            result = "과체중";
        } else if (18.5<=bmi) {
            result = "정상";
        }else{
            result = "저체중";
        }
    }

    public void print(){
        System.out.printf("%.2f\n", bmi);
        System.out.println(result);
    }
}
