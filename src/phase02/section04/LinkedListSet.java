package phase02.section04;

import phase01.section04.LinkedList;

/**
 * @author created by sunjy on 10/25/24
 */
public class LinkedListSet<E> implements Set<E> {

    private LinkedList<E> linkedList;

    @Override
    public void add(E e) {
        if (!linkedList.contains(e)) {
            linkedList.addFirst(e);
        }
    }

    @Override
    public void remove(E e) {
        linkedList.removeElement(e);
    }

    @Override
    public boolean contains(E e) {
        return linkedList.contains(e);
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

}
