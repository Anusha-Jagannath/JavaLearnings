package logicaloperators;

public class Recursion {

    public static void main(String args[]) {
        System.out.println("Learning recursion problem");
        int a[][] = {{1, 1, 2, 3, 1}, {1, 1, 1, 1, 3}, {1, 2, 3, 1, 2}};
        floodFillAlgorithm(a, 1, 1, 2, 1);
        printArray(a);
    }


    private static void floodFillAlgorithm(int a[][], int r, int c, int toFill, int prevFill) {
        int rows = a.length;
        int cols = a[0].length;
        if (r < 0 || r >= rows || c < cols || c >= cols) return;
        if (a[r][c] != prevFill) return;

        floodFillAlgorithm(a, r - 1, c, toFill, prevFill);
        floodFillAlgorithm(a, r + 1, c, toFill, prevFill);
        floodFillAlgorithm(a, r, c + 1, toFill, prevFill);
        floodFillAlgorithm(a, r, c - 1, toFill, prevFill);

    }

    private static void printArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }

            System.out.println();
        }
    }
}
