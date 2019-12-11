package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);


        System.out.println("Welcome to divid my array");
        System.out.println("enter the size");
        int num =in.nextInt();
        System.out.println("enter the numbers of  Array");
        int [] numbers =new int[num];

        for(int i=0; i<num; i++){
          numbers[i]= in.nextInt();}
            System.out.println("The string value of the Array"+ Arrays.toString(numbers));


        int [] part1 = Arrays.copyOfRange(numbers,0, numbers.length/2);
        int [] part2 = Arrays.copyOfRange(numbers, numbers.length/2,numbers.length);

        System.out.println("The first half of your array is: " + Arrays.toString(part1));
        System.out.println("The second half of your array is: " + Arrays.toString(part2));
        }
    }

