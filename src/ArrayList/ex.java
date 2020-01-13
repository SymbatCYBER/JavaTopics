package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ex {
    public static void main(String[] args) {
        ArrayList <String[]> list= new ArrayList<String[]>();

        String[]arr1= {"a","b","s"};
        String[]arr2 ={"1", "2","3","4"};
        list.add(arr1);
        list.add(arr2);
        for(String [] strARR: list){
            System.out.println(Arrays.toString(strARR));
        }
    }
}
