package algorithms.hw.hw_22_03_23;
/*  TODO: 28.03.23
        Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
        Массив 1 - 100 112 256 349 770
        Массив 2 - 72 86 113 119 265 445 892
        к = 7
        Вывод : 256
        Окончательный отсортированный массив -
        72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
        7-й элемент этого массива равен 256.
 */
public class FindElement {
    public static int findElement(int[] m, int[] n, int k) {
        // Объявим два индекса для двух массивов, чтобы отслеживать позиции элементов в них
        int i = 0, j = 0;
        // Создадим переменную хранящую текущий элемент
        int currentElement = 0;
        // Пройдемся по обоим массивам до указанной позиции k
        while (i + j < k) {
            // Если мы достигли конца первого массива, то берем следующий элемент из второго массива
            if (i == m.length) {
                currentElement = n[j];
                j++;
                // Если мы достигли конца второго массива, то берем следующий элемент из первого массива
            } else if (j == n.length) {
                currentElement = m[i];
                i++;
                // В других случаях сравниваем два наименьших элемента из обоих массивов и берем меньший из них
            } else if (m[i] < n[j]) {
                currentElement = m[i];
                i++;
            } else {
                currentElement = n[j];
                j++;
            }
        }
        // Возвращаем результат
        return currentElement;
    }

    public static void main(String[] args) {
        // Объявляем два массива
        int[] m = new int[] {100, 112, 256, 349, 770};
        int[] n = new int[] {72, 86, 113, 119, 265, 445, 892};
        // Задаем нужную позицию
        int k = 7;
        // Находим 7-й элемент и выводим на консоль
        System.out.println("На позиции " + k + " находится число: " + findElement(m, n, k));
    }
}
