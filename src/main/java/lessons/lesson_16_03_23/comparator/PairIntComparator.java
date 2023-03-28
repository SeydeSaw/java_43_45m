package lessons.lesson_16_03_23.comparator;

import java.util.Comparator;

public class PairIntComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair pair1, Pair pair2) {
        return pair1.getOurInteger() - pair2.getOurInteger();
    }
}