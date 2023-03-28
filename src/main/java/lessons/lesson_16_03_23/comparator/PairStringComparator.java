package lessons.lesson_16_03_23.comparator;

import java.util.Comparator;

public class PairStringComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair pair1, Pair pair2) {
        return pair1.getOurString().compareTo(pair2.getOurString());
    }
}