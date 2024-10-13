package phase01.section03;

/**
 * @author created by sunjy on 10/11/24
 */
public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();

}
