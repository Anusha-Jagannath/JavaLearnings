package june24learn;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static void main(String args[]) {
        System.out.println("Learning hash map in java");
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map);

        map.putIfAbsent("one", 20);

        System.out.println(map);
        map.putIfAbsent("four", 4);
        System.out.println(map);

        System.out.println(map.containsKey("one"));
        System.out.println(map.containsValue(3));

        map.replace("one", 2);
        System.out.println(map);
        System.out.println(map.keySet());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.setValue(entry.getValue() * 10);
        }

        System.out.println(map);

        String s[] = {"cat", "ball", "mat"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
            System.out.println(getHashCode(s[i]));
        }
    }


    private static int getHashCode(String s) {
        int hash = 0;
        for (int i = 0; i < s.length(); i++) {
            hash = hash + s.charAt(i);
        }
        return hash;
    }
}
