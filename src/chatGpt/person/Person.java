package chatGpt.person;

public class Person {
    private String name;
    private int age;

    public Person (String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person (String name){
        this.name = name;
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }

}
