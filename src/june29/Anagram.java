package june29;


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Anagram {

    public static void main(String args[]) {
        System.out.println("learning anagram grouping");
        String s[] = {"act", "tac", "jkl", "kli", "iop"};
        System.out.println(stringPermutation(s));

    }

    private static List<List<String>> stringPermutation(String strs[]) {
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

        return new LinkedList(map.values());
    }
}
