/*
 * Given an array and an index, arrange elements in it in such a way that all elements smaller than pivot(element at index) are first, 
 * then elements equal to pivot and then elements greater than pivot. Check page 65 for a bit better optimization. It doesnt cut down
 * time complexity much but is a bit better. 
*/

public class E2DutchNationalFlagPartition {
    public static void main(String[] args) {
        int a[] = { 1, 55, 21, 57, 33, 36, 22, 16, 17, 17, 17 };
        System.out.print("before : ");
        printArray(a);
        partition1(a, 2);
        System.out.print("after : ");
        printArray(a);
    }

    /*
     * Time Complexity O(n), space complexity O(1)
     */
    public static void partition1(int[] a, int index) {
        int pivot = a[index];
        int smallerIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < pivot) {
                swap(a, i, smallerIndex++);
            }
        }

        int largerIndex = a.length - 1;
        for (int i = a.length - 1; i >= index; i--) {
            if (a[i] > pivot) {
                swap(a, i, largerIndex);
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