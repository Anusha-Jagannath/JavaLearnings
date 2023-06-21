package condtionalstatements;

import java.util.Map;

public class HashMap {

    public static void main(String args[]) {
        System.out.println("Learning hash maps in javva");
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map);
        map.put("two", 30);
        System.out.println(map);
        System.out.println(map.get("three"));
        System.out.println(map.containsKey("one"));
        System.out.println(map.containsValue(1));

        map.remove("one");
        System.out.println(map);
        map.remove("two", 20);
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            entry.setValue(entry.getValue() * 10);
        }

        System.out.println(map);
    }
}
