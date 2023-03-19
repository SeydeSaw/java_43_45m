package lesson_16_03_23.comparable;

import java.util.Set;
import java.util.TreeSet;

public class PairStringExample {
    public static void main(String[] args) {
        Set<PairString> ourSetCollection = new TreeSet<>();
        ourSetCollection.add(new PairString("Alex", "25"));
        ourSetCollection.add(new PairString("Boris", "20"));
        ourSetCollection.add(new PairString("Boris", "35"));
        ourSetCollection.add(new PairString("Alex", "118"));
        ourSetCollection.add(new PairString("Zigmund", "42"));
        ourSetCollection.add(new PairString("Andrew", "20"));

        System.out.println(ourSetCollection);

    }
}