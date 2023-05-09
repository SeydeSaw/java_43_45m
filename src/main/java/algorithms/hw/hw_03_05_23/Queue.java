package algorithms.hw.hw_03_05_23;
/* TODO: 09.05.23
    *****
    Классическая Queue - реализовать используя массив (Array)
    pushToEnd(int data) - вставляет элемент в конец queue
    remove() - удаляет элемент из начала queue
    peek() - возвращает элемент из начала не удаляя его
    isEmpty() - boolean
    size() - int
    *****
    public class Queue
    private int[] arr;      // массив для хранения элементов queue
    private int head;      // head указывает на передний элемент в queue
    private int tail;       // tail часть указывает на последний элемент в queue
    private int capacity;   // максимальная емкость queue
    private int count;      // текущий размер queue
    *****
    Конструктор для инициализации queue
    public Queue(int size)
    {
        arr = new int[size];
        capacity = size;
        count = 0;
    }
 */

public class Queue {
    private int[] arr;//массив для хранения элементов queue
    private int head;//индекс указывает на передний элемент в queue(очереди)
    private int tail;//индекс указывает на последний элемент в queue
    private int capacity;//максимальный размер очереди
    private int count;//текущее размер/количество элементов в очереди

    //Конструктор для инициализации queue
    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        count = 0;
        head = 0;
        tail = -1;
    }

    //добавляем элемент в конец очереди
    public void pushToEnd(int data) {
        if (isFull()) {//Если очередь заполнена
            throw new RuntimeException("Queue is full");//выбрасывает исключение
        }
        tail = (tail + 1) % capacity;//Увеличивает переменную tail на 1 по модулю capacity
        arr[tail] = data;//присваивает новое значение в массив arr
        count++;//Увеличивает переменную count на 1
    }

    //удаляем элемент из начала очереди и возвращаем его значение
    public int remove() {
        if (isEmpty()) {// Если очередь пуста
            throw new RuntimeException("Queue is empty");//выбрасывает исключение
        }
        int removed = arr[head];//Присваивает значение первого элемента очереди arr[head] в переменную removed
        head = (head + 1) % capacity;//Увеличивает переменную head на 1 по модулю capacity
        count--;//Уменьшает переменную count на 1
        return removed;//Возвращает значение removed
    }

    //возвращаем значение элемента в начале очереди, но не удаляем его
    public int peek() {
        if (isEmpty()) {//Если очередь пуста
            throw new RuntimeException("Queue is empty");//выбрасывает исключение
        }
        return arr[head];//Возвращает значение первого элемента очереди arr[head]
    }

    //метод проверяет, пуста ли очередь
    public boolean isEmpty() {//равно ли значение переменной count количеству элементов в очереди
        return count == 0;//равен нулю, то очередь пуста, и метод возвращает true, иначе false
    }

    // метод проверяет, заполнена ли очередь
    public boolean isFull() {//проверяет, равно ли значение переменной count вместимости очереди
        return count == capacity;//равен capacity, то очередь заполнена, и метод возвращает true, иначе false
    }

    //метод для получения размера очереди
    public int size() {
        return count;//возвращает количество элементов в очереди, которое хранится в переменной count
    }
}