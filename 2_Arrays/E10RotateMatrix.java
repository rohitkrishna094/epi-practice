/*
 * Write a program to rotate the matrix. TC is O(n ^ 2)
*/

public class E10RotateMatrix {
    public static void main(String[] args) {
        int[][] in = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int[][] out = rotate(in);
        print2DArray(out);
    }

    public static int[][] rotate(int[][] a) {
        int[][] b = new int[a.length][a[0].length];
        int n = a.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[i][j] = a[n - j - 1][i];
            }
        }
        return b;
    }

    public static void print2DArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}