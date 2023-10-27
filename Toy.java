import java.util.Collections;

public class Toy implements Comparable<Toy>, ToyStoreInterface {
    static int generatorId = 1;
    private int id;
    private String name;
    private int quantity;
    private double price;
    private double weight;
    //        alternateWeight - parameter that uses as additional weight,
    //        if first weight parameter same in two toys.
    private double alternateWeight;

    public Toy(String name, int quantity, double price, double weight,
               double alternateWeight){
        this.id = generatorId++;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
        this.alternateWeight = alternateWeight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public double getAlternateWeight() {
        return alternateWeight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAlternateWeight(double alternateWeight) {
        this.alternateWeight = alternateWeight;
    }

    public String getInfo(){
        StringBuilder infoBuilder = new StringBuilder();
        infoBuilder.append("Toy id: ");
        infoBuilder.append(getId());
        infoBuilder.append(", ");
        infoBuilder.append("toy name: ");
        infoBuilder.append(name);
        infoBuilder.append(", ");
        infoBuilder.append("toy amount: ");
        infoBuilder.append(quantity);
        infoBuilder.append(", ");
        infoBuilder.append("toy price: ");
        infoBuilder.append(price);
        infoBuilder.append(", ");
        infoBuilder.append("toy weight: ");
        infoBuilder.append(weight);
        infoBuilder.append(", ");
        infoBuilder.append("toy alternative weight: ");
        infoBuilder.append(alternateWeight);
        infoBuilder.append(".");
        return infoBuilder.toString();
    }

    @Override
    public String toString(){
        return "Toy id: " + id +
                "\ntoy name: " + name +
                "\namount: " + quantity +
                "\nprice: " + price +
                "\nweight: " + weight +
                "\nalternateWeight: " + alternateWeight;
    }

    @Override
    public int compareTo(Toy o) {
        return 0;
    }
}
