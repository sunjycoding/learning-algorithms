package phase01.section03;

/**
 * @author Created by sunjy on 2/19/25
 */
public interface Queue<E> {

    void enqueue(E e);

    E dequeue();

    E getFront();

    int getSize();

    boolean isEmpty();

}
