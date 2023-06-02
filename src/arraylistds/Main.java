package arraylistds;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning array lis data structure");

        int a[] = new int[10];
        ArrayList<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("fruit");
        System.out.println(fruits);

        ArrayList<Pair> pairList = new ArrayList<>();
        pairList.add(new Pair("anush",5));
        pairList.add(new Pair("yuio",7));
        pairList.add(new Pair("yuiop",4));

        for (Pair p : pairList) {
           // System.out.println(p.getDescription());
        }

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("tomatoes");
        vegetables.add("egg");
        vegetables.add("kliop");

        System.out.println(vegetables.get(8));
        fruits.clear();
        System.out.println(fruits);

        System.out.println(fruits.size());

        System.out.println(fruits.contains("kliop"));

        for(String s : fruits) {
            System.out.println(s);
        }
    }
}
