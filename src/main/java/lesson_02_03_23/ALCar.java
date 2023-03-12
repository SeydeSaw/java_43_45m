package lesson_02_03_23;

import java.util.ArrayList;
import java.util.List;

public class ALCar {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(5,1300,"Audi"));
        list.add(new Car(2,1300,"Volvo"));
        list.add(new Car(1,1300,"Mercedes"));

        System.out.println(list);
        System.out.println(transform(list));
    }
    public static List<Car> transform(List<Car> list){
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge() < 4)
                result.add(list.get(i));
        }
        return result;
    }

}