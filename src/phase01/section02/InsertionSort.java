package phase01.section02;

import java.util.Arrays;

/**
 * @author created by sunjy on 10/10/24
 */
public class InsertionSort {

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            E temp = arr[i];
            int j;
//            for (j = i; j - 1 >= 0; j--) {
//                if (temp.compareTo(arr[j - 1]) < 0) {
//                    arr[j] = arr[j - 1];
//                } else {
//                    break;
//                }
//            }
            for (j = i; j - 1 >= 0 && temp.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            E temp = arr[i];
            int j;
            for (j = i; j + 1 < arr.length && temp.compareTo(arr[j + 1]) > 0; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {3, 5, 7, 1, 2, 8, 0, 9, 6, 4};
        InsertionSort.sort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
