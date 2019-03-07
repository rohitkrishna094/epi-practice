
/*
 *
 * Write a program that takes n and returns all primes before n(exclusive)
 * 
*/

import java.util.*;

public class E6PrimesToN {
    public static void main(String[] args) {
        int n = 100;
        if (args.length == 1) {
            n = Integer.parseInt(args[0]);
        }
        List<Integer> res = getPrimes_bruteForce(n);
        System.out.println(res);
        System.out.println(res.size());
    }

    /*
     * Time Complexity is O(n * n^(1/2)) = O(n^(3/2))
     *
     */
    public static List<Integer> getPrimes_bruteForce(int n) {
        List<Integer> res = new ArrayList<>();

        for (int k = 1; k < n; k++) {
            if (checkPrime(k))
                res.add(k);
        }
        return res;
    }

    public static boolean checkPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> getPrimes_Sieve(int n) {
        return null;
    }
}