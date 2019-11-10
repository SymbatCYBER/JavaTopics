package Random;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your sentence ");
        String sen =input.nextLine();

        int space = sen.indexOf(" ");
String firstword = sen.substring(0, space);
String remain = sen.substring(space + 1);
        System.out.println(remain + " " + firstword);

    }
}
