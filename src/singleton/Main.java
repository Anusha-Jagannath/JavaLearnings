package singleton;

public class Main {


    public static void main(String args[]) {
        System.out.print("Learning singleton classes in java");
        AppConfig obj = AppConfig.getInstance();
        AppConfig obj1 = AppConfig.getInstance();
        AppConfig obj2 = AppConfig.getInstance();

        System.out.print(obj);
        System.out.print(obj1);
        System.out.print(obj2);

    }
}
