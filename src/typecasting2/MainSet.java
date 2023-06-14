package typecasting2;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String args[]) {
        System.out.println("Learning java hashcode and equals");
        Pen p1 = new Pen("blue",2);
        Pen p2 = new Pen("blue",2);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        Set<Pen> pen = new HashSet<>();
        pen.add(p1);
        pen.add(p2);

        System.out.println(pen);
    }
}
