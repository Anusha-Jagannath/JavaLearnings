package june15;

import java.util.HashSet;
import java.util.Set;

public class Hashcode {

    public static void main(String args[]) {
        System.out.println("Learning hashcode and equals method in java");
        Pen p1 = new Pen("blue",2);

        Pen p2 = new Pen("blue",2);

        Set<Pen> pens = new HashSet<>();
        pens.add(p1);
        pens.add(p2);

        System.out.println(pens);

    }
}
