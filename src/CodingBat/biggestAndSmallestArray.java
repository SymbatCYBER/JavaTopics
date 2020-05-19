package CodingBat;

import java.lang.reflect.Array;

public class biggestAndSmallestArray {
    //Given an array of numbers,
    // find and print and smallest
    // and the largest number

    //input 3, -8, 0, 4, -1

    public static void main(String[] args) {
       int [] a = {3, -8,  0,-1  } ;
       findBigAndSmall(a);
        int [] b = { -500, -20, 30, 200, 300 } ;
        findBigAndSmall(b);

    }

    public static void findBigAndSmall(int [] nums ){
     int big = Integer.MIN_VALUE;
     // nums[0]
        int small=Integer.MAX_VALUE;
        for(int num: nums){
            if(num> big){
                big=num;

            }else if (num<small){
                small=num;

            }
        }

        System.out.println("biggest num" +big );
        System.out.println("Smallest num "+small );



    }





}
