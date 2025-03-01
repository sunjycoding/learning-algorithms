package phase03.section02;

/**
 * @author Created by sunjy on 2/28/25
 */
public class ShellSort {

    public <E extends Comparable<E>> void sort(E[] data) {
        int h = data.length / 2;
        while (h >= 1) {
            for (int i = h; i < data.length; i++) {
                E temp = data[i];
                int j;
                for (j = i; j - h >= 0 && temp.compareTo(data[j - h]) < 0; j -= h) {
                    data[j] = data[j - h];
                }
                data[j] = temp;
            }
            h /= 2;
        }
    }

}
