package operatorsLearn;

import java.util.*;

public class HashMap {

    public static void main(String args[]) {
        System.out.println("Learning hashmaps in java");
        Map<String, Integer> map = new java.util.HashMap<>();

        map.put("one",1);
        map.put("two",2);
        map.put("three",3);

        System.out.println(map.get("one"));
        System.out.println(map.containsKey("one"));
        System.out.println(map.containsValue(2));
        System.out.println(map.replace("one",1,10));
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.setValue(entry.getValue()*10));
        }

        System.out.println(map);

        String s[] = {"cat","do","kl"};
        for (int i=0;i<s.length;i++) {
            System.out.println(getHashcode(s[i]));
        }
    }

    private static int getHashcode(String s) {
        int hash = 0;
        for (int i=0;i<s.length();i++) {
            hash = hash+s.charAt(i);
        }
        return hash;
    }
}
