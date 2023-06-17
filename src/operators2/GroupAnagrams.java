package operators2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagrams {

    public static void main(String args[]) {
        System.out.println("Learning group anagrams");
        String s[] = {"act", "tac", "jkl", "iop"};
        System.out.println(groupAnagrams(s));

    }

    private static List<List<String>> groupAnagrams(String str[]) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            ;
            String sortedString = new String(c);
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new LinkedList<>());
            }
            map.get(sortedString).add(s);

        }

        return new LinkedList<>(map.values());
    }
}
