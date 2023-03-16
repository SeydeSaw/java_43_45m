package lesson_16_03_23;
/*todo шаг 2 для String
    Дан массив пар, состоящий из двух полей строкового
    и целочисленного типов,отсортировать массив в возрастающем
    лексикографическом порядке, и если две строки одинаковы,
    отсортируйте их на основе их целочисленного значения.
    Input:  { {"abc", 3}, {"a", 4}, {"bc", 5}, {"a", 2} }
    Output:  { {"a", 2}, {"a", 4}, {"abc", 3}, {"bc", 5} }
 */
import java.util.Comparator;

public class PairStringComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair pair1, Pair pair2) {

        return pair1.getWord().compareTo(pair2.getWord());

    }
}
