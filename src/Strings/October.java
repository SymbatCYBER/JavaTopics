package Strings;

import java.util.Scanner;

public class October {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String month = "October";

        System.out.println(" Enter the month");
        String user = input.nextLine();
        boolean check = month.equalsIgnoreCase("october");
        System.out.println(check);

    }
}
