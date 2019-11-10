package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class REpliT {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        for (int i = 0; i < words.length; i++){
            words[i]=words[i].charAt(0)+ "" +  words[i].charAt(words[i].length()-1);
            System.out.println(words[i]);
        }
//            Scanner input = new Scanner(System.in);
//            int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
//            Arrays.sort(nums);
//            for (int i =0; i<nums.length-1; i+=2 ) {
//                if (nums [i] !=  nums[i+1]){
//                    System.out.println(nums[i]);
//                   return;
//                }
//            }
//        System.out.println(nums[6]);
    }
}
