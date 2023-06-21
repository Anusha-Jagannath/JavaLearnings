package condtionalstatements;

public class Recursion2 {

    public static void main(String args[]) {
        System.out.println("Learning advanced recursion problem");
        int arr[][] = {{1, 1, 2, 3}, {1, 1, 2, 3}, {3, 2, 1, 1}, {1, 1, 2, 1}};
        floodFill(arr, 0, 0, 1, 2);
        printMatrix(arr);
    }

    private static void floodFill(int arr[][], int r, int c, int toFill, int prevFill) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (r < 0 || r >= rows || c < 0 || c >= cols) return;

        if (arr[r][c] != prevFill) {
            return;
        }

        floodFill(arr, r - 1, c, toFill, prevFill);
        floodFill(arr, r + 1, c, toFill, prevFill);
        floodFill(arr, r, c - 1, toFill, prevFill);
        floodFill(arr, r, c + 1, toFill, prevFill);
    }

    private static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
