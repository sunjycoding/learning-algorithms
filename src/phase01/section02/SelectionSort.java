package phase01.section02;

import java.util.Arrays;

/**
 * @author created by sunjy on 10/10/24
 */
public class SelectionSort {

    public static <E extends Comparable> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                E temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }


    public static void main(String[] args) {
        Integer[] arr = {3, 5, 7, 1, 2, 8};
        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
