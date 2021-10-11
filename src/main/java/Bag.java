import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Iterable<T> {
    private List<T> elements = new ArrayList<>();

    public void add(T element){
        elements.add(element);
    }

    public void remove(int index){
        elements.remove(index);
    }

    public void clear(){
        elements.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return elements.listIterator();
    }
}
