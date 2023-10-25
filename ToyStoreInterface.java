import java.util.List;
import java.util.Collections;

public interface ToyStoreInterface {
    int compareTo(Toy toy);
    public int getId();

    public String getName();

    public int getQuantity();

    public double getPrice();

    public double getWeight();

    public double getAlternateWeight();

    public void setQuantity(int quantity);

    public void setWeight(double weight);

    public void setAlternateWeight(double alternateWeight);

    public String getInfo();

    @Override
    public String toString();
}
