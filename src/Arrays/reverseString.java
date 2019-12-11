package Arrays;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {

        String sentance = "We went to picnic ";
        String[] words = sentance.split(" ");
        for(String word:words){
            for(int i=word.length()-1; i>=0; i--){
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }


    }
}
