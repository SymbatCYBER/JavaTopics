package utilities;

import java.util.ArrayList;

public class Schoolsystem {
    public static void main(String[] args) {
//   ArrayList<String>k= MyCollection.getStringList();
//        System.out.println("\n"+ k);
        ArrayList<String> list = new ArrayList<>();
        list.add("Jone");
        list.add("Symbat");
        list.add("Meergul");
        list.add("Aliana");
        list.add("Almat");
        list.add("Jone");
        list.add("Symbat");
        System.out.println(list+"\n");
        ArrayList<String> k = MyCollection.removeDuplicates(list);
        System.out.println(k);
        MyCollection.getStringList();

    }
}
