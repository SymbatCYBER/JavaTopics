package Arrays;

import java.util.Arrays;

public class SplitEx {
    public static void main(String[] args) {
        String str = " Java is programming Language";
        String [] regular = str.trim().toLowerCase().split("");
        char [] charArr = str.toCharArray();
        System.out.println( Arrays.toString(charArr));
        System.out.println(Arrays.toString(regular));








    }
}
