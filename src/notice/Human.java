package notice;

import java.util.Scanner;

public class Human {
    private String name;
    private int age;
    private String gender;

    private Human(){};

    public Human(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }
}
