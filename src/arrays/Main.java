package arrays;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning arrays data structure");
        int ar[] = new int[5];
        int marks[] = {1,2,4,4,5};
        int studentMarks[] = new int[10];
        int rollNo[] = new int[5];
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        marks[0] = 2;
        System.out.println(marks[0]);

        for(int i=0;i<marks.length;i++) {
            System.out.println("Marks "+marks[i]);
        }

    }
}
