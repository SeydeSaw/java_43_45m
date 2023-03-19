package homeWork.hw_16_03_23;
/*TODO: 19.03.23
       Создать класс Book с полями title, author и price.
       Создать TreeSet с объектами класса Book и
       отсортировать его по цене в порядке убывания
 */
import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book>{
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        return book.price - this.price;
    }

    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();

        books.add(new Book("Роковой подарок", "Устинова Татьяна", 24));
        books.add(new Book("Виновный всегда боится", "Чейз Джеймс", 9));
        books.add(new Book("Тайна кота Бразилио", "Калинина Дарья", 8));
        books.add(new Book("Отдалённые последствия", "Маринина Александра", 23));
        books.add(new Book("Подражатель", "Коул Дэниел", 18));

        System.out.println("Список книг в порядке убывания :\n" + books);
    }
}