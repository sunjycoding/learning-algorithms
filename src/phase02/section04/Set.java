package phase02.section04;

/**
 * @author Created by sunjy on 2/27/25
 */
public interface Set<E> {

    void add(E e);

    void remove(E e);

    boolean contains(E e);

    int getSize();

    boolean isEmpty();

}
