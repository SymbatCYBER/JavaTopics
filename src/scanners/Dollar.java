package scanners;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.util.Scanner;

public class Dollar {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
//        System.out.println("enter number 1");
//        int number1  = input.nextInt();
//        System.out.println( "enter number2");
//        int number2= input.nextInt();
//        System.out.println( "enter number3");
//        int number3 = input.nextInt();
//           int avg =number1+number2+number3;
//      //     avg = avg/3;
//        avg /= 3;
//
//
//        System.out.println(" summery" + avg);


//        System.out.println( "enter your age ");
//        int age1 =input.nextInt();
//        System.out.println("enter your addres");
//        int address = input.nextInt();
//        System.out.println( "enter your  mile that you run");
//        int run = input.nextInt();
//        int avgs = age1+address+run;
//        avgs /=3;


//        System.out.println( "give me number"+ avgs);


//        System.out.println( " how many Female 70");
//        int Female = input.nextInt();
//        System.out.println( "how many Male 30");
//        int Male = input.nextInt();
//        System.out.println( "HOW MAY Aplles 85 ");
//        int AppleFem =input.nextInt();
//        System.out.println( "how many in Male " );
//        int AppleMel= input.nextInt();
//        int ave

// short chairs = 5;
//        int moreCh=10;
//        int lessCh = 3;
//        int chair = moreCh+lessCh*chairs;
//        chair-=chairs;
//        System.out.println( chair );
//        System.out.println( "today's chairs" + lessCh);



//       String name = input.nextLine();
//        System.out.println( " givenName " );
//       char gender = input.nextLine().charAt(0);
//        System.out.println(  " givenGender");
//       int age =input.nextInt();
//        System.out.println("givenAge");
//       long numberPh = input.nextLong();
//        System.out.println( "3104305345");
//       double gpa = input.nextDouble();
//        System.out.println( "Dubai");


        int s = input.nextInt();
        int s2 =input.nextInt();
        int count = 0;
        s += s2;
        count++;

        System.out.println("firstNumber:" + s + "after being incremented " + s2 + " "  + count + " time") ;


        s += s2;
        count++;


        System.out.println("firstNumber:" + s + "after being incremented " + s2 + " "  + count + " time") ;
        s += s2;
        count++;


        System.out.println("firstNumber:" + s + "after being incremented " + s2 + " "  + count + " time") ;

        System.out.println( " enter your number");
        int sym= input.nextInt();
        int sym2 = input.nextInt();
        boolean sym3 = sym >sym2;
        System.out.println( sym3);


        System.out.println(" enter");
        boolean check= input.nextBoolean();
        System.out.println(!check);





    }


}




