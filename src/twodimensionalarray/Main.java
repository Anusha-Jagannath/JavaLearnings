package twodimensionalarray;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning two dimensional array");
        int a[][] = {{1, 2, 3, 4, 5}, {1, 2, 3, 5, 6}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        int b[][] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};


        int result[][] = new int[4][4];


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(result[i][j]);

            }
            System.out.println();

        }
    }
}
