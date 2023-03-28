package lessons.lesson_16_03_23;
/*todo шаг1
    Дан массив пар, состоящий из двух строк с именами и фамилиями,
    отсортировать массив в возрастающем лексикографическом порядке имени,
    и если две строки одинаковы, отсортируйте их по фамилии
    Input:  { {"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"} }
    Output:  { {"abc", "last"}, {"pklz", "yelp"}, {"ppza", "xyz"}, {"rpng", "note"} }
 */
public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
