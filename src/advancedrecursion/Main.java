package advancedrecursion;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning advanced recursion");

        int a[][] = {{1, 1, 2}, {1, 2, 3}, {1, 1, 2}, {2, 3, 1}};
        floodFill(a,0,2,1,5);

        printMatrix(a);
    }


    private static void floodFill(int a[][], int row, int column, int toFill, int prevFill) {
        int r = a.length;
        int c = a[0].length;

        if (row < 0 || column < 0 || row > r || column > c) return;
        if (a[row][column] != toFill) return;

        a[row][column] = toFill;

        floodFill(a, row - 1, column, toFill, prevFill);
        floodFill(a, row + 1, column, toFill, prevFill);
        floodFill(a, row, column - 1, toFill, prevFill);
        floodFill(a, row, column + 1, toFill, prevFill);
    }

    private static void printMatrix(int a[][]) {
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a[0].length;j++) {
                System.out.println(a[i][j]+" ");
            }
        }
    }
}
