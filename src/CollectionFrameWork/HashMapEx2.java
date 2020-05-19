package CollectionFrameWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 30);
        map.put(2, 30);
        map.put(3, 40);
        map.put(4, 50);


        Set<Integer> set = new HashSet<>();// does not allow duplicates
        for(Integer key: map.keySet()){
          set.add(map.get(key));

        }
        System.out.println(set);






    }
}
