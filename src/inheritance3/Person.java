package inheritance3;

public class Person {

    String name;


    Person(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.print("person is walking");
    }

    public void eat() {
        System.out.print("person is eating");
    }

    public static void laughing() {
        System.out.print("person is laughing");
    }
}
