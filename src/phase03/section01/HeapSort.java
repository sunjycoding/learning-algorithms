package phase03.section01;

/**
 * @author Created by sunjy on 2/28/25
 */
public class HeapSort {

    public <E extends Comparable<E>> void sort(E[] data) {
        MaxHeap<E> maxHeap = new MaxHeap<>();
        for (E e : data) {
            maxHeap.add(e);
        }

        for (int i = data.length - 1; i >= 0; i--) {
            data[i] = maxHeap.extractMax();
        }
    }

    public <E extends Comparable<E>> void sort2(E[] data) {
        if (data.length <= 1) {
            return;
        }
        for (int i = (data.length - 2) / 2; i >= 0; i--) {
            siftDown(data, i, data.length);
        }
        for (int i = data.length - 1; i >= 0; i--) {
            swap(data, 0, i);
            siftDown(data, 0, i);
        }
    }

    private <E extends Comparable<E>> void siftDown(E[] data, int k, int n) {
        while ((2 * k + 1) < n) {
            int j = 2 * k + 1;
            if (j + 1 < n && data[j + 1].compareTo(data[j]) > 0) {
                j++;
            }
            if (data[k].compareTo(data[j]) >= 0) {
                break;
            }
            swap(data, k, j);
            k = j;
        }
    }

    private <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
