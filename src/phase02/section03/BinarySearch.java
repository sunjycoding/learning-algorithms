package phase02.section03;

/**
 * @author Created by sunjy on 2/24/25
 */
public class BinarySearch {

    public <E extends Comparable<E>> int search(E[] data, E target) {
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (data[mid].compareTo(target) < 0) {
                left = mid + 1;
            } else if (data[mid].compareTo(target) > 0) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public <E extends Comparable<E>> int upper(E[] data, E target) {
        int left = 0;
        int right = data.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (data[mid].compareTo(target) <= 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public <E extends Comparable<E>> int lower(E[] data, E target) {
        int left = -1;
        int right = data.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (data[mid].compareTo(target) < 0) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public <E extends Comparable<E>> int ceil(E[] data, E target) {
        int u = upper(data, target);
        if (u - 1 >= 0 && data[u - 1].compareTo(target) == 0) {
            return u - 1;
        }
        return u;
    }

    public static <E extends Comparable<E>> int lowerCeil(E[] data, E target) {
        int left = 0;
        int right = data.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (data[mid].compareTo(target) < 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public <E extends Comparable<E>> int searchR(E[] data, E target) {
        return searchR(data, 0, data.length - 1, target);
    }

    private <E extends Comparable<E>> int searchR(E[] data, int left, int right, E target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;

        if (data[mid].compareTo(target) > 0) {
            return searchR(data, left, mid - 1, target);
        }
        if (data[mid].compareTo(target) < 0) {
            return searchR(data, mid + 1, right, target);
        }
        return mid;
    }

}
