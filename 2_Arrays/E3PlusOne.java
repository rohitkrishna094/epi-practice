
/*
 *  Write a program to take a List and adds one to it. Make note of carry as well.
 *  Time complexity for this program is O(n)
*/
import java.util.*;
import java.util.stream.*;

public class E3PlusOne {
    public static void main(String[] args) {
        int a[] = { 9, 9, 9 };
        // Converting primitive array to List using java 8 streams
        List<Integer> input = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> res = plusOne(input);
        System.out.println(res);
    }

    public static List<Integer> plusOne(List<Integer> A) {
        int n = A.size() - 1;
        A.set(n, A.get(n) + 1);
        for (int i = n; i > 0 && A.get(i) == 10; --i) {
            A.set(i, 0);
            A.set(i - 1, A.get(i - 1) + 1);
        }
        if (A.get(0) == 10) {
            A.set(0, 0);
            A.add(0, 1);
        }
        return A;
    }

}