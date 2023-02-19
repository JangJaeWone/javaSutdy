package chatGpt.person;

public class Main {

    public static void main(String[] args) {
        Person a = new Person("장재민", 21);
        Person b = new Person("장재수", 26);
        Student c = new Student("장재원", 23, 3);

        a.printInfo();
        b.printInfo();
        c.printInfo();
    }
}
