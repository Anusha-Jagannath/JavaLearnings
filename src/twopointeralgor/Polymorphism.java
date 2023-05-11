package twopointeralgor;

public class Polymorphism {

    public static void main(String args[]) {
        System.out.print("Learning polymorphism");
        Dog d = new Dog();
        Pet p = d;
        Animal a = d;

        d.walk();
        d.walk();
        System.out.print(d.name);
        System.out.print(p.name);
    }

    public void greetings() {
        System.out.print("Hi there is");
    }

    public void greetings(String greet) {
        System.out.print("Hi " + greet);
    }

    public static void greetings(String greetings, int count) {
        for(int i=0;i<count;i++) {
            System.out.print(greetings);
        }
    }
}
