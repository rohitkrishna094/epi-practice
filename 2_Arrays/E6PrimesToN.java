
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
        List<Integer> res1 = getPrimes_bruteForce(n);
        List<Integer> res2 = getPrimes_Sieve(n);
        System.out.println(res1);
        System.out.println(res1.size());
        System.out.println(res2);
        System.out.println(res2.size());
    }

    /*
     * Time Complexity is O(n * (n/2 + n/3 + n/5 + ...)) = O(n * n * logn * logn)
     * but space complexity is O(n) since we are using a boolean array
     * 
     */
    public static List<Integer> getPrimes_Sieve(int n) {
        boolean[] arePrimes = new boolean[n];
        Arrays.fill(arePrimes, true);
        arePrimes[0] = false;
        arePrimes[1] = false;
        List<Integer> res = new ArrayList<>();
        for (int i = 2; i < arePrimes.length; i++) {
            if (arePrimes[i])
                res.add(i);
            // fill to false
            for (int j = i; j < arePrimes.length; j = j + i) {
                arePrimes[j] = false;
            }
        }
        return res;
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

}