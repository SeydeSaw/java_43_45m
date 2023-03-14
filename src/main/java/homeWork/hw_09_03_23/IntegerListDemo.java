package homeWork.hw_09_03_23;
/* TODO: 14.03.23
        В классе IntegerListDemo создайте список целых чисел.
        Продемонстрируйте как:
        добавить в список элемент (в начало и в конец)
        узнать длину списка
        удалить элемент из списка (по индексу и без)
        узнать пустой список или нет
        обойти список и вывести на консоль каждый элемент.
 */

import java.util.ArrayList;

public class IntegerListDemo {

    //создаём пустой список целых чисел
    private static final ArrayList<Integer> numList = new ArrayList<>();

    // добавляем элемент в начало списка
    public static void addElementToBeginning(int element) {
        numList.add(0, element);
    }

    // добавляем элемент в конец списка
    public static void addElementToEnd(int element) {
        numList.add(element);
    }

    // определяем длину списка
    public static int getLength() {
        return numList.size();
    }

    // удаляем элемент из списка по индексу
    public static void removeElementByIndex(int index) {
        numList.remove(index);
    }

    // мудаляем элемент из списка без указания индекса
    public static void removeElement(int element) {
        numList.remove((Integer) element);
    }

    // определяем пустой ли список и выводим на экран
    public static void isEmpty() {
        if (numList.isEmpty()) {
            System.out.println("Список пустой");
        } else {
            System.out.println("Список заполнен");
        }
    }

    //проходим по списку и выводим его элементы на экран
    public static void getList() {
        if (numList.isEmpty()) {
            System.out.println("Список пустой");
        } else {
            for (Integer element : numList) {
                System.out.println("В списке еать число: " + element);
            }
        }
    }

    public static void main(String[] args) {
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        // добавление элемента в начало списка
        addElementToBeginning(1);

        // добавление элемента в конец списка
        addElementToEnd(7);

        // узнаем длину списка
        int length = getLength();
        System.out.println("Список состоит из " + length + " Элементов");

        // удаляем элемент из списка по индексу
        removeElementByIndex(2);

        // удаляем элемент из списка без указания индекса
        removeElement(4);

        // проверяем пустой ли список и выводим сообщение на экран
        isEmpty();

        // обходим список и выводим на консоль каждый элемент
        getList();
    }
}