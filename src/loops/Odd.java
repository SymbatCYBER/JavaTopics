package loops;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
Scanner input = new Scanner (System.in);
//        String name = input.nextLine();
//        for ( int i = 0; i < 50 ;  i++) {
//
//            System.out.println(" Welcome, Symbat");


//        for  (int i = 0;  i<= 50; i++  ){
//            if (i % 2 ==1 ){
//                System.out.println(i);
//            }else {
//                System.out.println(" even number here ");
//            }
//        }


//        for (int i = 0; i <= 5 ; i++){
//        System.out.println(" please enter name " +i);
//         String name = input.nextLine();
//            System.out.println(name);
//  }

      for (; ; ){

          String userINput= input.nextLine();
          if (userINput.equalsIgnoreCase("hi")){
              System.out.println("hello");
          }else if (userINput.equalsIgnoreCase("bye")){
              System.out.println(" good bye");
          }else {
              System.out.println("bye forever ");
          }
      }



    }
}
