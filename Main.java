import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy("Toy1", 4, 1500, 20, 49);
        Toy toy2 = new Toy("Toy2", 1, 5000, 6, 49);
        Toy toy3 = new Toy("Toy3", 9, 500, 70, 51);
        Toy toy4 = new Toy("Toy4", 12, 300, 80, 49);
        Toy toy5 = new Toy("Toy5", 13, 250, 80, 51);
        Toy toy6 = new Toy("Toy6", 5, 1400, 45, 51);
        Toy toy7 = new Toy("Toy7", 2, 1500, 10, 51);
        Toy toy8 = new Toy("Toy8", 1, 6000, 5, 51);
        Toy toy9 = new Toy("Toy9", 6, 1300, 47, 49);
        Toy toy10 = new Toy("To10", 8, 900, 70, 49);
        Toy toy11 = new Toy("To11", 4, 3000, 21, 49);
        Toy toy12 = new Toy("To12", 2, 2800, 23, 49);
        Toy toy13 = new Toy("To13", 5, 2500, 27, 49);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);
        store.addToy(toy7);
        store.addToy(toy8);
        store.addToy(toy9);
        store.addToy(toy10);
        store.addToy(toy11);
        store.addToy(toy12);
        store.addToy(toy13);

        System.out.println(store.getToyStoreInfo());

        store.getToyStore().sort(new ToyCompareByWeight());
        System.out.println(store.playToys());

//        System.out.println(store.getToyStoreInfo());
    }

}
