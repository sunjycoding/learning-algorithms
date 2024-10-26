package phase02.section04;

/**
 * @author created by sunjy on 10/25/24
 */
public interface Set<E> {

    void add(E e);

    void remove(E e);

    boolean contains(E e);

    int getSize();

    boolean isEmpty();

}
