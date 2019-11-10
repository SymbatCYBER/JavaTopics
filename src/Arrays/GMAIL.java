package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GMAIL {
    public static void main(String[] args) {
//        String [] emails = {"Jamesbond3@gmail.com", "notvalid@.com", "Adam5@yahoo.com", "Fran2113gmailcom", "JamieMyahoo.com"};
//        for(int i=0; i < emails.length; i++) {
//            if(emails[i].contains("@") && emails[i].contains(".")) {
//                int at = emails[i].indexOf("@");
//                int dot = emails[i].indexOf(".");
//                if(at < dot) {
//                    System.out.println(emails[i] + " Valid");
//                } else {
//                    System.out.println(emails[i] + " Invalid");
//                }
//            } else {
//                System.out.println(emails[i] + " Invalid");
//            }
//        }


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cars");
        int size = input.nextInt();
        input.nextLine();
        String [] myCars = new String[size];
        for(int i= 0; i < myCars.length; i++) {
            System.out.println("Enter car " + (i+1));
            String car = input.nextLine();
            myCars[i] = car;
        }
        System.out.println(Arrays.toString(myCars));






    }
}
