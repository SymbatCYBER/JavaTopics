package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  [] numbers = {4,-2,-5,-3,-20,30};



        for (int i = 0; i <= numbers.length; i++) {
            if (numbers [i] < 0) {
                numbers[i] =0;
            }




        }
//        System.out.println(Arrays.toString(numbers));
//
//
//        int [] numbers = {4, 33, 6, 1, 8, 3};
//        // Traditional loop
//        for(int i = 0; i < numbers.length; i++) {
//            if(numbers[i] % 2 == 0) {
//                System.out.println(numbers[i]);
//            }
//        }
//        System.out.println();
//        // For each loop
//        for(int number: numbers) {
//            if(number % 2 == 0) {
//                System.out.println(number);
//            }
//        }
//        System.out.println();
//        String [] names = {"adam","james","bob"};
//        for(String name: names) {
//            if(name.contains("a")) {
//                System.out.println(name);
//            }
//        }











    }
}
