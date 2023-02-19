package chatGpt.person;

public class Student extends Person {

    private int id;

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public Student(String name) {
        super(name);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(id);
    }
}
