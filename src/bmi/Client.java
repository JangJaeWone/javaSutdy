package bmi;

public class Client {

    public static void main(String[] args) {
        Bmi bmi = new Bmi();

        bmi.scanBmi();

        bmi.calculate();

        bmi.print();
    }
}
