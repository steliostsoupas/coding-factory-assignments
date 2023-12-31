package gr.aueb.cf.ch19.collections;

import java.util.HashSet;
import java.util.Set;

public class BagOfCoins {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        bag.add("Athens");
        bag.add("Paris");
        bag.add("London");

        bag.remove("London");

        bag.forEach(System.out::println);

        if (bag.contains("athens")) System.out.println("true");
    }
}
