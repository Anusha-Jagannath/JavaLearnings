package inheritance1;

public class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.print("person is "+name+" walking");
    }

    public void eat(){
        System.out.print("person is "+name+" eating");
    }

    static public void laugh() {
        System.out.print("person is laughing");
    }
}
