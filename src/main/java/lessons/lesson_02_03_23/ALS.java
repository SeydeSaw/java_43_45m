package lessons.lesson_02_03_23;

import java.util.*;

// 1.у вас есть список строковых значений, и вы должны вернуть список со всеми
// этими строковыми значениями в нижнем регистре (или в верхнем регистре)
public class ALS {

    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Alex");
        listString.add("Maria");
        listString.add("Bob");
        System.out.println(listString);
        System.out.println(transform1(listString));
        System.out.println(transform(listString));
    }
    public static List<String> transform1(List<String> list){
        List<String> output = new ArrayList<>();
        for (String s : list)
            output.add(s.toUpperCase());
        return output;
    }
    public static List<String> transform(List<String> list) {

        for (int i = 0; i < list.size(); i++)
            list.set(i, list.get(i).toUpperCase());

        return list;
    }

}
