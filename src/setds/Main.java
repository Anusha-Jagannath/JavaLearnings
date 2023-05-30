package setds;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning array list");
        int a[] = new int[5];

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pineapple");

        ArrayList<Integer> marks = new ArrayList<>();

        Pair<String, Integer> pair1 = new Pair<>("abc", 1);
        Pair<Boolean, String> pair2 = new Pair<>(true, "one");
        pair1.getDescription();


        String tem[] = new String[fruits.size()];
        ArrayList<String> fruit = new ArrayList<>();
        fruit.addAll(fruits);

        for (String s: fruits) {
            System.out.println(s);
        }




    }
}
