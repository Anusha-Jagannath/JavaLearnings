package stringsassignment;

public class ReverseString {

    public static void main(String args[]) {
      System.out.println("Learning reverse the string");
      String s = "I am good at what I am doing";
      String s1[] = s.split(" ");

      for(int i=s1.length-1; i>=0;i--) {
          System.out.println(s1[i]);
      }
    }

    private static String reverseWords(String s) {
        String ans = "";
        int i = s.length()-1;

        while (i >=0) {

            while (i >=0 && s.charAt(i) == ' ') i--;

            int j =i;

            while(i >= 0 && s.charAt(i) != ' ') i--;

            if (ans.isEmpty()) {
                ans.concat(s.substring(i+1,j+1));
            } else {
                ans.concat(" "+s.substring(i+1,j+1));
            }
        }

        return ans;
    }
}
