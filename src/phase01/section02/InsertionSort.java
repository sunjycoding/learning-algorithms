package phase01.section02;

/**
 * @author Created by sunjy on 2/17/25
 */
public class InsertionSort {

    public <E extends Comparable<E>> void sort(E[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j - 1 >= 0; j--) {
                if (data[j].compareTo(data[j - 1]) < 0) {
                    E temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public <E extends Comparable<E>> void sort2(E[] data) {
        for (int i = 0; i < data.length; i++) {
            E temp = data[i];
            int j;
            for (j = i; j - 1 >= 0; j--) {
                if (data[j].compareTo(data[j - 1]) < 0) {
                    data[j] = data[j - 1];
                } else {
                    break;
                }
            }
            data[j] = temp;
        }
    }

}
