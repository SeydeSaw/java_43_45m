package homeWork.hw_09_03_23;


import java.util.ArrayList;
import java.util.List;
/* TODO: 12.03.23
        Могут ли реализации интерфейса java.util.List хранить одинаковые
        элементы (дубликаты)? Напишите код программы,
        который демонстрирует ответ на этот вопрос.
 */
public class ListDuplicates {

    public static void main(String[] args) {
        // создаем новый лист с типом данных Integer
        List<Integer> list = new ArrayList<>();
        // добавляем элемент
        list.add(1);
        list.add(1);
        list.add(2);
        // выводим список на экран
        System.out.println("List: " + list);
        // проверяем, может ли интерфейс List хранить одинаковые элементы
        if (list.contains(1)) { // проверяем, содержит ли лист элемент 1
            System.out.println("List может содержать дубликаты"); // выводим на экран
        }
    }
}