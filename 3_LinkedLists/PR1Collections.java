import java.util.*;
import java.util.stream.Collectors;

public class PR1Collections {
    public static void main(String[] args) {
        int[] a = { 12, 54, -1, -90, 5, 4, 67, 87, -90 };
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.println(list);
        // sort
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // sort with comparator
        System.out.println("---------------------");
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        // binary search: can also add a comparator
        System.out.println("---------------------");
        int foundIndex = Collections.binarySearch(list, -90);
        System.out.println(foundIndex);

        // min and max: can also add a comparator
        System.out.println("-------------------");
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.err.println(min + " " + max);

        // reverse
        System.out.println("--------------------");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        // fill: fills the collection with a specified value
        System.out.println("--------------------");
        System.out.println(list);
        Collections.fill(list, 4);
        System.out.println(list);

        // There is also a Collections.swap(c, 0, 1) method
    }

    static class MyComparator implements Comparator<Integer> {
        public int compare(Integer i1, Integer i2) {
            return (i1 - i2);
        }
    }
}