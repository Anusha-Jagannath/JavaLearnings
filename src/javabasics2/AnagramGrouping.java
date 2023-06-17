package javabasics2;

import java.util.*;

public class AnagramGrouping {

    public static void main(String args[]) {
        System.out.println("Learning grouping anagrams");
        String strs[] = {"act","cat","tan","ant"};
        System.out.println(groupAnagram(strs));
    }


    private static List<List<String>> groupAnagram(String strs[]) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String sortedString = new String(c);
            if (!map.containsKey(sortedString)) {
                map.put(sortedString,new LinkedList<>());
            }
            map.get(sortedString).add(s);
        }

        return new LinkedList<>(map.values());
    }
}
