package june24learn;

public class FloodFillAgorithm {

    public static void main(String args[]) {
        System.out.println("learning flood fill algorithm");
        int a[][] = {{1, 2, 1, 1, 2}, {1, 1, 2, 3, 1}, {1, 1, 2, 1, 2}, {1, 1, 1, 1, 2}};
        floodFill(a,1,1,5,1);
        printArray(a);
    }

    private static void floodFill(int a[][], int r, int c, int toFill, int prevFill) {
        int rows = a.length;
        int cols = a[0].length;

        if (r < 0 || r >= rows || c < 0 || c >= cols) {
            return;
        }

        if (a[r][c] != prevFill) {
            return;
        }

        floodFill(a, r - 1, c, toFill, prevFill);
        floodFill(a, r + 1, c, toFill, prevFill);
        floodFill(a, r, c + 1, toFill, prevFill);
        floodFill(a, r, c - 1, toFill, prevFill);
    }


    private static void printArray(int a[][]) {
        int rows = a.length;
        int cols = a[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
