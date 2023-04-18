package stringAnagram;

import java.util.Arrays;

public class Anagram {

    public static void main(String args[]) {
        System.out.println("Learning string anagram");
        String s1 = "silent";
        String s2 = "listen";

        int n1 = s1.length();
        int n2 = s2.length();
        boolean isAnagram = false;
        boolean isVisited[] = new boolean[n2];

        //System.out.println(isAnagram(s1,s2));

        findAnagram(s1, s2);

        System.out.println(isAnagram(s1, s2));

       /* if (n1 != n2) {
            System.out.println("Not Anagram");
        } else {

            for (int i = 0; i < n1; i++) {

                isAnagram = false;

                char c = s1.charAt(i);
                for (int j = 0; j < n2; j++) {
                    char c1 = s2.charAt(j);
                    if (c == c1 && !isVisited[j]) {
                        isAnagram = true;
                        isVisited[j] = true;
                    }
                }

                if (!isAnagram) {
                    break;
                }
            }

            System.out.println(isAnagram);
        } */


    }

    private static boolean isAnagram(String s1, String s2) {
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        s1 = new String(c1);
        s2 = new String(c2);


        return (s1.equals(s2));
    }


   /* private static boolean findAnagram(String s1, String s2) {

        int firstArray[] = new int[255];
        int secondArray[] = new int[255];

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            firstArray[c] += 1;
        }

        for (int j = 0; j < s2.length(); j++) {
            char c1 = s2.charAt(j);
            secondArray[c1] += 1;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true; */


    private static boolean findAnagram(String s1, String s2) {

        int firstArray[] = new int[255];

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            firstArray[c] += 1;
        }

        for (int j = 0; j < s2.length(); j++) {
            char c1 = s2.charAt(j);
            firstArray[c1] -= 1;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (firstArray[i] != 0) {
                return false;
            }
        }
        return true;
    }


}
