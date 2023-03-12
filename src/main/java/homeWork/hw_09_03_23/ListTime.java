package homeWork.hw_09_03_23;
/* TODO: 12.03.23
    создать List наполнить его 10М> элементами
    При наполнении списка  сохраняем i- тый элемент в переменную temp
    перебрать for-each loop
    classic for и вызываем list.size() для каждой итерации
    classic for, но list.size() определяем в переменную
    classic for, list.size() определяем в переменную, перебираем с конца (i--)
    используя Itertor
    используя ListIterator
    для всех случаев сделать замер времени
    результат вывести в консоль
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTime {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //Создаем пустой список
        long startTime;
        long endTime;
        //Записываем начало времени в переменную
        startTime = System.currentTimeMillis();
        //Заполняем список числами от 0 до 10 миллионов
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        //Записываем конец времени в переменную
        endTime = System.currentTimeMillis();
        //Выводим на экран значение разницы между концом и началом времени
        System.out.println("Classic for loop and call list.size() for each iteration " + (endTime - startTime));
        //Записываем начало времени в переменную
        startTime = System.currentTimeMillis();
        //Записываем размер списка в переменную
        int temp = list.size();
        //Перебираем список
        for (int i = 0; i < temp; i++) {
            list.get(i);
        }
        //Записываем конец времени в переменную
        endTime = System.currentTimeMillis();
        //Выводим на экран значение разницы между концом и началом времени
        System.out.println("Classic for loop, list.size() in variable " + (endTime - startTime));
        //Записываем начало времени в переменную
        startTime = System.currentTimeMillis();
        //Записываем размер списка в переменную
        temp = list.size();
        //Перебираем список с конца
        for (int i = temp - 1; i >= 0; i--) {
            list.get(i);
        }
        //Записываем конец времени в переменную
        endTime = System.currentTimeMillis();
        //Выводим на экран значение разницы между концом и началом времени
        System.out.println("Classic for loop, list.size() in variable, iterate backwards " + (endTime - startTime));
        //Записываем начало времени в переменную
        startTime = System.currentTimeMillis();
        //Создаем итератор
        Iterator<Integer> iterator = list.iterator();
        //Обходим список с помощью итератора
        while (iterator.hasNext()) {
            iterator.next();
        }
        //Записываем конец времени в переменную
        endTime = System.currentTimeMillis();
        //Выводим на экран значение разницы между концом и началом времени
        System.out.println("Iterator " + (endTime - startTime));
        //Записываем начало времени в переменную
        startTime = System.currentTimeMillis();
        //Создаем лист итератор
        ListIterator<Integer> listIterator = list.listIterator();
        //Обходим список с помощью лист-итератора
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        //Записываем конец времени в переменную
        endTime = System.currentTimeMillis();
        //Выводим на экран значение разницы между концом и началом времени
        System.out.println("List Iterator " + (endTime - startTime));
    }
}