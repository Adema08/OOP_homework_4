import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> items = new ArrayList<>();
    public void put(T item) {
        items.add(item);
    }
    public List<T> get() {
        return items;
    }



}

