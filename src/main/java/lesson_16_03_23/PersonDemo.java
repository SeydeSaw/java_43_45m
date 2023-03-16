package lesson_16_03_23;
/*todo шаг3
    Дан массив пар, состоящий из двух строк с именами и фамилиями,
    отсортировать массив в возрастающем лексикографическом порядке имени,
    и если две строки одинаковы, отсортируйте их по фамилии
    Input:  { {"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"} }
    Output:  { {"abc", "last"}, {"pklz", "yelp"}, {"ppza", "xyz"}, {"rpng", "note"} }
 */
import java.util.Set;
import java.util.TreeSet;

public class PersonDemo {
    public static void main(String[] args) {
        PersonComparator personComparator = new PersonComparator();
        Set<Person> people = new TreeSet<Person>(personComparator);
        people.add(new Person("abc", "last"));
        people.add(new Person("pklz", "yelp"));
        people.add(new Person("rpng", "note"));
        people.add(new Person("ppza", "xyz"));

        System.out.println(people);
    }
}
