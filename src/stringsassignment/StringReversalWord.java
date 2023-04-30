package stringsassignment;

public class StringReversalWord {

    public static void main(String args[]) {
        System.out.print("Learning string reversal");
        String s = "I am doing good";
        System.out.print(stringReversal(s));
    }


    private static String stringReversal(String s) {
        String newString = s.trim();
        String ans = "";
        int i = newString.length() - 1;
        int j = i;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            while (i >= 0 && s.charAt(i) != ' ') i--;
            if (ans.isEmpty()) {
                ans = ans.concat(newString.substring(i + 1, j + 1));
            } else {
                ans = ans.concat(" " + newString.substring(i + 1, j + 1));
            }
            j = i;
        }

        return ans;
    }
}
