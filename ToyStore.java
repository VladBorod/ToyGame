import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;



public class ToyStore implements Iterator<Toy> {
    public List<Toy> toys;
    public List<Toy> prize;

    public ToyStore(){
        toys = new ArrayList<>();
        prize = new ArrayList<>();
    }

    public List<Toy> getToyStore(){
        return toys;
    }

    public void addToy(Toy toy){
        toys.add(toy);
    }

    public String getToyStoreInfo(){
        StringBuilder toyStore = new StringBuilder();
        for (Toy toy:toys){
            toyStore.append(toy.getInfo());
            toyStore.append("\n");
        }
        return toyStore.toString();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Toy next() {
        return null;
    }
}
