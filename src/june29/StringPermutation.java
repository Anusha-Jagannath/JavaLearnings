package june29;

import java.util.Arrays;

public class StringPermutation {

    public static void main(String args[]) {
        System.out.println("learning string permutation");
        String s = "abc";
    }


    private static void findPermutation(String s, int l, int r) {
        if (l == r) {
            System.out.println(s);
            return;
        }

        for (int i = l; i <= r; i++) {
            s = interchange(s, l, i);
            findPermutation(s, l + 1, r);
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
