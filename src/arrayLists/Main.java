package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning Array Lists");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("moosambi");
        System.out.println(fruits);


        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(12);
        marks.add(12);

        ArrayList<Pair> pairList = new ArrayList<>();
        pairList.add(new Pair(12,23));
        pairList.add(new Pair(13,45));
        pairList.add(new Pair(14,90));

        System.out.println(pairList);

        List<String> vegetable = new ArrayList<>();
        vegetable.add("ghjk");
        vegetable.add("hyui");

        System.out.println(vegetable.set(1,"yuio"));

        fruits.clear();
        System.out.println(fruits);

        List<String> toRemove = new ArrayList<>();
        toRemove.add("iop");
        toRemove.add("uiop");
        vegetable.removeAll(toRemove);
        System.out.println(vegetable);

        System.out.println(vegetable.contains("iop"));

        Object x[] = fruits.toArray();

        String temp[] = new String[fruits.size()];
        fruits.toArray(temp);


    }
}
