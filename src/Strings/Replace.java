package Strings;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String str = in.nextLine();
//        int am = str.indexOf("am") +3;
//        int years = str.indexOf("years");
//        String age = str.substring(am, years -1 );
//        int ageNum = Integer.valueOf(age);
//        ageNum +=5;
//        System.out.println("in 5 years ");

     String name= in.nextLine();
     String name2 = in.nextLine();
     String email =" ";
      if (name.length() >= 6 && name2 .length() >= 6 ){
          email= name.substring(0,4);
          email += name2.substring(name2.length() - 3);
          email += "@cybertek.com";
          System.out.println(email);

      }else {
          System.out.println("invalid lengths");

      }


     }






       }







