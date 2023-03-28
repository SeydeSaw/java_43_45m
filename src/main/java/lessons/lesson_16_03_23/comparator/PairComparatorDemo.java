package lessons.lesson_16_03_23.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PairComparatorDemo {
    public static void main(String[] args) {

        Comparator<Pair> comparatorPair = new PairStringComparator().thenComparing(new PairIntComparator());
        Set<Pair> ourPairCollection = new TreeSet<>(comparatorPair);
        ourPairCollection.add(new Pair("Alex", 25));
        ourPairCollection.add(new Pair("Boris", 20));
        ourPairCollection.add(new Pair("Boris", 35));
        ourPairCollection.add(new Pair("Alex", 18));
        ourPairCollection.add(new Pair("Zigmund", 42));
        ourPairCollection.add(new Pair("Andrew", 20));

        System.out.println(ourPairCollection);

    }
}