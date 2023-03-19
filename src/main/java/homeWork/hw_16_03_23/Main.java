package homeWork.hw_16_03_23;
/* TODO: 19.03.23
    1. Задача: Написать метод, который принимает на вход список (LinkedList) строк и
    возвращает новый список, состоящий только из уникальных значений из первоначального списка.
    2. Найти количество уникальных слов в тексте с помощью коллекции HashSet
    3, Создать множество HashSet и вывести элементы, у которых длина строки больше 5 символов
    4. Создать карту HashMap, в которой хранятся номера телефонов и фамилии людей.
    По номеру телефона вывести фамилию
    5. Написать метод, который принимает на вход два списка (LinkedList) и
    возвращает новый список, состоящий только из элементов, которые есть в обоих списках.
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем список строк
        List<String> list1 = new LinkedList<>();
        list1.add("Анна");
        list1.add("Пётр");
        list1.add("Мария");
        list1.add("Кирилл");
        list1.add("Анатолий");
        list1.add("Пётр");
        list1.add("Екатерина");
        list1.add("Анна");

        // Вызываем метод для получения уникальных строк из списка
        List<String> list2 = getUniqueList(list1);
        System.out.println("Список уникальных эементов: " + list2);

        //Вычисляем количество уникальных строк в списке с помощью HashSet
        Set<String> uniqueList = new HashSet<>(list1);
        System.out.println("Количество уникальных слов в списке: " + uniqueList.size());

        // Создаем множество HashSet и выводим элементы, у которых длина строки больше 5 символов
        Set<String> longWords = new HashSet<>();
        for (String str : list1) {
            if (str.length() > 5) {
                longWords.add(str);
            }
        }
        System.out.println("Элементы, у которых длина больше 5 символов: " + longWords);

        // Создаем карту HashMap и добавляем в нее телефоны и фамилии людей
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("+41762626364", "Иванов");
        phoneBook.put("+41765526334", "Булкин");
        phoneBook.put("+41767826534", "Петров");
        phoneBook.put("+41793626234", "Иванов");

        // Выводим фамилию по номеру телефона
        String phone = "+41767826534";
        String lastName = phoneBook.get(phone);
        System.out.println("Фамилия по номеру телефона " + phone + ": " + lastName);

        // Cоздаем два списка
        List<String> list3 = new LinkedList<>();
        list3.add("Анна");
        list3.add("Сергей");
        list3.add("Мария");
        list3.add("Антон");
        list3.add("Павел");
        list3.add("Екатерина");
        list3.add("Александр");

        List<String> list4 = new LinkedList<>();
        list4.add("Александр");
        list4.add("Анна");
        list4.add("Екатерина");
        list4.add("Сергей");

        // Вызываем метод для получения списка элементов, которые есть в обоих списках
        List<String> list5 = getDuplicatedList(list3, list4);
        System.out.println("Список элементов, которые есть в обоих списках: " + list5);
    }

    // Метод для получения уникальных элементов из списка
    private static List<String> getUniqueList(List<String> list1) {
        Set<String> uniqueList = new HashSet<>(list1);
        return new ArrayList<>(uniqueList);
    }

    // Метод для получения списка элементов, которые есть в обоих списках
    private static List<String> getDuplicatedList(List<String> list1, List<String> list2) {
        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);

        set1.retainAll(set2);
        return new ArrayList<>(set1);
    }
}