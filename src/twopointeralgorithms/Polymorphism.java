package twopointeralgorithms;

public class Polymorphism {

    public static void main(String args[]) {
        System.out.println("Learning polymorphism");
        Dog d = new Dog();
        Pet p = d;
        Animal a = d;

        System.out.print(d.name);
        System.out.print(p.name);
        d.walk();
        p.walk();
        greetings();
        greetings("kl");
        greetings("kl",5);
    }

    private static void greetings() {
        System.out.print("Hi therre how are you");
    }

    private static void greetings(String greet) {
        System.out.print("Hi theere"+greet);
    }

    private static void greetings(String greet,int n) {
        for(int i=0;i<n;i++) {
            System.out.print(greet);
        }
    }
}
