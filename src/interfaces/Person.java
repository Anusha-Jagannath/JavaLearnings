package interfaces;

public class Person implements Student, Youtuber, VideoEditor {

    public static void main(String args[]) {
        System.out.println("Learning interfaces");
        Person p = new Person();
        p.study();
        p.makeVideo();
        p.editVideo();


    }

    @Override
    public void study() {
        System.out.println("Learning student");
    }

    @Override
    public void makeVideo() {
        System.out.println("Person is making video");
    }

    @Override
    public void editVideo() {

    }
}

