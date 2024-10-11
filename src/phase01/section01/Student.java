package phase01.section01;

/**
 * @author created by sunjy on 10/10/24
 */
public class Student {

    public Student(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public boolean equals(Object student) {
        if (student != null) {
            if (student instanceof Student another) {
                return this.name.equalsIgnoreCase(another.name);
            }
        }
        return false;
    }
}
