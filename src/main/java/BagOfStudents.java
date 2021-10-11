import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BagOfStudents<Student> implements Iterable<Student>{
    private List<Student> students = new ArrayList<>();

    public void add(Student student){
        students.add(student);
    }

    public void remove(int index){
        students.remove(index);
    }

    public void clear(){
        students.clear();
    }

    @Override
    public Iterator<Student> iterator() {
        return students.listIterator();
    }
}
