package binarynumbersystems;

import java.util.Map;

public class HashMap {

    public static void main(String args[]) {
        System.out.println("Learning hashmap in java");
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map);
        map.put("one", 10);
        System.out.println(map);
        map.remove("two");

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        String s[] = {"act", "tac", "mac"};
        for (int i = 0; i < s.length; i++) {
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
