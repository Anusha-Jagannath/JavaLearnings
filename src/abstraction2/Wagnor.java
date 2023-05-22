package abstraction2;

public class Wagnor extends Car{


    @Override
    public void accelerate() {
        super.accelerate();
        System.out.print("Wagnor is accelerating");
    }


    @Override
    public void braking() {
        super.braking();
        System.out.print("The wagnor is braking");
    }
}
