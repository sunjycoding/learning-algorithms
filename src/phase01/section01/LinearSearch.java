package phase01.section01;

/**
 * @author Created by sunjy on 2/17/25
 */
public class LinearSearch {

    public <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (target.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

}
