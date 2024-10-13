package phase01.section04;

import phase01.section03.Queue;

/**
 * @author created by sunjy on 10/12/24
 */
public class LinkedListQueue<E> implements Queue<E> {

    private Node head;
    private Node tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot dequeue from an empty queue");
        }
        Node node = head;
        head = head.next;
        node.next = null;
        if (head == null) {
            tail = null;
        }
        size--;
        return node.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return head.e;
    }

    private class Node {

        public E e;

        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Queue: front ");

        Node current = head;
        while (current != null) {
            stringBuilder.append(current).append("->");
            current = current.next;
        }
        stringBuilder.append("NULL tail");
        return stringBuilder.toString();
    }

}
