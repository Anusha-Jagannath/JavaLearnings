package methodslearn;

public class PassByValue {

    public static void main(String args[]) {
        System.out.print("learning pass by value");
        int a = 2;
        int b= 3;
        swap(a,b);
        System.out.print(a+" "+b);

        Dog d = new Dog();
        d.legs = 3;

        Dog d1 = new Dog();
        d1.legs = 4;

        swap(d,d1);

        changeLeg(d1);
        System.out.print(d1.legs);


    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }


    private static void swap(Dog a, Dog b) {
        Dog temp = a;
        a=b;
        b=temp;
    }

    private static void changeLeg(Dog a) {
        a.legs = 5;
    }
}

class Dog {

    int legs;

}
