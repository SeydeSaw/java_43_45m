package lesson_16_03_23;
/*todo шаг 1
    Дан массив пар, состоящий из двух полей строкового
    и целочисленного типов,отсортировать массив в возрастающем
    лексикографическом порядке, и если две строки одинаковы,
    отсортируйте их на основе их целочисленного значения.
    Input:  { {"abc", 3}, {"a", 4}, {"bc", 5}, {"a", 2} }
    Output:  { {"a", 2}, {"a", 4}, {"abc", 3}, {"bc", 5} }
 */
public class Pair {
    private String word;
    private  int nums;

    public Pair(String word, int nums) {
        this.word = word;
        this.nums = nums;
    }

    public String getWord() {
        return word;
    }

    public int getNums() {
        return nums;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "word='" + word + '\'' +
                ", nums=" + nums +
                '}';
    }
}
