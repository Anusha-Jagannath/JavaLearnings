package june30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
    private static Set<String> set = new HashSet<>();

    public static void main(String args[]) {
        System.out.println("Learning string permutation");
        String s = "abcd";
        permutation(s, 0, s.length() - 1);

    }

    private static void permutation(String s, int l, int r) {
        if (l == r) {
            if (set.contains(s)) return;

            set.add(s);
            System.out.println(s);
            return;
        }

        for (int i = 0; i <= r; i++) {
            s = interchange(s, l, i);
            permutation(s, l + 1, r);
            s = interchange(s, l, i);
        }

    }


    private static String interchange(String s, int a, int b) {
        char c[] = s.toCharArray();
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
        return new String(c);

    }
}
