package CodingBat;

import ExceptionsPAC.A;

import java.util.ArrayList;

public class ReturnBiggestPalindrome {
//2) Create a method that will accept an
// ArrayList of Strings.
// Return the biggest Palindrome.


    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("aga"); words.add("racecar"); words.add("cars");
        words.add("water"); words.add("esdfgfdse");words.add("tenet");
        System.out.println(biggestPalindrome(words));
    }
    public static String biggestPalindrome (ArrayList<String> words) {
        String palindrome = "";
        for(String word: words) {
            if(isPalindrome(word) && word.length() > palindrome.length()){
                palindrome = word;
            }
        }
        return palindrome;
    }
    static boolean isPalindrome(String word) {
        return new StringBuilder(word).reverse().toString().equals(word);
    }



}
