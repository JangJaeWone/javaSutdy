package oop;

public class 사람 {
    private String 이름;
    private int 나이;
    private String 성별;

    public void print(){
        System.out.println(이름);

        System.out.println(나이);
        System.out.println(성별);
    }
    public void setProfile(String namee,int age,String gender){
        this.나이 = age;
        this.성별 = gender;
        this.이름 = namee;
    }
}
