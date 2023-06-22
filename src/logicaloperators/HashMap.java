package logicaloperators;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMap {

    public static void main(String args[]) {
        System.out.println("Learning hashmap");
        Map<String, Integer> map = new java.util.HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.get("one");
        System.out.println(map.get("one"));
        System.out.println(map.containsKey("one"));
        System.out.println(map.containsValue(3));
        map.remove("two");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.setValue(entry.getValue()*10);
        }

        System.out.println(map);

        String s[] = {"act", "tac", "jkl", "iop"};
        System.out.println(groupAnagrams(s));

    }

    private static List<List<String>> groupAnagrams(String strs[]) {
        java.util.HashMap<String, List<String>> map = new java.util.HashMap<>();
        for (String s : strs) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String sortedString = new String(c);
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new LinkedList<>());
            }

            map.get(sortedString).add(s);

        }

        return new LinkedList<>(map.values());
    }
}
