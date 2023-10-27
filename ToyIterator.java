import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class ToyIterator<Toy extends ToyStoreInterface> implements Iterator<Toy> {
    private int index;
    private List<Toy> toys;

    public ToyIterator(List<Toy> toys){
        this.toys = toys;
    }
    public ToyIterator(ToyStore toys){
        this.toys = (List<Toy>) toys.getToyStore();
    }

    public ToyIterator() {

    }

    @Override
    public boolean hasNext(){
        return index < toys.size();
    }

    @Override
    public Toy next() {
        return toys.get(index++);
    }

//    @Override
    public Toy previous(){
        return toys.get(index--);
    }
}
