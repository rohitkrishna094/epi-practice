/*
 *  Write a program to take an array and put all even numbers at first
 *  Time complexity for this program is O(n)
*/
public class E1EvenAtFirst {
    public static void main(String[] args) {
        int a[] = { 1, 55, 21, 57, 33, 36, 22, 16, 17 };
        System.out.print("before : ");
        printArray(a);
        evenAtFirst(a);
        System.out.print("after : ");
        printArray(a);
    }

    public static void evenAtFirst(int[] a) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                swap(a, i, k);
                k++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }
}