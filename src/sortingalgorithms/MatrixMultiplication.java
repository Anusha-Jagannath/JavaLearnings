package sortingalgorithms;

public class MatrixMultiplication {

    public static void main(String args[]) {
        System.out.println("Learning matrix multiplication");

        int m = 3;
        int n = 2;

        int p = 2;
        int q = 3;

        int a[][] = {{1, 2}, {4, 5}, {7, 8}};
        int b[][] = {{1, 2, 3}, {4, 5, 6}};
        int c[][] = new int[3][3];

        if (n != p) {
            System.out.println("Multiplication of matrix not posssible");
        } else {

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    int res = 0;

                    for (int k = 0; k < p; k++) {
                        res = res + a[j][k] * b[k][j];
                        c[i][j] = res;
                    }
                }
            }


            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
