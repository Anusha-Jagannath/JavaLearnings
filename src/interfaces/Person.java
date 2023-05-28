package interfaces;

public class Person implements Student, Youtuber {

    public static void main(String args[]) {
        System.out.println("Learning interface in java");
        Person person = new Person();

        person.study();
        person.makeVideo();
    }

    @Override
    public void study() {
        System.out.println("Person is studying");
    }

    @Override
    public void makeVideo() {
        System.out.println("Person is making video");
    }

    @Override
    public void editVideo() {
        System.out.println("Person is editing video");
    }
}
