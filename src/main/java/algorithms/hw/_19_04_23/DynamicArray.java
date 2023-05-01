package algorithms.hw._19_04_23;

public class DynamicArray implements Dynamic {
    private int[] array;
    private int count;
    private int size;

    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;
    }

    public DynamicArray(int size) {
        array = new int[size];
        count = 0;
        this.size = size;
    }

    @Override
    public void add(int index, int data) {//добавляет элемент в конец
        if (count + 1 > size) {
            growSize();
        }

        for (int i = count; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = data;
        count++;
    }

    @Override
    public void addAt(int data) {//добавляет элемент по индексу, при этом, если это происходит в середине,
                                // то все остальные элементы сдвигаются на 1 вправо
        if (count + 1 > size) {
            growSize();
        }

        array[count] = data;
        count++;
    }

    @Override
    public void remove(int data) {//удаляет первое вхождение элемента в массив,
                                    // все остальные элементы справа,сдвигаются на 1 влево
        for (int i = 0; i < count; i++) {
            if (array[i] == data) {
                removeAt(i);
            }
        }
    }

    @Override
    public void removeAt(int index) {//удаляет элемент по индексу, все остальные элементы справа, сдвигаются на 1 влево
        for (int i = index; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;

        if (count <= size / 2) {
            shrinkSize();
        }
    }

    @Override
    public void growSize() {// удваивает размер массива (capacity)
        size *= 2;
        int[] newArray = new int[size];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    @Override
    public void shrinkSize() {//уменьшает размер массива до количества элементов (capacity = size)
        size /= 2;
        int[] newArray = new int[size];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    @Override
    public void set(int index, int data) {//заменяет значения элемента по указанному индексу
        array[index] = data;
    }

    @Override
    public int get(int index) {//возвращает элемент по указанному индексу (должна быть обработка,
                                // если capacity позволяет добраться до этого элемента, а size - нет)
        return array[index];
    }

    @Override
    public void clear() {//удаляет все элементы из массива возвращая массив исходной длины (длина по умолчанию)
        array = new int[1];
        count = 0;
        size = 1;
    }

    @Override
    public boolean contains(int data) {//возвращает true/false - если элемент есть в массиве
        for (int i = 0; i < count; i++) {
            if (array[i] == data) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {//возвращает true/false - если в массиве есть что-то
        return count == 0;
    }

    @Override
    public int size() {//возвращает текущее значение поля count, которое хранит количество элементов в коллекции
        return count;
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        System.out.println("Is empty: " + dynamicArray.isEmpty());// вывод в консоль сообщения о том, что массив пустой
        System.out.println("Size: " + dynamicArray.size());// вывод в консоль размера массива

        // добавление в массив трех элементов
        dynamicArray.addAt(5);
        dynamicArray.addAt(7);
        dynamicArray.addAt(11);

        // проверка пустоты и размера массива после добавления элементов
        System.out.println("Is empty: " + dynamicArray.isEmpty());
        System.out.println("Size: " + dynamicArray.size());

        // вывод в консоль трех элементов массива
        System.out.println("Массив после добавления 3-ёх элементов: ");
        System.out.println("Get 0: " + dynamicArray.get(0));
        System.out.println("Get 1: " + dynamicArray.get(1));
        System.out.println("Get 2: " + dynamicArray.get(2));

        dynamicArray.add(1, 9);// добавление в массив четвертого элемента на позицию 1

        // проверка элементов массива после добавления четвертого элемента
        System.out.println("Массив после добавления 4-ого элемента: ");
        System.out.println("Get 0: " + dynamicArray.get(0));
        System.out.println("Get 1: " + dynamicArray.get(1));
        System.out.println("Get 2: " + dynamicArray.get(2));
        System.out.println("Get 3: " + dynamicArray.get(3));

        dynamicArray.removeAt(1);// удаление из массива элемента с позиции 1

        // проверка элементов массива после удаления элемента
        System.out.println("Массив после удаления элемента: ");
        System.out.println("Get 0: " + dynamicArray.get(0));
        System.out.println("Get 1: " + dynamicArray.get(1));
        System.out.println("Get 2: " + dynamicArray.get(2));

        dynamicArray.remove(11);// удаление из массива элемента со значением 11

        // проверка элементов массива после удаления элемента
        System.out.println("Массив после удаление элемента: ");
        System.out.println("Get 0: " + dynamicArray.get(0));
        System.out.println("Get 1: " + dynamicArray.get(1));

        dynamicArray.clear();// очистка массива

        // проверка пустоты и размера массива после очистки
        System.out.println("Is empty: " + dynamicArray.isEmpty());
        System.out.println("Size: " + dynamicArray.size());
    }
}