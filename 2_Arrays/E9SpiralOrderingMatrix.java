
/*
 *
 * Write a program that takes a 2d array and prints the spiral values
 * Assume the matrix is a square matrix: Time complexity is 
 *
*/
import java.util.*;

public class E9SpiralOrderingMatrix {
    public static void main(String[] args) {
        // even order
        int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // odd order
        int[][] b = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        List<Integer> res = spiralValues(a);
        List<Integer> res2 = spiralValues(b);
        System.out.println(res);
        System.out.println(res2);
    }

    public static List<Integer> spiralValues(int[][] arr) {
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        for (int k = 0; k < Math.ceil(n / 2.0); k++) {
            if (k == n - k - 1) {
                // odd dimensions and we are at center and is the last item, so add it
                res.add(arr[k][k]);
            }
            // top
            for (int i = k; i < n - k - 1; i++) {
                res.add(arr[k][i]);
                // int x = k, y = i;
                // System.out.print("[" + x + "" + y + "], ");
            }
            // right
            for (int i = k; i < n - k - 1; i++) {
                res.add(arr[i][n - k - 1]);
                // int x = i, y = n - k - 1;
                // System.out.print("[" + x + "" + y + "], ");
            }
            // bottom
            for (int i = n - k - 1; i > k; i--) {
                res.add(arr[n - k - 1][i]);
                // int x = n - k - 1, y = i;
                // System.out.print("[" + x + "" + y + "], ");
            }
            // left
            for (int i = n - k - 1; i > k; i--) {
                res.add(arr[i][k]);
                // int x = i, y = k;
                // System.out.print("[" + x + "" + y + "], ");
            }
            // System.out.println();
        }
        return res;
    }
}