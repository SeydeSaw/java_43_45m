package lesson_16_03_23;
/*todo шаг 3
    Дан массив пар, состоящий из двух полей строкового
    и целочисленного типов,отсортировать массив в возрастающем
    лексикографическом порядке, и если две строки одинаковы,
    отсортируйте их на основе их целочисленного значения.
    Input:  { {"abc", 3}, {"a", 4}, {"bc", 5}, {"a", 2} }
    Output:  { {"a", 2}, {"a", 4}, {"abc", 3}, {"bc", 5} }
 */
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PairDemo {
    public static void main(String[] args) {
        Comparator<Pair> pairComparator = new PairStringComparator().thenComparing(new PairIntComparator());
        Set<Pair> pairs = new TreeSet<Pair>(pairComparator);
        pairs.add(new Pair("abc",3));
        pairs.add(new Pair("a",4));
        pairs.add(new Pair("bc",5));
        pairs.add(new Pair("a",2));

        System.out.println(pairs);
    }
}
