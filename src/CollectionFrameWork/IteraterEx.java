package CollectionFrameWork;

import java.util.*;

public class IteraterEx {
    public static void main(String[] args) {
        Set<String > names = new HashSet<>();
        names.add(" James");
        names.add(" Joe");
        names.add(" Adam");
        names.add(" BEN");

Iterator<String> it = names.iterator();

while (it.hasNext()){

    String name =it.next();
    System.out.println(name );
    if(name.equals("BEN")){
        it.remove();
    }
}
        System.out.println(names );


    }





}
