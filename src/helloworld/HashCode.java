package helloworld;

import java.util.HashSet;
import java.util.Set;

public class HashCode {
    public static void main(String args[]) {
        System.out.println("Learning hashcode and equals");
        Pen pen1 = new Pen(10,"glue");
        Pen pen2 = new Pen(10,"glue");
        System.out.println(pen1 == pen2);
        System.out.println(pen1.equals(pen2));

        Set<Pen> sets = new HashSet<>();
        sets.add(pen1);
        sets.add(pen2);

        System.out.println(sets);
    }
}
