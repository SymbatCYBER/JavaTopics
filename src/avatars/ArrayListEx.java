package avatars;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(2, 7);
        System.out.println(list);
        if (list.get(0) % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("not even");
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        for (int num : list) {
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odddddd");
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(0);//it will delete
            } else {
                System.out.println("odd");
            }
        }
















    }
}
