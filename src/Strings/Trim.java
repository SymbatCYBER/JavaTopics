package Strings;

import java.util.Scanner;

public class Trim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter your name ");
        String name = input.nextLine().trim();
         String name2 = input.nextLine().trim();
        String last1 = name.substring(name.indexOf("") +1 );
         String last2 = name2.substring(name2.indexOf("")+1);

        if(last1.equals(last2)) {
            System.out.println("relatives");
        } else {
            System.out.println("not relatives");
        }

    }
}
