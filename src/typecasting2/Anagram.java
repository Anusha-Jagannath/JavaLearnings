package typecasting2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Anagram {

    public static void main(String args[]) {
        System.out.println("Learning java basics");
        String str[] = {"act","tac","jkl","uip"};
        System.out.println(groupAnagrams(str));
    }


    private static List<List<String>> groupAnagrams(String s[]) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s1: s) {
            char c[] = s1.toCharArray();
            Arrays.sort(c);
            String sortedString = new String(c);

            if (!map.containsKey(sortedString)) {
               map.put(sortedString, new LinkedList<>());
            }

            map.get(sortedString).add(s1);
        }

        return new LinkedList<>(map.values());
    }
}
