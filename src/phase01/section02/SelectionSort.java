package phase01.section02;

/**
 * @author Created by sunjy on 2/17/25
 */
public class SelectionSort {

    public <E extends Comparable<E>> void sort(E[] data) {
        for (int i = 0; i < data.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j].compareTo(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                E temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
        }
    }

}
