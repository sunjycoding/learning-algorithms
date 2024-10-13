package phase01.section01;

/**
 * @author created by sunjy on 10/10/24
 */
public class Student {

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    private String name;

    private Integer score;

    @Override
    public boolean equals(Object student) {
        if (student != null) {
            if (student instanceof Student another) {
                return this.name.equalsIgnoreCase(another.name);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Student:(name: %s, score: %d)", name, score);
    }

}
