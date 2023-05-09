package algorithms.hw.hw_03_05_23;

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new Queue(5); // создаем очередь размером 5

        // добавляем элементы в очередь
        queue.pushToEnd(1);
        queue.pushToEnd(2);
        queue.pushToEnd(3);
        queue.pushToEnd(4);
        queue.pushToEnd(5);

        // выводим размера очереди
        System.out.println("Размер очереди: " + queue.size());

        // проверка на полноту очереди до изменений
        boolean full = queue.isFull();
        System.out.println("Очередь полна: " + full);

        // удалеяем первый элемент из очереди
        int removed = queue.remove();
        System.out.println("Удаленный элемент: " + removed);

        // выводим первый элемент очереди без удаления
        int peeked = queue.peek();
        System.out.println("Первый элемент в очереди: " + peeked);

        // проверка на пустоту очереди
        boolean empty = queue.isEmpty();
        System.out.println("Очередь пуста: " + empty);

        // удалеяем второй элемент из очереди
        int removed2 = queue.remove();
        System.out.println("Удаленный элемент: " + removed2);

        // удалеяем третий элемент из очереди
        int removed3 = queue.remove();
        System.out.println("Удаленный элемент: " + removed3);

        // удалеяем четвёртый элемент из очереди
        int removed4 = queue.remove();
        System.out.println("Удаленный элемент: " + removed4);

        // удалеяем пятый элемент из очереди
        int removed5 = queue.remove();
        System.out.println("Удаленный элемент: " + removed5);

        // проверка на пустоту очереди после удаления всех элементов
        boolean empty2 = queue.isEmpty();
        System.out.println("После удаления всех элементов, очередь пуста: " + empty2);

        // проверка на полноту очереди после удаления всех элементов
        boolean full2 = queue.isFull();
        System.out.println("После удаления всех элементов, очередь полна: " + full2);
    }
}
/*todo
    Результат:
    *****
    Размер очереди: 5
    Очередь полна: true
    Удаленный элемент: 1
    Первый элемент в очереди: 2
    Очередь пуста: false
    Удаленный элемент: 2
    Удаленный элемент: 3
    Удаленный элемент: 4
    Удаленный элемент: 5
    После удаления всех элементов, очередь пуста: true
    После удаления всех элементов, очередь полна: false
 */