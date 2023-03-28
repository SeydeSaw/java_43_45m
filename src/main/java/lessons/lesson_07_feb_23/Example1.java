package lessons.lesson_07_feb_23;

public class Example1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Janna");
        student1.setNumber(18);
        System.out.println(student1);

        Student student2 = new Student();
        student2.setName("Maria");
        student2.setNumber(19);
        System.out.println(student2);

        Student student3 = new Student("Karl", 20);
        System.out.println(student3);

        Student student4 = new Student();
        student4.setName("Katja");
        student4.setNumber(18);
        System.out.println(student4);
    }
}
class Student {

    String  name;
    int number;

    public Student() {
    }

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return name + " " + number;
    }
}