public class E3ReverseDigits {
    public static void main(String[] args) {
        int input = 623;
        if (args.length == 1) {
            input = Integer.parseInt(args[0]);
        }
        int res = reverse(input);
        System.out.println(res);
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