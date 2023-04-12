package twodimensionalarrays;

public class Main {
    public static void main(String args[]) {
        System.out.println("Learning two dimensional array");
        int a[][] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 4, 5, 6, 7}};

        int b[][] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 4, 5, 6, 7}};

        int c[][] = new int[3][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
