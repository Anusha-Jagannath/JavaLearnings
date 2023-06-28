package june28;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Anagrams {

    public static void main(String args[]) {
        System.out.println("learning group anagrams");
        String s[] = {"act", "tac", "jkl", "kli"};

    }

    private static List<List<String>> groupAnagrams(String str[]) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String sortedString = new String(c);
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new LinkedList<>());
            }
            map.get(sortedString).add(sortedString);
        }

        return new LinkedList<>(map.values());
    }
}
