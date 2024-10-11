package phase01.section01;

/**
 * @author created by sunjy on 10/10/24
 */
public class LinearSearch {

    private LinearSearch() {
    }

    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 100000;
        Integer[] data = ArrayGenerator.generateOrderedArray(n);
        long start = System.currentTimeMillis();
        System.out.println(LinearSearch.search(data, n));
        long end = System.currentTimeMillis();
        System.out.println("Time cost: " + (end - start) + "ms");
        System.out.println(LinearSearch.search(data, 666));
        Student[] students = {new Student("Alice"),
                new Student("Bobo"),
                new Student("Charlie")};
        System.out.println(LinearSearch.search(students, new Student("Bobo")));
    }
}
