package lesson_16_03_23;
/*todo шаг2
    Дан массив пар, состоящий из двух строк с именами и фамилиями,
    отсортировать массив в возрастающем лексикографическом порядке имени,
    и если две строки одинаковы, отсортируйте их по фамилии
    Input:  { {"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"} }
    Output:  { {"abc", "last"}, {"pklz", "yelp"}, {"ppza", "xyz"}, {"rpng", "note"} }
 */
import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {

        String namePerson1 = person1.getName();
        String namePerson2 = person2.getName();
        return namePerson1.compareTo(namePerson2);
    }
}
