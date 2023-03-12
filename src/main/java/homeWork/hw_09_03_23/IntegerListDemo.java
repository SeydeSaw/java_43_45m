package homeWork.hw_09_03_23;
/* TODO: 12.03.23
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

    //создание пустого списка целых чисел
    private static final ArrayList<Integer> numList = new ArrayList<>();

    // метод добавления элемента в начало списка
    public static void addElementToBeginning(int element) {
        numList.add(0, element);
    }

    // метод добавления элемента в конец списка
    public static void addElementToEnd(int element) {
        numList.add(element);
    }

    // метод для определения длины списка
    public static int getLength() {
        return numList.size();
    }

    // метод удаления элемента из списка по индексу
    public static void removeElementByIndex(int index) {
        numList.remove(index);
    }

    // метод удаления элемента из списка без указания индекса
    public static void removeElement(int element) {
        numList.remove((Integer) element);
    }

    // метод для определения пустой ли список и вывода сообщения на экран
    public static void isEmpty() {
        if (numList.isEmpty()) {
            System.out.println("Список пустой");
        } else {
            System.out.println("Список заполнен");
        }
    }

    //метод для обхода списка и вывода его элементов на экран
    public static void loopThroughList() {
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
        // добавление двух элементов в начало списка
        addElementToBeginning(1);

        // добавление двух элементов в конец списка
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
        loopThroughList();
    }
}