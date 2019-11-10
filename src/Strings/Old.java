package Strings;

import java.util.Scanner;

public class Old {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

      String str = in.nextLine();
        int am = str.indexOf("am") +3;
        int years = str.indexOf("years");
        String age = str.substring(am, years -1 );
        int ageNum = Integer.valueOf(age);
        ageNum +=5;
        System.out.println("in 5 years ");




    }
}
