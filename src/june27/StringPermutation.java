package june27;

import java.util.List;

public class StringPermutation {

    public static void main(String args[]) {
        String s ="abc";
        stringPermutation(s,0,s.length()-1);

    }

    private static void stringPermutation(String s, int l,int r) {
        if (l == r) {
            System.out.println(s);
            return;
        }

        for (int i=l;i<=r;i++) {
            s = interchange(s, l,i);
            stringPermutation(s, l+1,r);
            s = interchange(s,l,i);
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
