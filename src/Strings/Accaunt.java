package Strings;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Accaunt {
    public static void main(String[] args) {
//       for ( int i = 0; i < 5; i ++){
//           System.out.println(" hello world");
//
////       }

        Scanner input = new Scanner (System.in);
String name = input.nextLine();
        for ( int i = 0; i < 15 ;  i++) {

            System.out.println(" Welcome, Symbat");
        }
            System.out.println();


      for (int i = 0; i < name.length();i++  ){
          System.out.println(name.charAt(i) + " for index " + i );

      }






        }







   }

