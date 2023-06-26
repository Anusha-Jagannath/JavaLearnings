package june26;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagram {

    public static void main(String args[]) {
        System.out.println("Learning group anagrams");
        String s[] = {"act", "tac", "jkl", "tan", "anyu"};
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
