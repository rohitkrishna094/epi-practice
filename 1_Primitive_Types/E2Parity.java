public class E2Parity {
    public static void main(String[] args) {
        int input = 5;
        if (args.length == 1) {
            input = Integer.parseInt(args[0]);
        }
        int res = parity(input);
        System.out.println(res);
    }

    public static int parity(int num) {
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