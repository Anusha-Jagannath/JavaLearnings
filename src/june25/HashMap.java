package june25;

import java.util.Map;

public class HashMap {

    public static void main(String args[]) {
        System.out.println("Learning hashmap in java");
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("one", 10);

        map.putIfAbsent("one", 20);

        System.out.println(map);
        System.out.println(map.get("one"));
        System.out.println(map.containsKey("one"));
        System.out.println(map.containsValue(1));

        map.remove("one");
        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            entry.setValue(entry.getValue() * 10);
        }

        System.out.println(map);

        String s[] = {"act", "jkl", "iop"};
        for (String s2 : s) {
            System.out.println(getHashCode(s2));
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
