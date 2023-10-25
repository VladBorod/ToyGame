import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class ToyIterator implements Iterator<Toy> {
    private int index;
    private List<Toy> toys;

    public ToyIterator(List<Toy> targariens){
        this.toys = toys;
    }

    @Override
    public boolean hasNext(){
        return index < toys.size();
    }

    @Override
    public Toy next() {
        return toys.get(index++);
    }
}
