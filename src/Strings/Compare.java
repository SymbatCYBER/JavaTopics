package Strings;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter your word ");
        String word= input.nextLine();
        String word2 = input.nextLine();


        System.out.println(word.compareTo(word2));

    }
}
