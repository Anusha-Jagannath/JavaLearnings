package methods;

public class PassByValue {

    public static void main(String args[]) {
        System.out.print("Learning pass by value ");
        int a = 2;
        int b = 3;
        //swap(a, b);

//        Dog c = new Dog();
//        c.legs = 2;
//
//        Dog d = new Dog();
//        d.legs = 3;

        //swap(c, d);

        Dog a1 = new Dog();
        a1.legs = 3;
        changeDog(a1);
        System.out.print(a1.legs);


        //System.out.print(c.legs + " " + d.legs);
        //System.out.print(a + " " + b);
    }


    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }

    private static void swap(Dog a, Dog b) {
        Dog temp = a;
        a = b;
        b = temp;
    }

    private static void changeDog(Dog dog) {
        dog.legs = 6;
    }
}


class Dog {

    int legs;


}