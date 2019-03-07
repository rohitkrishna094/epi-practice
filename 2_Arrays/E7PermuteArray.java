
/*
 *
 * A permutation of {2,0,1,3} means that transfer element at location 0 to 2, 1 to 0, 2 to 1, 3 to 3.
 * Write a program that takes an array and a permutation and applies this permutation to that array
 *
*/

import java.util.stream.Collectors;
import java.util.*;

public class E7PermuteArray {
    public static void main(String[] args) {
        // answer should be {20, 30, 10, 40}
        int[] arr = { 10, 20, 30, 40 };
        int[] perm = { 2, 0, 1, 3 };
        int[] result = permute_extraSpace(arr, perm);
        printArray(arr);
        printArray(result);
        System.out.println("-----------------------");

    }

    public static void permute_efficient(int[] arr, int[] perm) {

    }

    /*
     * Time Complexity is O(n) but space complexity is O(n)
     */
    public static int[] permute_extraSpace(int[] arr, int[] perm) {
        int[] b = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[perm[i]] = arr[i];
        }
        return b;
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }

}