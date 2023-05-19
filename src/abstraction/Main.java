package abstraction;

public class Main {


    public static void repairCar(Wagnor wagnor) {
        System.out.print("wagnor is repaired");
    }

    public static void repairCar(Audi audi) {
        System.out.print("audi is reapaired");
    }



    public static void main(String args[]) {
        System.out.println("Learning abstraction");

        Wagnor wagnor = new Wagnor();
        repairCar(wagnor);

        wagnor.accelerate();
        wagnor.braking();

        Audi audi = new Audi();
        repairCar(audi);
        audi.accelerate();
        audi.braking();

    }
}
