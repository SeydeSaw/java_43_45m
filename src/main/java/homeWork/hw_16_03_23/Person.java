package homeWork.hw_16_03_23;
/*TODO: 19.03.23
       Создать класс Person с полями name и age.
       Создать ArrayList с объектами класса Person и
       отсортировать его по возрасту в порядке возрастания
 */
import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        //сортировка по возрасту
        return this.age - person.age;
    }

    public static void main(String[] args) {
        // Создание массива
        ArrayList<Person> persons = new ArrayList<>();
        // Добавление объектов в список
        persons.add(new Person("Елена", 23));
        persons.add(new Person("Екатерина", 20));
        persons.add(new Person("Алексей", 19));
        persons.add(new Person("Никита", 25));

        System.out.println("Неотсортированный список:\n" + persons);
        Collections.sort(persons);
        System.out.println("Отсортированный список в порядке возрастания:\n" + persons);
    }
}