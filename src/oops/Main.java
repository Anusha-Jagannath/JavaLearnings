package oops;


class Cat {
    boolean hasFur;
    String color;
    String breed;
    int legs, eyes;

    public void walk() {
        System.out.println("The cat is walking");
    }

    public void eat() {
        System.out.println("The cat is eating");
    }

}

class Dog {
    String breed, name;

    public void jump() {
        System.out.println("The dog is jumping");
    }

    public void description() {
        System.out.println("The dog is "+breed+"name is "+name);
    }

}
public class Main {

    public static void main(String args[]) {
        System.out.println("Learning object oriented programming language");
        Cat cat = new Cat();
        cat.eat();
        cat.walk();

        Dog dog = new Dog();
        dog.breed = "doggy";
        dog.name = "dog name";

        dog.description();

    }
}
