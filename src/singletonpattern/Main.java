package singletonpattern;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning singleton pattern");

        AppConfig obj = AppConfig.getInstance();
        AppConfig obj2 = AppConfig.getInstance();

        System.out.print(obj);
        System.out.print(obj2);
    }
}
