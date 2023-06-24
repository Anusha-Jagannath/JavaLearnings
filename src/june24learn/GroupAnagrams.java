package june24learn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagrams {

    public static void main(String args[]) {
        String str[] = {"act", "tac", "ant", "nat", "jkl"};
        List<List<String>> list = findAnagrams(str);
        System.out.println(list);
    }

    private static List<List<String>> findAnagrams(String str[]) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : str) {
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
