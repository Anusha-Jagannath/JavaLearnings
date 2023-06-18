package operatorsLearn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagrams {

    public static void main(String args[]) {
        System.out.println("Learning group anagrams");
        String s[] = {"act","tac","jkl","iop"};
        System.out.println(groupAnagrams(s));


    }

    private static List<List<String>> groupAnagrams(String strs[]) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new LinkedList<>());
            }

            map.get(sorted).add(s);
        }

        return new LinkedList<>(map.values());
    }
}
