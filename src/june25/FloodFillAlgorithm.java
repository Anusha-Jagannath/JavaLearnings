package june25;

public class FloodFillAlgorithm {

    public static void main(String args[]) {

        int arr[][] = {{1, 1, 2, 1, 2}, {1, 1, 2, 3, 4}, {1, 1, 2, 3, 2}};
        floodFill(arr, 1, 1, 5, 1);
    }

    private static void floodFill(int arr[][], int r, int c, int toFill, int prevFill) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (r < 0 || r >= rows || c < 0 || c >= cols) return;

        if (arr[r][c] != prevFill) return;

        arr[r][c] = toFill;

        floodFill(arr, r - 1, c, toFill, prevFill);
        floodFill(arr, r + 1, c, toFill, prevFill);
        floodFill(arr, r, c + 1, toFill, prevFill);
        floodFill(arr, r, c - 1, toFill, prevFill);

    }

    private static void printArray(int ar[][]) {
        int rows = ar.length;
        int cols = ar[0].length;

        for (int i=0;i<rows;i++) {
            for (int j=0;i<cols;j++) {
                System.out.print(ar[i][j]);
            }
        }
        System.out.println();
    }
}
