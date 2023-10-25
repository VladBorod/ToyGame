import java.util.Comparator;
import java.util.Collections;

public class ToyCompareByWeight implements Comparator<Toy> {

    public int compareTo(Toy o1, Toy o2){
        if (o1.getWeight() == o2.getWeight()) {
            return 0;
        }  if (o1.getWeight() < o2.getWeight()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public int compare(Toy o1, Toy o2) {
        if (o1.getWeight() == o2.getWeight()) {
            return 0;
        }  if (o1.getWeight() < o2.getWeight()) {
            return -1;
        } else {
            return 1;
        }
    }
}
