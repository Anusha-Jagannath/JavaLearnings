package abstraction1;

public class Main {

    public static void repairCar(Wagnor wagnor) {
        System.out.print("wagnor is repaired");
    }

    public static void repairCar(Audi audi) {
        System.out.print("audi is repaired");
    }

    public static void main(String args[]) {
        System.out.println("learning abstraction");
        Wagnor wagnor = new Wagnor();
        Audi audi = new Audi();

        repairCar(audi);
        repairCar(wagnor);

    }
}
