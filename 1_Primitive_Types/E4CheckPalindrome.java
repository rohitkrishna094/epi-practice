/*
 * Write a program to check if given interger is a palindrome. Palindrome is a string or number that is same even when reversed.
 *
*/
public class E4CheckPalindrome {
    public static void main(String[] args) {
        int input = 121;
        if (args.length == 1) {
            input = Integer.parseInt(args[0]);
        }
        boolean res = checkPalindrome(input);
        System.out.println(input + " : " + res);
    }

    /*
     * A better optimization would be to only check till middle and see if
     * corresponding pairs are equal
     */
    public static boolean checkPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int reverse = reverse(n);
        return reverse == n;
    }

    public static int reverse(int n) {
        int res = 0;
        int abs = Math.abs(n);
        while (abs != 0) {
            res = (res * 10) + (abs % 10);
            abs /= 10;
        }
        return (n < 0) ? -res : res;
    }
}