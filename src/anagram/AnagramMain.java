package anagram;

import kotlin._Assertions;

public class AnagramMain {

    public static void main(String args[]) {
        System.out.println("Learning string anagram");

        String s1 = "silent";
        String s2 = "listen";

        int n1 = s1.length();
        int n2 = s2.length();

        boolean isAnagram = false;
        boolean isVisited[] = new boolean[n2];

        if (n1 != n2) {
            isAnagram = false;
        } else {

            for(int i=0;i<n1;i++) {
                isAnagram = false;
                char c1 = s1.charAt(i);

                for(int j=0;j<n2;j++) {
                   char c2 = s2.charAt(j);

                   if (c1 == c2 && isVisited[j] == false) {
                       isAnagram =true;
                       isVisited[j] = true;
                       break;
                   }
                }


                if (isAnagram == false) {
                    break;
                }
            }

            System.out.println(isAnagram);


            boolean isAnagram1 = findAnagram(s1,s2);
            System.out.println(isAnagram1);


            boolean isAnagram2 = findAnagram(s1,s2);


        }
    }

    private static boolean findAnagram(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        int firstArray[] = new int[255];
        int secondArray[] = new int[255];

        for(int i=0;i<n1;i++) {
            firstArray[i] += 1;
        }

        for(int j=0;j<n2;j++) {
            secondArray[j] += 1;
        }


        for (int i=0;i<n1;i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
    }



    private static boolean isAnagram(String s1, String s2) {

        int n1 = s1.length();
        int n2 = s2.length();
        int firstArray[] = new int[255];

        if (n1 != n2) return false;

        for(int i=0;i<n1;i++) {
            firstArray[i] += 1;
        }


        for(int j=0;j<n2;j++) {
            firstArray[j] -= 1;
        }


        for(int i=0;i<n1;i++) {
            if (firstArray[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
