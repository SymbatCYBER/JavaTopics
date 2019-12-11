package MutableAndImmutable;

import java.util.ArrayList;

public class ArrayLISTrETURNmiddleChar {
    public static ArrayList<String> insertWord(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() % 2 == 0) {
                StringBuilder sb = new StringBuilder(list.get(i));

                sb.insert(list.get(i).length() / 2, "Hello");

                list.set(i, sb.toString());
            }
        }
        return list;
    }


    public static ArrayList<String> insertWord(ArrayList<String> list, String second) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() % 2 == 0) {
                StringBuilder sb = new StringBuilder(list.get(i));

                sb.insert(list.get(i).length() / 2, second);

                list.set(i, sb.toString());
            }
        }
        return list;
    }
}