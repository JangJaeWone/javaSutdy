package chatGpt.student;

public class Student {
    private String name;
    private int age;
    private int score;
    public Student(String name,int age,int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public void setScore(int score){
        this.score = score;
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
    }
}
