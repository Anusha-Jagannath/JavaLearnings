package inheritance1;

public class Singer extends Person {


    public Singer(String name) {
        super(name);
    }
    public void sing() {
        System.out.print("singer is singing");
    }
}
