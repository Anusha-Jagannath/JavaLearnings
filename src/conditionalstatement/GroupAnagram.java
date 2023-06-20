package conditionalstatement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagram {

    public static void main(String args[]) {
        System.out.println("learning group anagrams");
        String strs[] = {"act", "tac", "jkl", "tan"};
        System.out.println(groupAnagrams(strs));

    }

    private static List<List<String>> groupAnagrams(String strs[]) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String newSorted = new String(c);
            if (!map.containsKey(newSorted)) {
                map.put(newSorted, new LinkedList<>());
            }
            map.get(newSorted).add(s);

        }

        return new LinkedList<>(map.values());
    }
}
