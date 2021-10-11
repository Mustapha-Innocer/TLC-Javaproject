import java.util.Comparator;

public class SortByLevel implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getLevel().compareTo(student2.getLevel());
    }
}
