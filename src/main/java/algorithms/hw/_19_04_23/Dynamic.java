package algorithms.hw._19_04_23;

public interface Dynamic {
    void add(int index, int data);//добавляет элемент по указанному индексу
    void addAt(int data);//добавляет элемент в конец списка
    void remove(int data);//удаляет элемент из списка
    void removeAt(int index);//удаляет элемент с указанным индексом
    void growSize();//увеличивает размер списка
    void shrinkSize();// уменьшает размер списка
    void set(int index, int data);//заменяет элемент с указанным индексом на новый
    int get(int index);//получает элемент с указанным индексом
    void clear();//очищает список
    boolean contains(int data);//проверяет наличие элемента в списке
    boolean isEmpty();//проверяет пуст ли список
    int size();//возвращает размер списка
}