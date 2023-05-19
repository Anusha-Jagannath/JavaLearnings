package polymorphism;

public class Main {

    public static void main(String args[]) {
        System.out.print("learning polymorphism");

        Dog d = new Dog();
        Pet pet = d;
        Animal a = d;

        d.walk();
        pet.walk();

        greetings();
        greetings(5);
        greetings("Hi");
        System.out.print(d.name);
        System.out.print(pet.name);

    }


    public static void greetings() {
        System.out.print("Hi there");
    }

    public static void greetings(String greet) {
        System.out.print("Hi " + greet);
    }

    public static void greetings(int position) {
        for (int i = 0; i < position; i++) {
            System.out.print("Hi");
        }
    }
}
