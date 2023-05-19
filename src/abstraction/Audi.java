package abstraction;

public class Audi extends Car{

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.print("audi is cclerate");
    }

    @Override
    public void braking() {
        super.braking();
        System.out.print("audi is brakingg");
    }
}
