package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayString {

    public static void main(String[] args) {


    }
       public static  void numbers(int [] arr ) {
        String result = "[";

        for (int num : arr  ){
            result+=num + " ,  ";

            }
        result = result.substring(0,result.length()-2)+"]";
           System.out.println(result);
        }

        }


