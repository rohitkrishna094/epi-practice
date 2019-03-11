
/*
 *
 * Write a program that takes an input array of distinct elements and a size, and returns a subset of the given size of the array elements.
 * All subsets should be equally likely. Return result in array itself
 *
*/

import java.util.stream.Collectors;
import java.util.*;

public class E8SampleOfflineData {
    public static void main(String[] args) {
        int[] a = { 3, 7, 5, 11 };
        int size = 2;
        List<Integer> input = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> res = sampleTB(input, size);
        System.err.println(res.subList(0, size));
    }

    /*
     * This is without using Collections library. This also returns a list of size k
     * so we dont have to use subList where we call this method
     */
    public static List<Integer> sampleOwn(List<Integer> list, int k) {
        Random rand = new Random();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int randIndex = rand.nextInt(list.size());
        }
        return res;
    }

    /*
     * This is textbook code. The logic here is to get a random index and then get
     * the element at that index and store it in the first place. Now do it for the
     * remaining k-1 elements. This way we will have a random subset of size k
     */
    public static List<Integer> sampleTB(List<Integer> list, int k) {
        Random rand = new Random();
        for (int i = 0; i < k; i++) {
            Collections.swap(list, i, i + rand.nextInt(list.size() - i));
        }
        return list;
    }
}