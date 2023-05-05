package inheritance4;

public class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("Person"+name+" is walking");
    }

    public void eat() {
        System.out.print("Person"+name+" is eating");
    }

    public static void laughing() {
        System.out.print("Person is laughing");
    }
}
