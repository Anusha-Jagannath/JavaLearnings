package stringsassignment;

public class StringReverse {

    public static void main(String args[]) {
        System.out.println("Learning string reversal");
        String s = "I am good at what I am doing";
        //System.out.print(reverseString(s));
        //System.out.print(reverse(s));
        System.out.print(reverseDiff(s));

    }


    private static String reverseString(String s) {
        String ans = "";
        String newString[] = s.trim().split(" ");
        for (int i = newString.length - 1; i >= 0; i--) {
            ans += newString[i] + " ";
        }
        return ans;
    }

    private static String reverse(String s) {
        String newString = s.trim();
        String ans = "";

        int j = newString.length() - 1;
        int i = j;

        while (i >= 0) {
            while (i >= 0 && newString.charAt(i) != ' ') i--;

            ans += ans.concat(newString.substring(i + 1, j + 1));
            j = i;
        }

        return ans;

    }

    private static String reverseDiff(String s) {
        String ans = "";
        int i = s.length() - 1;
        int j = i;
        while (i >= 0) {

            while (i >= 0 && s.charAt(i) != ' ') i--;
            if (ans.isEmpty()) {
                ans = ans.concat(" " + s.substring(i + 1, j + 1));
            } else {
               ans = ans.concat(s.substring(i + 1, j + 1));
            }

            j = i;


        }

        return ans;
    }
}
