package CollectionFrameWork;

import java.util.*;

public class Task2forIteriter {
    public static void main(String[] args) {
        Set<String> col = new HashSet<>();
        Collections.addAll(col, "red", "yellow", "black", "pink");


        Set<String> color = new HashSet<>();
        Collections.addAll(color, "red", "green", "black", "white");


        String sameColor = "";
        for (String a : col) {

            if (color.contains(a)) {
                sameColor += a + " ";
            }
        }
        System.out.println(sameColor);


    }
}