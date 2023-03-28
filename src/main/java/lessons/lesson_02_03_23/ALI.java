package lessons.lesson_02_03_23;

import java.util.ArrayList;
import java.util.List;

/*
у вас есть список значений int и вы должны вернуть список,
каждое значение которого умножается на 2
 */
public class ALI {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(22);
        listInt.add(13);

        System.out.println(listInt);
        System.out.println(transform2(listInt));
        System.out.println(listInt.get(1));
    }
    public static List<Integer> transform2(List<Integer> list) {
//        List<Integer> result = new ArrayList<>();

//        for (Integer i : list)
//            result.add(i * 2);
//
//        return result;

        for (int i = 0; i < list.size(); i++)
            list.set(i, list.get(i) * 2);

        return list;
    }

}
