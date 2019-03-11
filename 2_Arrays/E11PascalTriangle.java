
/*
 * Write a program to print n rows of pascal triangle
*/

import java.util.*;

public class E11PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> res = pascal(n);
        System.out.println(res);
    }

    /*
     * Proof: Assume that nc(r+1) = k * ncr where k is some constant. Now derive for
     * k and you will get below formula which is used in this algorithm
     */
    public static List<List<Integer>> pascal(int n) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = 1;
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                temp.add(num);
                num = (num * (i - j)) / (j + 1);
            }
            res.add(temp);
        }
        return res;
    }
}

// const n = 6;
// for (let i = 0; i < n; i++) {
// let number = 1;
// for (let j = 0; j <= i; j++) {
// process.stdout.write(number + ' ');
// number = (number * (i - j)) / (j + 1);
// }
// process.stdout.write('\n');
// }