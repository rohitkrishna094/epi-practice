/*
 *  Write a program to get the parity of a number. Parity is 1 if number of set bits are odd and its 0 if number of set bits are even
*/

public class E2Parity {
    public static void main(String[] args) {
        int input = 5;
        if (args.length == 1) {
            input = Integer.parseInt(args[0]);
        }
        int res = parity2(input);
        System.out.println(res);
    }

    /*
     * given in textbook a bit better By using xor, we keep flipping between 1 and 0
     * in res since we only care about modulo i.e., odd or even Time complexity is
     * O(n)
     */
    public static int parity2(int num) {
        int res = 0;
        while (num != 0) {
            res ^= (num & 1);
            num >>= 1;
        }
        return res;
    }

    // Inefficient
    public static int parity1(int num) {
        int countOfOnes = countBits(num);
        return countOfOnes % 2 == 0 ? 0 : 1;
    }

    public static int countBits(int num) {
        int res = 0;
        while (num != 0) {
            res += (num & 1);
            num >>= 1;
        }
        return res;
    }
}