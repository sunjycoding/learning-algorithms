package phase03.section02;

/**
 * @author Created by sunjy on 2/28/25
 */
public class BubbleSort {

    public <E extends Comparable<E>> void sort(E[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j + 1].compareTo(data[j]) < 0) {
                    E temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    public <E extends Comparable<E>> void sort2(E[] data) {
        for (int i = 0; i < data.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j + 1].compareTo(data[j]) < 0) {
                    E temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public <E extends Comparable<E>> void sort3(E[] data) {
        for (int i = 0; i < data.length; ) {
            int lastSwappedIndex = 0;
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j + 1].compareTo(data[j]) < 0) {
                    E temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                    lastSwappedIndex = j + 1;
                }
            }
            i = data.length - lastSwappedIndex;
        }
    }

}
