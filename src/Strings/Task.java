package Strings;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = "We will have a picnic when the  weather gets nicer";

        System.out.println(word );

        System.out.println(" what do you wanna change ");
        String  change = input.nextLine();
        System.out.println("what do you wanna change  that do");
        String replace = input.nextLine();
        String newWord = word.replace(change,replace);
        System.out.println(newWord);



    }
}
