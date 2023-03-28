package lessons.lesson_02_03_23;

import java.util.ArrayList;
import java.util.List;

/*
у вас есть список значений int и
вы должны вернуть их сумму сигмоид
Math.pow(Math.E, (-1)*x))
 */
public class ALI3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(32);
        list.add(3);

        System.out.println(transform(list));

    }
    public static double transform (List<Integer> list){
        double result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += 1/(1 + Math.pow(Math.E, (-1) * list.get(i)));
            System.out.println(result);
        }
        return result;
    }
}
