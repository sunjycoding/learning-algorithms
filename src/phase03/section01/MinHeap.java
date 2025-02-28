package phase03.section01;

import phase01.section03.Array;

/**
 * @author Created by sunjy on 2/28/25
 */
public class MinHeap<E extends Comparable<E>> {

    private Array<E> data;

    public MinHeap(int capacity) {
        data = new Array<>(capacity);
    }

    public MinHeap() {
        data = new Array<>();
    }

    public MinHeap(E[] arr) {
        data = new Array<>(arr);
        if (arr.length != 1) {
            for (int i = parent(arr.length - 1); i >= 0; i--) {
                siftDown(i);
            }
        }
    }

    public int size() {
        return data.getSize();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    private int parent(int index) {
        if (index == 0) {
            throw new RuntimeException("index-0 doesn't have parent.");
        }
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }

    public void add(E e) {
        data.addLast(e);
        siftUp(data.getSize() - 1);
    }

    private void siftUp(int k) {
        while (k > 0 && data.get(parent(k)).compareTo(data.get(k)) > 0) {
            data.swap(k, parent(k));
            k = parent(k);
        }
    }

    public E findMin() {
        if (data.getSize() == 0) {
            throw new RuntimeException("Can not findMin when heap is empty.");
        }
        return data.get(0);
    }

    public E extractMin() {
        E result = findMin();
        data.swap(0, data.getSize() - 1);
        data.removeLast();
        siftDown(0);
        return result;
    }

    private void siftDown(int k) {
        while (leftChild(k) < data.getSize()) {
            int j = leftChild(k);
            if (j + 1 < data.getSize() && data.get(j + 1).compareTo(data.get(j)) < 0) {
                j++;
            }
            if (data.get(k).compareTo(data.get(j)) <= 0) {
                break;
            }
            data.swap(k, j);
            k = j;
        }
    }

    public E replace(E e) {
        E result = findMin();
        data.set(0, e);
        siftDown(0);
        return result;
    }

}
