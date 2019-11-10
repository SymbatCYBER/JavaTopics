package Arrays;


import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

    }

    public static void negavtivenumber(int [] arr, int change) {
        for (int i =0; i <arr.length; i++) {
            if (arr [i] <0) {
                arr [i] = change;
            }
        }
        System.out.println(Arrays.toString(arr));
    }




    }

