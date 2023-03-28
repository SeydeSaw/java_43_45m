package lessons.lesson_16_03_23.comparable;

import java.util.Set;
import java.util.TreeSet;

public class PairExample {
    public static void main(String[] args) {
        Set<Pair> ourSetCollection = new TreeSet<>();
        ourSetCollection.add(new Pair("Alex", 25));
        ourSetCollection.add(new Pair("Boris", 20));
        ourSetCollection.add(new Pair("Boris", 35));
        ourSetCollection.add(new Pair("Alex", 18));
        ourSetCollection.add(new Pair("Zigmund", 42));
        ourSetCollection.add(new Pair("Andrew", 20));

        System.out.println(ourSetCollection);

    }
}