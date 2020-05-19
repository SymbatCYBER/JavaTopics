package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map <String, Integer> gradeSCale=new HashMap<>() ;
        gradeSCale.put("A", 90);
        gradeSCale.put("B", 80);
        gradeSCale.put("C",70);
        gradeSCale.put("D",60);
        gradeSCale.put("F",50);
        gradeSCale.put("F",60);

        System.out.println(gradeSCale.get("A"));
        System.out.println(gradeSCale.get("F"));
        Set<String>keys=gradeSCale.keySet();// how you gonna store
         for(String key: gradeSCale.keySet()) { // you will take what your keys
             if(key.equals("C")) {
                 System.out.println(key);


             }


         }
    }
}
