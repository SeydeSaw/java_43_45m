package lesson_02_03_23;

import java.util.ArrayList;
import java.util.List;

/*
3.у вас есть список значений String ,
и вы должны вернуть список длины каждого из этих значений String .
 */
public class ALS2 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("3. у вас есть список значений String,");
        stringList.add("и вы должны вернуть список длины каждого из этих ");
        stringList.add("значений String.");

        System.out.println(stringList);
        System.out.println(transform4(stringList));
    }

    public static List<Integer> transform4(List<String> list) {
        List<Integer> result = new ArrayList<>();

        for (String s : list)
            result.add(s.length());

        return result;
    }
}
