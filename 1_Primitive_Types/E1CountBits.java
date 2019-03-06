/*
 *  Write a program to count the number of bits that are set to 1 in an integer.
 *  Time complexity for this program is O(n)
*/
public class E1CountBits {

    public static void main(String[] args) {
        int input = 5;
        if (args.length == 1) {
            input = Integer.parseInt(args[0]);
        }
        int ans = countBits(input);
        System.out.println(ans);
    }

    public static int countBits(int num) {
        int ans = 0;
        while (num != 0) {
            ans += (num & 1);
            num >>= 1;
        }
        return ans;
    }

}
