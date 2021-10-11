import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BagOfLectures<Lecture> implements Iterable<Lecture> {
    private List<Lecture> lectures = new ArrayList<>();

    public void add(Lecture lecture){
        lectures.add(lecture);
    }

    public void remove(int index){
        lectures.remove(index);
    }

    public void clear(){
        lectures.clear();
    }

    @Override
    public Iterator<Lecture> iterator() {
        return lectures.listIterator();
    }
}
