package phase01.section03;

/**
 * @author created by sunjy on 10/12/24
 */
public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();

}
