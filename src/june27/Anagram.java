package june27;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Anagram {

    public static void main(String args[]) {
        System.out.println("Learning anagram");
        String s[] = {"act", "tac", "jkl", "lkj"};
        System.out.println(groupAnagrams(s));

    }


    private static List<List<String>> groupAnagrams(String strs[]) {
        HashMap<String, List<String>> map = new HashMap<>();
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
