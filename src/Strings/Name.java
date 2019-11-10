package Strings;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name ");
        String name = input.nextLine();

        if (name.charAt(0) == 'a' || name.charAt(0) =='z') {
        System.out.println(" Your name is cool");
        }else {
            System.out.println("Sorry not a cool name");
        }
    }
}
