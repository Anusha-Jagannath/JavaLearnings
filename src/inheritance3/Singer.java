package inheritance3;

public class Singer extends Person {

    Singer(String name) {
        super(name);
    }

    public void sing() {

        System.out.print("singer"+name+" is singing");

    }
}
