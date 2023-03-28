package lessons.lesson_02_03_23;

import java.util.ArrayList;
import java.util.List;

// 1. у вас есть список значений int и вы должны вернуть список, содержащий
// только нечетные числa
public class ALI2 {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(22);
        listInt.add(10);
        listInt.add(13);
        listInt.add(8);

        System.out.println(listInt);
        System.out.println(transform2(listInt));

    }
    public static List<Integer> transform2(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 1) {
                //добавляем в наш список
                result.add(arr.get(i));
            }
        }
        return result;
    }
}
