package phase01.section03;

/**
 * @author Created by sunjy on 2/18/25
 */
public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();

}
