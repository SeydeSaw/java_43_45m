package lessons.lesson_02_03_23;

public class Car {
    public Car(int age, int weight, String name) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    String name;
    int age;
    int weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                 name +
                ", " + age +
                ", " + weight +
                '}';
    }
}
