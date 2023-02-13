package oop;

public class Car {
    private String 바퀴;
    private String 엔진;
    private String 색;

    public void print(){
        System.out.println(바퀴);
        System.out.println(엔진);
        System.out.println(색);
    }
    public void start(){
        System.out.println("시동");
    }
    public void setCar(String 바퀴,String 엔진,String 색){
        this.바퀴 =바퀴;
        this.엔진 =엔진;
        this.색=색;
    }
}

