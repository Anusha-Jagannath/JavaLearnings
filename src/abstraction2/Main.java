package abstraction2;



public class Main {


    private static void repairCar(Car car) {
        System.out.print(car + " is repairing");
    }

    public static void main(String args[]) {
        System.out.print("Learning abstraction");
        Wagnor car1 = new Wagnor();
        repairCar(car1);

        Audi audi = new Audi();
        repairCar(audi);
    }
}
