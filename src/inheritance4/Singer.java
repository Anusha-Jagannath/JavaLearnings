package inheritance4;

public class Singer extends Person {

    public Singer(String name) {
        super(name);
        System.out.print("Singer is constructor");
    }

    public void sing() {
        System.out.print("Singer is singing");
    }

    public void eat() {
        System.out.println("Singer"+name+"is eating");
    }

   public static void laughing() {
        System.out.print("Singer is laughing");
   }
}
