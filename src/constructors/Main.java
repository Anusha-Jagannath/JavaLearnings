package constructors;

public class Main {


    public static void main(String args[]) {
        System.out.println("Learning constructors in java");

        Dog husky = new Dog("Husky", "breed");

        Vehicle car = new Vehicle(2);
        Vehicle scooty = new Vehicle(8);


        Vehicle vehicle2 = new Vehicle(2, "pink");
        System.out.print(car.wheels);
        System.out.print(scooty.wheels);
        //husky.name = "Husky";
        //husky.breed = "Husky breed";

    }
}

class Dog {

    String breed;
    String name;

    Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public void jump() {
        System.out.println("The dog is jumping");
    }


    public void description() {
        System.out.println("The dog is " + name + " breed is " + breed);
    }

}

class Vehicle {

    int wheels;
    int headLights;
    String color;


    Vehicle() {
        this.wheels = 2;
    }

    Vehicle(int wheels) {
        this.wheels = wheels;
        headLights = 2;
    }

    Vehicle(int wheels, String color) {
        this.wheels = wheels;
        this.color = color;
    }
}
