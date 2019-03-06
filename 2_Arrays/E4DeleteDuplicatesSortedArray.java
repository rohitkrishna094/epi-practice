public class E4DeleteDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 5, 7, 11, 11, 11, 13 };
        printArray(a);
        deleteDups(a);
        printArray(a);
    }

    public static void deleteDups(int a[]) {
        if (a.length >= 1) {
            int writeIndex = 1;
            for (int i = 1; i < a.length; i++) {
                if (a[writeIndex - 1] != a[i])
                    a[writeIndex++] = a[i];
            }
            for (int i = writeIndex; i < a.length; i++) {
                // nullify other values
                a[i] = 0;
            }
        }
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }
}