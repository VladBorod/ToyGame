import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ToyStore extends ToyIterator {
    public List<Toy> toys;
    public List<Toy> prize;

    public ToyStore() {
        super();
//        super();
        toys = new ArrayList<>();
        prize = new ArrayList<>();
    }

//    public ToyStore(List<Toy> toys){
//        this.toys = toys;
////        this.prize = prize;
//    }

//    public ToyStore() {
//        this(new ArrayList<>());
//    }

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

    public Toy playToys(){
//        ListIterator<Toy> iter = toys.listIterator();
        final double max = 101;
        final double playNumber;
        playNumber = Math.random() * max;
        System.out.println(playNumber);
        for (Toy toy:toys) {
//        for (ListIterator<Toy> it = iter; it.hasNext(); ) {
//            Toy toy = it.next();
            if (toy.getWeight() < playNumber){
                prize.add(toy);
//                prize.add(it.previous());
                return toy;
            }
        }
        return null;
    }
}
